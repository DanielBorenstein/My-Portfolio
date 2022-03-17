from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import pandas as pd

class SearchEngine:
    def __init__(self):

        CHROME_DRIVER_LOCATION = 'D:/driver/chromedriver'
        self.driver = webdriver.Chrome(CHROME_DRIVER_LOCATION)
        # au faculty website
        self.firstnames,self.lastnames = self.name_list_maker()
        self.first_name = self.firstnames[0]
        self.last_name = self.lastnames[0]
    def search_url_maker(self,i):
        self.url_search = 'https://www.bing.com/search?q='
        self.rmp = "+rate+my+professor"
        self.url_search += self.firstnames[i] + "+" + self.lastnames[i] + self.rmp
        self.driver.get(self.url_search)
        self.professor_raw_url = self.driver.find_elements_by_xpath('//*[@id="b_results"]/li[1]/div[2]/div/cite')
        self.prof_url = ''
        for url in self.professor_raw_url:
            self.prof_url = url.text
        return self.prof_url

    def main(self):
        for i in range(0, len(self.firstnames)):
            the_good_stuff = self.search_url_maker(i)
            print(the_good_stuff)
            with open('links.txt', 'a') as f:
                f.write(the_good_stuff + "\n")

    def name_list_maker(self):
        # au faculty website
        url1 = 'https://bulletin.auburn.edu/undergraduate/faculty/'
        self.driver.get(url1)

        names = self.driver.find_elements_by_xpath('//*[@id="textcontainer"]/p')
        self.list_of_first_names =[]
        self.list_of_last_names =[]
        for name1 in names:
            name1 =  name1.text.title()
            name1 = name1.replace(",","")
            name1 = name1.replace("'","")
            name1 = name1.replace("*","")
            list_of_names = name1.split(' ')
            if list_of_names[0] != "Back":
                list_of_names[1].replace("*", "")
                list_of_names[1].replace(",", "")
                first_name = list_of_names[1]
                last_name = list_of_names[0]
                
                if len(last_name.replace(".",(""))) < 2:
                    last_name = list_of_names[1]
                elif len(first_name.replace(".",(""))) < 2:
                    first_name = list_of_names[2]
                self.list_of_first_names.append(first_name)
                self.list_of_last_names.append(last_name)   
                
        return self.list_of_first_names,self.list_of_last_names

s1 = SearchEngine()
s1.main()
    # #//*[@id="b_results"]/li[1]/div[1]/h2/a
    
    # url_of_prof = ''
    # for name1 in names:
        
    #     url_of_prof = name1.text