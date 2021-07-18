import pandas as pd
import os
import smtplib
from email.message import EmailMessage


def PyMail(msg_to):
    EMAIL_ADDRESS = os.environ.get('DB_USER')       #for security purpose we are using Encrypted connections
    EMAIL_PASSWORD = os.environ.get('DB_PASS')
    
    #contacts=['dkm.iitg@gmail.com', 'xyz@iitg.ac.in']

    msg = EmailMessage()
    msg['Subject'] = 'Application for internship or full-time Opportunity - Deepak, IIT Guwahati'
    msg['From'] = EMAIL_ADDRESS
    #msg['To'] = 'dkm.iitg@gmail.com'      #contacts
    msg['To'] = msg_to    #'dkm.iitg@gmail.com'
    
    
    msg.add_alternative("""\
    <!DOCTYPE html>
    <html>
        <body style = "font-family: "Times New Roman"; font-size:14px;">
            <p>
                Dear sir/ma'am,<br/><br/>
                
                Please find enclosed my Resume for the application process.<br/><br/>
                
                I'm Deepak. I have Graduated in July 2021. I have been done the Academic Curriculum of B.Tech. in CST from IIT Guwahati, India.
                I'm currently looking for an internship or full-time opportunity that I may be eligible.<br/>
                
                
                <br/>
                
                I'm skilled in Python programming language, C, Data structures & algorithms, Analytical tools - SQL, MS Excel, pandas, NumPy,
                Matplotlib, scikit-learn, nltk, BeautifulSoup/bs4, and web development technologies - HTML, CSS, JavaScript,
                Bootstrap, MySQL, SQLite, PHP, Django. <br/><br/>

                
                I have been done Projects on:-
                <ul>
                    <li> Developed PHP-based full-stack web app - CRSI Conference Website.</li>
                    <li> Developed Python-based desktop application - Fantasy Cricket Game.</li>
                    <li> Built a Model using Machine Learning technique for the House Price Prediction.</li>
                </ul>
                
                
                
                In addition, I have certification in:-
                <ul>
                    <li>Certified Python Marketing Analytics (CPMA)</li>
                    <li>HackerRank Certification in Python, Problem Solving & SQL</li>
                </ul>
                
                
                                 
                 <br/>
                                 
                Now, I am available for full-time, and further my willingness to apply my knowledge, the skill set that I have 
                learned so far, into solving real-world problems. I am always ready to learn any new skills that are required in a professional career.<br><br/>
                    
                
                Please have a look at my CV & Kindly let me know if there is any relevant opening, that you may consider 
                me for? A google drive link of CV: https://drive.google.com/drive/folders/1ldr-ni5ocNDELhasuICZrsLyUERmhjQP?usp=sharing
                
                
                <br/><br/>I will be happy to provide any more information that you may need. I look forward to
                hearing from you. Thank you!
                <br/><br/><br/>
                
                
                Sincerely,<br>
                Deepak Kumar Mandal<br>
                B.Tech, Indian Institute of Technology, Guwahati<br>
                Email: dkmiitg@gmail.com<br>
                Contact: +91-7764933459<br>
                https://github.com/deepak-mandal/<br/>
                
            </p>
        </body>
    </html>
    """, subtype='html')


    with open('Deepak-Resume.pdf', 'rb') as f:
        file_data=f.read()
        file_name=f.name
        
    msg.add_attachment(file_data, maintype='application', subtype='octet-stream', filename=file_name)
        
        
        
    with smtplib.SMTP_SSL('smtp.gmail.com', 465) as smtp:       #mail server as gmail
        smtp.login(EMAIL_ADDRESS, EMAIL_PASSWORD)   #for login into gmail
        smtp.send_message(msg)
        



if __name__ == "__main__":
    i=0
    
    email_data=pd.read_csv("C:/Users/dkmii/Desktop/Imp. file/Resume/emails.csv")
    email=email_data["E-mails"]
    
    msgTO_list = []
    for x in email:
        msgTO_list.append(x)
    
    print(len(msgTO_list))
    
    
    #msgTO_list = ["dkmiitg@gmail.com"]
    
    
    try:
        for msg_to in msgTO_list:
            PyMail(msg_to)
            print("message sent to : {} Successfully!!".format(msg_to))
            i+=1
    except Exception as e:
        print(e)
    print("Total Message sent = ",i)
















