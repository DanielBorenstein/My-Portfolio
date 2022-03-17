from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import pandas as pd
CHROME_DRIVER_LOCATION = 'D:/driver/chromedriver'
driver = webdriver.Chrome(CHROME_DRIVER_LOCATION)
# au faculty website
url1 = 'https://bulletin.auburn.edu/undergraduate/faculty/'
driver.get(url1)

names = driver.find_elements_by_xpath('//*[@id="textcontainer"]/p')
list_of_first_names =[]
list_of_last_names =[]
print(names.text)
# for name1 in names:
#     name1 =  name1.text.title()
#     name1 = name1.replace(",","")
#     name1 = name1.replace("'","")
#     name1 = name1.replace("*","")
#     list_of_names = name1.split(' ')
#     if list_of_names[0] != "Back":
#         list_of_names[1].replace("*", "")
#         list_of_names[1].replace(",", "")
#         first_name = list_of_names[1]
#         last_name = list_of_names[0]
        
#         if len(last_name.replace(".",(""))) < 2:
#             last_name = list_of_names[1]
#         elif len(first_name.replace(".",(""))) < 2:
#             first_name = list_of_names[2]
#         list_of_first_names.append(first_name)
#         list_of_last_names.append(last_name)   
#         print(first_name + " " + last_name)



# print(list_of_first_names[100])
# print(list_of_last_names[100])