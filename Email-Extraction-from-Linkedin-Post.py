# -*- coding: utf-8 -*-
"""
Created on Sun Jul 18 20:06:03 2021

@author: dkmii
"""

#pip install selenium
from selenium import webdriver


#pip install webdriver-manager
from webdriver_manager.chrome import ChromeDriverManager

driver = webdriver.Chrome(ChromeDriverManager().install())

import re
import pandas as pd

#driver.get method() will navigate to a page given by the url address
driver.get("https://www.linkedin.com/posts/suraj-tomar-49b013154_html-javascript-css-activity-6821460771021709312-q5du")

emails=driver.find_elements_by_class_name("comments-comment-item__main-content")
comments=driver.find_elements_by_class_name("comments-comments-list__comment-item")
name=driver.find_elements_by_class_name("comments-post-meta__name")
headline=driver.find_elements_by_class_name("comments-post-meta__headline")

len(comments)

len(emails)

nameList=[]
emailList=[]
headlineList=[]

for i in range(len(comments)):
    try:
        emailList.append(re.findall("([a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+)", emails[i].text)[0])
        nameList.append((name[i].text).split("\n")[0])
        headlineList.append(headline[i].text)
        print(i)
    except Exception as e:
        print(e)
        
        
emailList



#intialise data of lists.
data = {"Name": nameList,
       "E-mails": emailList,
       "Headline": headlineList}

#creating DataFrame
df=pd.DataFrame(data)

df

df.to_csv("emails.csv", mode="a")