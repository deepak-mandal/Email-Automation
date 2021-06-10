import os
import smtplib
from email.message import EmailMessage


def PyMail(msg_to):
    EMAIL_ADDRESS = os.environ.get('DB_USER')       #for security purpose we are using Encrypted connections
    EMAIL_PASSWORD = os.environ.get('DB_PASS')
    
    #contacts=['dkm.iitg@gmail.com', 'xyz@iitg.ac.in']

    msg = EmailMessage()
    msg['Subject'] = 'Application for Internship or full-time opportunity - Deepak, IIT Guwahati'
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
                
                I'm Deepak. I have been completed the Academic Curriculum of B.Tech. in CST from IIT Guwahati, India.
                My expected year of graduation is 2021, and I'm currently looking for an internship or full-time
                opportunity that I may be eligible.<br/>
                
                
                <p>
                
                Apart from having a Cumulative Performance Index (CPI) of 6.99, I'm skilled in Python programming language,
                C, DBMS - MySQL, SQLite, Analytical tools such as pandas NumPy, Matplotlib, scikit-learn, nltk,
                BeautifulSoup/bs4, MS Excel, SQL, Data structures & algorithms, and web development technologies such as HTML, CSS, JavaScript,
                Bootstrap, PHP, Django. In addition, I have certification in "Certified Python Marketing Analytics (CPMA)".
                
                 In addition, I have been done Projects on:
                <ul>
                    <li> Developed PHP-based full-stack web app - CRSI Conference Website.</li>
                    <li> Developed Python-based desktop application - Fantasy Cricket Game.</li>
                    <li> Built a Model using Machine Learning technique for the House Price Prediction.</li>
                </ul>
                </p>
                                 
                 
                                 
                As our Academic Curriculum has been completed, so I am available for full-time, and further my willingness
                to apply my knowledge, the skill set that I have learned so far, into solving real-world problems. I am always 
                ready to learn any new skills that are required in a professional career.<br><br/>
                    
                
                Please have a look at my CV, & Kindly let me know if there is any relevant opening, that you may consider 
                me for? A google drive link of CV: https://drive.google.com/drive/folders/1ldr-ni5ocNDELhasuICZrsLyUERmhjQP?usp=sharing
                
                
                <br/><br/>I will be happy to provide any more information that you may need. I look forward to
                hearing from you. Thank you!
                <br/><br/><br/>
                
                
                Sincerely,<br>
                Deepak Kumar Mandal<br>
                B.Tech, IIT Guwahati, INDIA<br>
                Email: dkmiitg@gmail.com<br>
                Contact: +91-7764933459<br>
                
            </p>
        </body>
    </html>
    """, subtype='html')


    with open('DeepakKumarMandal-Resume.pdf', 'rb') as f:
        file_data=f.read()
        file_name=f.name
        
    msg.add_attachment(file_data, maintype='application', subtype='octet-stream', filename=file_name)
        
        
        
    with smtplib.SMTP_SSL('smtp.gmail.com', 465) as smtp:       #mail server as gmail
        smtp.login(EMAIL_ADDRESS, EMAIL_PASSWORD)   #for login into gmail
        smtp.send_message(msg)
        



if __name__ == "__main__":
    msgTO_list = ['dkm.iitg@gmail.com', 'dkmiit.g@gmail.com']
    for msg_to in msgTO_list:
        PyMail(msg_to)
        print("message sent to : {} Successfully!!".format(msg_to))
















