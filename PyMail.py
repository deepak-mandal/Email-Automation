import pandas as pd
import os
import smtplib
from email.message import EmailMessage


def PyMail(msg_to):
    EMAIL_ADDRESS = os.environ.get('DB_USER')       #for security purpose we are using Encrypted connections
    EMAIL_PASSWORD = os.environ.get('DB_PASS')
    
    #contacts=['dkm.iitg@gmail.com', 'xyz@iitg.ac.in']

    msg = EmailMessage()
    msg['Subject'] = 'Query regarding technical opportunity - Deepak, Software Engineer | IIT Guwahati'
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
                Please find enclosed my Resume.
                <br/>
                <br/>
                I'm Deepak, and currently working as a Software Engineer (Java full-stack Developer) at CGI. I am highly skilled in Angular(TypeScript), Spring Boot(Java), SQL(Oracle DBMS).<br/>
                <ul>
                <li>Experiences: 2+ years</li>
                <li>Education: B.Tech., IIT Guwahati; 2017-2021</li>
                </ul>
                Please let me know, if there is any relevant opportunity. Thank you.
                <br/>
                <br/>


                Thanks and regards,
                <br>
                <b>Deepak Kumar Mandal</b> | Software Engineer | B.Tech. - Indian Institute of Technology Guwahati
                <br>
                dkmiitg@gmail.com | +91-7764933459
                
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
    # ["dkmiitg@gmail.com", 
    # "schitral@etech.medallia.com", 
    # "davinderkaur3@kpmg.com", 
    # "ishivam57@gmail.com", 
    # "hrnehathakur7@gmail.com", 
    # "monika28may@gmail.com", 
    # "sweta@blitzjobs.in",
    # "jsubinbe@gmail.com",
    # "bhargavi.m@charakit.com",
    # "ritika@zenfinet.com",
    # "hr@netscapelabs.com",
    # "hr@netscapelabs.com",
    # "tanvikhandelwal@softgrid.in",
    # "akanksha@serenehrsolutions.in",
    # "sachin.airen@gmail.com",
    # "naveen.bhati@sgsconsulting.com",
    # "career@clarigoinfotech.com",
    # "hr@samosys.com",
    # "career@clarigoinfotech.com",
    # "sramboini@opentext.com",
    # "𝐍𝐚𝐧𝐝𝐢𝐧𝐢.𝐃𝐚𝐬𝐡𝐨𝐫𝐞@𝐬𝐠𝐬𝐜𝐨𝐧𝐬𝐮𝐥𝐭𝐢𝐧𝐠.𝐜𝐨𝐦",
    # "abcdroh@gmail.com",
    # "anisha@grassik.com",
    # "gayathri@infiniticodes.com",
    # "gayathri@infiniticodes.com",
    # "navyakalar@gmail.com",
    # "dilraj.kaur@mobileprogramming.com",
    # "career@externlabs.com",
    # "aditi.duvvuri@appitsoftware.com",
    # "supriya.g@twsol.com",
    # "jairaju@sirisoftsolutions.com",
    # "supriya.g@twsol.com",
    # "sodhi.consultancy1@gmail.com",
    # "abhishek.u@excelonsolutions.com",
    # "abhishek.upadhyay7654@gmail.com",
    # "shubhangi.saxena@genpact.com",
    # "reemaalphawizz@gmail.com",
    # "sarina@consus.us",
    # "anwilliams@apexsystems.com",
    # "ashok@codegravityit.com",
    # "priyanka@akt-corp.com",
    # "nandinip@softworldusa.com",
    # "maxi@hroasis.com",
    # "beatriz.botelho@integer.pt",
    # "ganesh.k@sritechsolutions.com",
    # "suma.smac@gmail.com",
    # "talenttechsol@gmail.com",
    # "k.shravani@nityainc.com",
    # "chinna.g@tekwissen.com",
    # "vishnu.N@kksoftwareassociates.com",
    # "asvanth.m@kksoftwareassociates.com",
    # "saikumar.k@virtualnetworx.com",
    # "rahul@genisists.com",
    # "sevdelin.dimitrov@podix.com",
    # "akash@v3techsol.com",
    # "flora@indusgroupinc.com",
    # "hiring@csnainc.com",
    # "m.sounny@cat-amania.com",
    # "priyadarshini.mr@aceturtle.com",
    # "mbaye@heybus.net",
    # "Kanak.Verma@sgsconsulting.com",
    # "lnascimento@k2partnering.com",
    # "hrcodegeex@gmail.com",
    # "aayushi.mishra@sgsconsulting.com",
    # "connect@serveskill.com",
    # "jaishree.hr@nextgenglobalservices.com",
    # "naveen@aibcsolutions.com",
    # "varun.naag@himflax.com",
    # "anish.kumar@emoha.com",
    # "recruitment@urbanladder.com",
    # "Ankur.Jadon@emorphis.in",
    # "ritika@zenfinet.com",
    # "aayushi.mishra@sgsconsulting.com",
    # "piyush@pasarpolis.com",
    # "kartikmehta.iitm@gmail.com",
    # "abhishek.purohit@getsimpl.com",
    # "tarun.tokas@in.gt.com",
    # "sanjana@furrl.in",
    # "elankovanmg@gmail.com",
    # "anisha@grassik.com",
    # "shruti.mishra2018@gmail.com",
    # "hr@ennobleinfotech.com",
    # "deboshree.dutta@in.ey.com",
    # "biswajit.ray@in.ey.com",
    # "piyush_2011ce10@iitp.ac.in",
    # "shmbhomle@gmail.com",
    # "shweta.gola93@gmail.com",
    # "hiring@titanbiotechltd.com",
    # "utkarsh.malik@sabre.com",
    # "ashish.tripathi242@gmail.com",
    # "hr@aimcomely.com",
    # "anjali.yadav@yougov.com",
    # "trina.mitra@planetspark.in",
    # "Shrishti.Agarwal1@ibm.com",
    # "sukhman@suffescom.in",
    # "jimi.palekar@agileinfoways.com",
    # "talent@paytm.com",
    # "vineetha@credencehrservices.com",
    # "tina.singh@globallogic.com",
    # "contact@quaffles.com",
    # "hr@noitechnologies.com",
    # "hina@durajobs.in",
    # "hr@webashlar.com",
    # "hr@micrasolution.com",
    # "career@kmsoft.in",
    # "dimpal@durajobs.in",
    # "career@innvonix.com",
    # "hr@macropolymers.com",
    # "hr@teqtop.com",
    # "aryan.coralbling@gmail.com",
    # "hr.shivalic@gmail.com",
    # "vsaphr1@gmail.com",
    # "richa.avasthi22@gmail.com",
    # "nandiniagrawal160@gmail.com",
    # "resourceguru20@gmail.com",
    # "career@metizsoft.com",
    # "placementcom242@gmail.com",
    # "ishwarpreet.angural@bizmerlin.com",
    # "sunakshi.hr@univisionz.com",
    # "saryuthakur.ameotech@gmail.com",
    # "prerna.sahni@chicmic.co.in",
    # "poojapatadiayuwhiz@gmail.com",
    # "dheeraj.walkwel@gmail.com",
    # "yuvraj.chhabra@mindmatrix.net",
    # "hr@nestorbird.com",
    # "cv@jobingujarat.com",
    # "hr@appstane.com",
    # "hr@duiux.com",
    # "hr@midriffinfosolution.org",
    # "hr@maxxmann.com",
    # "hr@iosandweb.net",
    # "hr@crestinfosystems.com",
    # "hr@tnsconsulting.in",
    # "shaifali.sood@worksdelight.org",
    # "hr@ebizzinfotech.com",
    # "hr@upsqode.com",
    # "saket.saurav@dishmangroup.com",
    # "hiral@technowise.co.in",
    # "hiring.jobwilling@gmail.com",
    # "hr@indpt.com",
    # "priyanka.behera@forsysinc.com",
    # "recruitmentmat@intaspharma.com",
    # "admin@goldenhealth.ae",
    # "hina@durajobs.in",
    # "hr.wisereputationmaker@gmail.com",
    # "official@snakescript.com",
    # "anjali.yadav@yougov.com",
    # "official@snakescript.com",
    # "khushboo@technowise.co.in",
    # "nrangarh110029@etechtexas.com",
    # "shama.uiuxstudio@gmail.com",
    # "rahulkumar.blitzjobs@gmail.com",
    # "hr@upsqode.com",
    # "hr@authenticode.info",
    # "a2talentera@gmsil.com",
    # "hiral@technowise.co.in",
    # "sourcing@promotuphr.com",
    # "rsoni20390@gmail.com",
    # "permatasari@reeracoen.co.id",
    # "srikanth.dr@snowrelic.com",
    # "Priti@sinhacs.in",
    # "hr@kenzen.com",
    # "revanth.giela@curefit.com",
    # "suresh.kale@mqtechsolutions.com",
    # "santu@tekleaders.com",
    # "suraj@gimmko.com",
    # "chinnaiyan@panasiagroup.net",
    # "jkandi@gnrsystems.com",
    # "kieron.clouston@evisci.com",
    # "upender.reddy@provisionstaffing.com",
    # "mujtaba.aws@gmail.com",
    # "a.mcknight@mcsgroup.jobs",
    # "Recruitment@simasjiwa.co.id",
    # "SnehitM@lancesoft.com",
    # "harry@nrconsultingservice.com",
    # "rsingh@acrocorp.com",
    # "ayush@kanisol.com",
    # "SnehitM@lancesoft.com",
    # "mukul.r@e-solutionsinc.com",
    # "premdhanawade2@gmail.com",
    # "anju.bclericz@gmail.com",
    # "l.pavitt@x4technology.co.uk",
    # "cv@sundusrecruitment.com",
    # "Recruitment@simasjiwa.co.id",
    # "dennis.kimawan@kawanlamaretail.com",
    # "Akanksha.Gupta@wsp.com",
    # "neelam.yadav@whitecrowresearch.com",
    # "shambhu.prasad@wipro.com",
    # "ryan.prequencia@aspiree.net",
    # "julial@finxl.com.au",
    # "recruitment@maingames.com",
    # "gitika.tandon@indiamart.com",
    # "info.caribbean@bibrainz.com",
    # "fdasilvafaria@caglobalint.com",
    # "recruitment@klaim.ai",
    # "flora@indusgroupinc.com",
    # "bhumika@briskminds.com", 
    # "hr@briskminds.com",
    # ]
    
    
    
    try:
        for msg_to in msgTO_list:
            PyMail(msg_to)
            print("message sent to : {} Successfully!!".format(msg_to))
            i+=1
    except Exception as e:
        print(e)
    print("Total Message sent = ",i)
















