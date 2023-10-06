import pandas as pd
import os
import smtplib
from email.message import EmailMessage


def PyMail(msg_to):
    EMAIL_ADDRESS = os.environ.get('DB_USER')       #for security purpose we are using Encrypted connections
    EMAIL_PASSWORD = os.environ.get('DB_PASS')
    
    #contacts=['dkm.iitg@gmail.com', 'xyz@iitg.ac.in']

    msg = EmailMessage()
    msg['Subject'] = 'subject text '
    msg['From'] = EMAIL_ADDRESS
    #msg['To'] = 'dkm.iitg@gmail.com'      #contacts
    msg['To'] = msg_to    #'dkm.iitg@gmail.com'
    
    
    msg.add_alternative("""\
    <!DOCTYPE html>
    <html>
        <body style = "font-family: "Times New Roman"; font-size:14px;">
            <p>
                Dear sir/ma'am,
                <br/>
                <br/>
                text  
                <br/>
                <br/>
                I'm Deepak, and<br/>
                <ul>
                <li>Experiences: 2+ years</li>
                <li>Education: </li>
                </ul>
                . Thank you.
                <br/>
                <br/>


                Thanks and regards,
                <br>
                <b>Deepak </b> | Engineer | Indian Institute of Technology
                <br>
                xyz@gmail.com | +91-1234567890
                
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
    
    #email_data=pd.read_csv("C:/Users/dkmii/Desktop/Imp. file/Resume/emails.csv")
    #email=email_data["E-mails"]
    
    #msgTO_list = []
    #for x in email:
     #   msgTO_list.append(x)
    
    #print(len(msgTO_list))
    
    msgTO_list = ["dkmiitg@gmail.com", ]    
    
    try:
        for msg_to in msgTO_list:
            PyMail(msg_to)
            print("message sent to : {} Successfully!!".format(msg_to))
            i+=1
    except Exception as e:
        print(e)
    print("Total Message sent = ",i)
















