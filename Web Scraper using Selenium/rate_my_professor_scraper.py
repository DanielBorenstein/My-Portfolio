from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import pandas as pd
from selenium.webdriver.chrome.options import Options
import time
import random
# import org.openqa.selenium.chrome.ChromeOptions;
class RateMyProfessorScraper:

    def __init__(self):
        CHROME_DRIVER_LOCATION = 'D:/driver/chromedriver'
        
        chrome_options = Options()
        chrome_options.add_argument('--no-sandbox')
        chrome_options.add_argument('--disable-dev-shm-usage') 
        self.driver = webdriver.Chrome(CHROME_DRIVER_LOCATION,chrome_options = chrome_options)


        self.rmp_url_list = []
        with open('rmp-links.txt', 'r') as f:
            for line in f:
                temp = line
                temp = temp.replace('\n', '')
                self.rmp_url_list.append(temp)
        print(self.rmp_url_list)
        self.stat_aggregate()

    def stat_aggregate(self):
        for rmp_link in self.rmp_url_list:
            # CHROME_DRIVER_LOCATION = 'D:/driver/chromedriver'
        
            # chrome_options = Options()
            # chrome_options.add_argument('--no-sandbox')
            # chrome_options.add_argument('--disable-dev-shm-usage') 
            # self.driver = webdriver.Chrome(CHROME_DRIVER_LOCATION,chrome_options = chrome_options)



            current_url = rmp_link
            self.driver.get(current_url)
            time.sleep(random.randint(1,4))
            # current_rating = self.driver.find_elements_by_xpath('//*[@id="root"]/div/div/div[4]/div[1]/div[1]/div[1]/div[1]/div/div[1]')
            
            
            
            current_rating = []
            for rating in self.driver.find_elements_by_xpath('//*[@id="root"]/div/div/div[4]/div[1]/div[1]/div[1]/div[1]/div/div[1]'):
                current_rating.append(rating.text)
            # current_prof = self.driver.find_elements_by_xpath('//*[@id="root"]/div/div/div[4]/div[1]/div[1]/div[2]/div[1]/span[2]')
            
            current_prof_first = []
            for prof in self.driver.find_elements_by_xpath('//*[@id="root"]/div/div/div[4]/div[1]/div[1]/div[2]/div[1]/span[1]'):
                current_prof_first.append(prof.text)
            
            
            for prof in self.driver.find_elements_by_xpath('//*[@id="root"]/div/div/div[4]/div[1]/div[1]/div[2]/div[1]/span[2]/text()'):
                current_prof_first.append(prof.text)
            current_num_of_ratings = []
            # current_num_of_ratings = self.driver.find_elements_by_xpath('//*[@id="root"]/div/div/div[4]/div[1]/div[1]/div[1]/div[2]/div/a/text()[1]')
            
            
            for num_of_ratings in self.driver.find_elements_by_xpath('//*[@id="root"]/div/div/div[4]/div[1]/div[1]/div[1]/div[2]/div/a'):
                current_num_of_ratings.append(num_of_ratings.text)
            current_classes = []
            
            
            
            for i in range(1,10):
                try:
                    #classes_to_add = self.driver.find_elements_by_xpath('//*[@id="ratingsList"]/li[' + i + ']/div/div/div[3]/div[1]/div[1]/div[1]')
                    #//*[@id="ratingsList"]/li[1]/div/div/div[3]/div[1]/div[1]/div[1]
                    #//*[@id="ratingsList"]/li[2]/div/div/div[3]/div[1]/div[1]/div[1]
                    #//*[@id="ratingsList"]/li[3]/div/div/div[3]/div[1]/div[1]/div[1]
                    classes_to_add = self.driver.find_elements_by_xpath('//*[@id="ratingsList"]/li[' + str(i) + ']/div/div/div[3]/div[1]/div[1]/div[1]')
                    for class1 in classes_to_add:
                        if class1.text not in current_classes:
                            current_classes.append(class1.text)
                except:
                    continue
            print('current rating')
            print(current_rating)
            print('current prof')
            print(current_prof_first) 
            print('current num of ratings')
            print(current_num_of_ratings)
            print('current classes')
            print(current_classes)
            with open('aggregate-data.txt', 'a') as f:
                f.write(str(current_url) + "|")
                f.write(str(current_rating) + "|")
                f.write(str(current_prof_first) + "|")
                f.write(str(current_num_of_ratings) + "|")
                f.write(str(current_classes) + "\n")
            
            # time.sleep(random.randint(10,15))
            # self.driver.quit()
rate = RateMyProfessorScraper()
print("finished")




# //*[@id="ratingsList"]/li[18]/div/div/div[3]/div[1]/div[1]/div[1]
# //*[@id="ratingsList"]/li[16]/div/div/div[3]/div[1]/div[1]/div[1]
# //*[@id="ratingsList"]/li[15]/div/div/div[3]/div[1]/div[1]/div[1]
# //*[@id="ratingsList"]/li[1]/div/div/div[3]/div[1]/div[1]/div[1]/text()
# //*[@id="ratingsList"]/li[2]/div/div/div[3]/div[1]/div[1]/div[1]/text()