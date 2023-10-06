package io.github.deepakmandal;

import java.time.Duration;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class EmailAppApplication {

	@Autowired
	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(EmailAppApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() throws MessagingException {
		Instant start = Instant.now();
		String[] emailArr = { "dkm.iitg@gmail.com",
//				"sevdelin.dimitrov@podix.com",
//				"chandturakhia@gmail.com",
//				"charvi.gupta@thewitslab.com",
//				"manu.bagauli@astiinfotech.com",
//				"deepshikha@qodemaker.com",
//				"arpit.kulsreshtha@qburst.com",
//				"people@nbyula.com",
//				"pasricha1508@gmail.com",
//				"ritika.s@jconnect.in",
//				"sahil@zillit.com",
//				"manisha.negi@centilytics.com",
//				"ganesh.b@tekwissen.in",
//				"hr@careerinfosystem.com",
//				"aarout67@gmail.com",
//				"kviku03@gmail.com",
//				"softwareprofessionals.co.in",
//				"shweta.gupta@connexials.com",
//				"manojk@kimbal.io",
//				"lakshyajeet.c@apideltech.com",
//				"pranjali.avasthi@hireteks.com",
//				"hrsakshi.hiring03@gmail.com",
				"jobs@bizztor.com"
	
				
				
				
				
				
				
//				"hr1@brightmetals.in",
//				"hrsakshi.hiring03@gmail.com",
//				"ramchandra-chandrahas.nale@capgemini.com",
//				"preetika@clarigoinfotech.com",
//				"misba@recruiterlane.com",
//				"reemaalphawizz@gmail.com",
//				"manoj.agarwal@alten-india.com",
//				"samiksha@meshlinks.in",
//				"aayushi.mishra@sgsconsulting.com",
//				"soumnayak@deloitte.com",
//				"chinna.g@tekwissen.com",
//				"swadheen.joshi@yash.com",
//				"yekata.shriwas@synechron.com",
//				"m.shalu@tcs.com",
//				"vishnu.N@kksoftwareassociates.com",
				
				
//				"Divyani.Ghadi@ril.com",
//				"mona.ganatra@cgi.com",
//				"mona.dubey@hcl.com",
//				"hr@digitsol.co",
//				"Soumya.thomas1@wipro.com",
//				"kajal.srivastava@mindpec.com",
//				"soumnayak@deloitte.com",
//				"arunshankar.npillai@airtel.com",
//				"ishani.singh@dotpe.in",
//				"hr@alphawizz.com",
//				"vijayashekar.manivel@grofers.com",
//				"ekmeet.kaur@dotpe.in",
//				"jyoti.chadak@xebia.com",
//				"jyotic@appcino.com",
//				"taniya.rajput@successpact.com",
//				"hr@eiysys.com",
//				"dhruvg@smartlevoinnovation.com",
//				"Supriya.g@twsol.com",
//				"Profiles@DAPConsultancy.com",
//				"Business@DAPConsultancy.com",
//				"gilp-applications@nationwithnamo.com",
//				"careers@geminisolutions.com",
//				"shankari@beehyv.com",
//				"talent@chalo.com",
//				"career@razorpay.com",
//				"careers@accolitedigital.com",
//				"puneet@fretron.com",
				
				
				
				
				
//				"asvanth.m@kksoftwareassociates.com",
//				"purvi.biwal@wipro.com",
//				"poshnul.verma@exlservice.com",
//				"hiring@d2pconsultancy.com",
//				"reddy.prasad@weareams.com",
//				"karthik.s@techplay.co",
//				"abhishek.purohit@getsimpl.com",
//				"reddy.prasad@weareams.com",
//				"anisha@grassik.com",
//				"pandit.devendra@ymail.com",
//				"careers@zenskar.com",
//				"apurv@zenskar.com",
//				"suryasingh@indusitc.com",
//				"indushr@indusitc.com",
//				"bestjob@srest.in",
//				"reddy.prasad@weareams.com",
//				"taniya.rajput@successpact.com",
//				"hanuman@hunterz.co.in",
//				"sujeeta.kumar@absolutelabs.co",
//				"hr@cmexpertise.com",
//				"hrankita.hiring01@gmail.com",
//				"Shubhangi.Saxena@genpact.com",
//				"priyanka.z.sharma@oracle.com",
//				"mateo@avanisystems.com",
//				"aayushi.mishra@sgsconsulting.com",
//				"HRDROBIS.MATECHENNAI@motherson.com",
//				"tanvi.palwankar@qualitykiosk.com",
//				"kevin.rodricks@qualitykiosk.com",
//				"hrankita.hiring01@gmail.com",
//				"ishikaalphawizz@gmail.com",
//				"venkateshp@hcl.com",
//				"pragati.saxena@hcl.com",
//				"palak@ninjatechnolabs.com",
//				"vani.cypherox@gmail.com",
//				"hr@ninjatechnolabs.com",
//				"shruti@indiamanpowersolution.com",
//				"uday5.singh@ril.com",
//				"biswajit.ray@in.ey.com",
//				"Karuna@leadingedgeinfosolutions.com",
//				"jay.anil.kothari@pwc.com",
//				"mahak.middha@in.ey.com",
//				"Shubhangi.Saxena@genpact.com",
//				"shashank.sharma@hireteks.com",
//				"Palak.agarwal@genpact.com",
//				"career@clarigoinfotech.com",
//				"dilraj.kaur@mobileprogramming.com",
//				"pallavi@charakit.com",
//				"ritika@zenfinet.com",
//				"hr@netscapelabs.com",
//				"hr@digigrains.com",
//				"hr@netscapelabs.com",
//				"tanvikhandelwal@softgrid.in",
//				"akanksha@serenehrsolutions.in",
//				"sachin.airen@gmail.com",
//				"naveen.bhati@sgsconsulting.com",
//				"career@clarigoinfotech.com",
//				"sramboini@opentext.com",
//				"abcdroh@gmail.com",
//				"anisha@grassik.com",
//				"gayathri@infiniticodes.com",
//				"gayathri@infiniticodes.com",
//				"navyakalar@gmail.com",
//				"career@externlabs.com",
//				"aditi.duvvuri@appitsoftware.com",
//				"supriya.g@twsol.com",
//				"jairaju@sirisoftsolutions.com",
//				"sodhi.consultancy1@gmail.com",
//				"abhishek.u@excelonsolutions.com",
//				"abhishek.upadhyay7654@gmail.com",
//				"reemaalphawizz@gmail.com",
//				"anwilliams@apexsystems.com",
//				"ashok@codegravityit.com",
//				"nandinip@softworldusa.com",
//				"maxi@hroasis.com",
//				"beatriz.botelho@integer.pt",
//				"ganesh.k@sritechsolutions.com",
//				"suma.smac@gmail.com",
//				"talenttechsol@gmail.com",
//				"k.shravani@nityainc.com",
//				"chinna.g@tekwissen.com",
//				"vishnu.N@kksoftwareassociates.com",
//				"asvanth.m@kksoftwareassociates.com",
//				"saikumar.k@virtualnetworx.com",
//				"rahul@genisists.com",
//				"sevdelin.dimitrov@podix.com",
//				"akash@v3techsol.com",
//				"flora@indusgroupinc.com",
//				"hiring@csnainc.com",
//				"mbaye@heybus.net",
//				"lnascimento@k2partnering.com",
//				"hrcodegeex@gmail.com",
//				"princy.jain@marktine.com",
//				"connect@serveskill.com",
//				"jaishree.hr@nextgenglobalservices.com",
//				"varun.naag@himflax.com",
//				"anish.kumar@emoha.com",
//				"recruitment@urbanladder.com",
//				"ritika@zenfinet.com",
//				"krishnapawan.darapaneni@gmail.com",
//				"schitral@etech.medallia.com", 
//			    "davinderkaur3@kpmg.com", 
//			    "ishivam57@gmail.com", 
//			    "hrnehathakur7@gmail.com", 
//			    "monika28may@gmail.com", 
//			    "sweta@blitzjobs.in",
//			    "jsubinbe@gmail.com",
//			    "bhargavi.m@charakit.com",
//			    "ritika@zenfinet.com",
//			    "hr@netscapelabs.com",
//			    "hr@netscapelabs.com",
//			    "tanvikhandelwal@softgrid.in",
//			    "akanksha@serenehrsolutions.in",
//			    "sachin.airen@gmail.com",
//			    "naveen.bhati@sgsconsulting.com",
//			    "career@clarigoinfotech.com",
//			    "hr@samosys.com",
//			    "career@clarigoinfotech.com",
//			    "sramboini@opentext.com",
//			    "𝐍𝐚𝐧𝐝𝐢𝐧𝐢.𝐃𝐚𝐬𝐡𝐨𝐫𝐞@𝐬𝐠𝐬𝐜𝐨𝐧𝐬𝐮𝐥𝐭𝐢𝐧𝐠.𝐜𝐨𝐦",
//			    "abcdroh@gmail.com",
//			    "anisha@grassik.com",
//			    "gayathri@infiniticodes.com",
//			    "gayathri@infiniticodes.com",
//			    "navyakalar@gmail.com",
//			    "dilraj.kaur@mobileprogramming.com",
//			    "career@externlabs.com",
//			    "aditi.duvvuri@appitsoftware.com",
//			    "supriya.g@twsol.com",
//			    "jairaju@sirisoftsolutions.com",
//			    "supriya.g@twsol.com",
//			    "sodhi.consultancy1@gmail.com",
//			    "abhishek.u@excelonsolutions.com",
//			    "abhishek.upadhyay7654@gmail.com",
//			    "shubhangi.saxena@genpact.com",
//			    "reemaalphawizz@gmail.com",
//			    "sarina@consus.us",
//			    "anwilliams@apexsystems.com",
//			    "ashok@codegravityit.com",
//			    "priyanka@akt-corp.com",
//			    "nandinip@softworldusa.com",
//			    "maxi@hroasis.com",
//			    "beatriz.botelho@integer.pt",
//			    "ganesh.k@sritechsolutions.com",
//			    "suma.smac@gmail.com",
//			    "talenttechsol@gmail.com",
//			    "k.shravani@nityainc.com",
//			    "chinna.g@tekwissen.com",
//			    "vishnu.N@kksoftwareassociates.com",
//			    "asvanth.m@kksoftwareassociates.com",
//			    "saikumar.k@virtualnetworx.com",
//			    "rahul@genisists.com",
//			    "sevdelin.dimitrov@podix.com",
//			    "akash@v3techsol.com",
//			    "flora@indusgroupinc.com",
//			    "hiring@csnainc.com",
//			    "m.sounny@cat-amania.com",
//			    "priyadarshini.mr@aceturtle.com",
//			    "mbaye@heybus.net",
//			    "Kanak.Verma@sgsconsulting.com",
//			    "lnascimento@k2partnering.com",
//			    "hrcodegeex@gmail.com",
//			    "aayushi.mishra@sgsconsulting.com",
//			    "connect@serveskill.com",
//			    "jaishree.hr@nextgenglobalservices.com",
//			    "naveen@aibcsolutions.com",
//			    "varun.naag@himflax.com",
//			    "anish.kumar@emoha.com",
//			    "recruitment@urbanladder.com",
//			    "Ankur.Jadon@emorphis.in",
//			    "ritika@zenfinet.com",
//			    "aayushi.mishra@sgsconsulting.com",
//			    "piyush@pasarpolis.com",
//			    "kartikmehta.iitm@gmail.com",
//			    "abhishek.purohit@getsimpl.com",
//			    "tarun.tokas@in.gt.com",
//			    "sanjana@furrl.in",
//			    "elankovanmg@gmail.com",
//			    "anisha@grassik.com",
//			    "shruti.mishra2018@gmail.com",
//			    "hr@ennobleinfotech.com",
//			    "deboshree.dutta@in.ey.com",
//			    "biswajit.ray@in.ey.com",
//			    "piyush_2011ce10@iitp.ac.in",
//			    "shmbhomle@gmail.com",
//			    "shweta.gola93@gmail.com",
//			    "hiring@titanbiotechltd.com",
//			    "utkarsh.malik@sabre.com",
//			    "ashish.tripathi242@gmail.com",
//			    "hr@aimcomely.com",
//			    "anjali.yadav@yougov.com",
//			    "trina.mitra@planetspark.in",
//			    "Shrishti.Agarwal1@ibm.com",
//			    "sukhman@suffescom.in",
//			    "jimi.palekar@agileinfoways.com",
//			    "talent@paytm.com",
//			    "vineetha@credencehrservices.com",
//			    "tina.singh@globallogic.com",
//			    "contact@quaffles.com",
//			    "hr@noitechnologies.com",
//			    "hina@durajobs.in",
//			    "hr@webashlar.com",
//			    "hr@micrasolution.com",
//			    "career@kmsoft.in",
//			    "dimpal@durajobs.in",
//			    "career@innvonix.com",
//			    "hr@macropolymers.com",
//			    "hr@teqtop.com",
//			    "aryan.coralbling@gmail.com",
//			    "hr.shivalic@gmail.com",
//			    "vsaphr1@gmail.com",
//			    "richa.avasthi22@gmail.com",
//			    "nandiniagrawal160@gmail.com",
//			    "resourceguru20@gmail.com",
//			    "career@metizsoft.com",
//			    "placementcom242@gmail.com",
//			    "ishwarpreet.angural@bizmerlin.com",
//			    "sunakshi.hr@univisionz.com",
//			    "saryuthakur.ameotech@gmail.com",
//			    "prerna.sahni@chicmic.co.in",
//			    "poojapatadiayuwhiz@gmail.com",
//			    "dheeraj.walkwel@gmail.com",
//			    "yuvraj.chhabra@mindmatrix.net",
//			    "hr@nestorbird.com",
//			    "cv@jobingujarat.com",
//			    "hr@appstane.com",
//			    "hr@duiux.com",
//			    "hr@midriffinfosolution.org",
//			    "hr@maxxmann.com",
//			    "hr@iosandweb.net",
//			    "hr@crestinfosystems.com",
//			    "hr@tnsconsulting.in",
//			    "shaifali.sood@worksdelight.org",
//			    "hr@ebizzinfotech.com",
//			    "hr@upsqode.com",
//			    "saket.saurav@dishmangroup.com",
//			    "hiral@technowise.co.in",
//			    "hiring.jobwilling@gmail.com",
//			    "hr@indpt.com",
//			    "priyanka.behera@forsysinc.com",
//			    "recruitmentmat@intaspharma.com",
//			    "admin@goldenhealth.ae",
//			    "hina@durajobs.in",
//			    "hr.wisereputationmaker@gmail.com",
//			    "official@snakescript.com",
//			    "anjali.yadav@yougov.com",
//			    "official@snakescript.com",
//			    "khushboo@technowise.co.in",
//			    "nrangarh110029@etechtexas.com",
//			    "shama.uiuxstudio@gmail.com",
//			    "rahulkumar.blitzjobs@gmail.com",
//			    "hr@upsqode.com",
//			    "hr@authenticode.info",
//			    "a2talentera@gmsil.com",
//			    "hiral@technowise.co.in",
//			    "sourcing@promotuphr.com",
//			    "rsoni20390@gmail.com",
//			    "permatasari@reeracoen.co.id",
//			    "srikanth.dr@snowrelic.com",
//			    "Priti@sinhacs.in",
//			    "hr@kenzen.com",
//			    "revanth.giela@curefit.com",
//			    "suresh.kale@mqtechsolutions.com",
//			    "santu@tekleaders.com",
//			    "suraj@gimmko.com",
//			    "chinnaiyan@panasiagroup.net",
//			    "jkandi@gnrsystems.com",
//			    "kieron.clouston@evisci.com",
//			    "upender.reddy@provisionstaffing.com",
//			    "mujtaba.aws@gmail.com",
//			    "a.mcknight@mcsgroup.jobs",
//			    "Recruitment@simasjiwa.co.id",
//			    "SnehitM@lancesoft.com",
//			    "harry@nrconsultingservice.com",
//			    "rsingh@acrocorp.com",
//			    "ayush@kanisol.com",
//			    "SnehitM@lancesoft.com",
//			    "mukul.r@e-solutionsinc.com",
//			    "premdhanawade2@gmail.com",
//			    "anju.bclericz@gmail.com",
//			    "l.pavitt@x4technology.co.uk",
//			    "cv@sundusrecruitment.com",
//			    "Recruitment@simasjiwa.co.id",
//			    "dennis.kimawan@kawanlamaretail.com",
//			    "Akanksha.Gupta@wsp.com",
//			    "neelam.yadav@whitecrowresearch.com",
//			    "shambhu.prasad@wipro.com",
//			    "ryan.prequencia@aspiree.net",
//			    "julial@finxl.com.au",
//			    "recruitment@maingames.com",
//			    "gitika.tandon@indiamart.com",
//			    "info.caribbean@bibrainz.com",
//			    "fdasilvafaria@caglobalint.com",
//			    "recruitment@klaim.ai",
//			    "flora@indusgroupinc.com",
//			    "bhumika@briskminds.com", 
//			    "hr@briskminds.com",
				};

		int noOfEmailSent =0;
		for (String toEmail : emailArr) {
			try {
				emailService.sendMessageWithAttachment(toEmail);
				noOfEmailSent++;
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		Instant end = Instant.now();
		System.out.println("total no. of message sent = "+noOfEmailSent);
		System.out.println("Time taken to send "+ noOfEmailSent +" emails is "+Duration.between(start, end));
	}

}


/*
https://tekion.com/
https://www.anz.com.au/careers/
https://careers.media.net/
http://careers.iifl.com/
https://wizikey.com/
https://www.cashfree.com/careers/
https://gilp.nationwithnamo.com/
https://www.geminisolutions.com/careers 
https://mycareer.verizon.com/
https://www.technoforte.co.in/
https://www.nagarro.com/en/careers/india
https://www.accolite.com/careers/#jobs
https://www.perceptive-analytics.com/careers/
https://www.merilytics.com/join-us
https://o9solutions.com/careers/jobs
https://www.beehyv.com/
https://altair.com/careers
Accenture Japan Ltd => digital consultant
PhonePe private limited => software engineer, Graduate trainee
Wells fargo internation solution limited => program associate b
MTX group inc => software development engineer
Dgraph labs => software engineer
Testbook
Societe generale => software engineer
amazon=>software development engineer
udaan=>engineer(software engineer)
google india pvt ltd=>software engineer
exl service pvt ltd=> cobsultant 1
hsbc technology india=>trainee software engineer
sprinklr=> product analyst
testbook.com=>analyst
groww=>apm
axis bank=>manager(analyst)
sap labs india=> developer associate -ibso
icici bank =>management trainee
squarepoint capital=>graduate software engineer
testbook=>associate project manager/associate product manager/ associate category manaGER
valuence japan=>software system engineer, machine learning engineer
clear tax=> business analyst
postman=> software engineer
uber india system=>software engineer
thoughtsport india private limited=> member of technical staff
fiserv global service=> analyst
axxela advisory services=> trainee analyst
mathworks=> associate in engineering, development group
blackrock=> analyst financial market advisory
vadantu=>software development engineer https://www.vedantu.com/careers
americal express => management trainee analytics/ engineer trainee
logichub india private limited=> software engineer-backend
tvs moter=> data analytics, data scientist/data engineer
razorpay software pvt ltd=> product designer, sde, devops https://razorpay.com/jobs/#joinus
chalo=> sde1 https://chalo.com/jobs
fico => software engineering associate https://www.fico.com/en/careers
delhviery =>analyst/developer https://www.delhivery.com/careers
mxplayer=>graduate engineer trainee-tech, product https://careers.mxplayer.in/
lti=>data https://www.ltimindtree.com/careers/
===========================
trell
fractal 
bny mellon
fico
sou japan
rupeek
zestmoney
mastercard
jpmc
walmart
barclays
curefit
ola
bounce
salesforce
quantiphix
altain engg in pvt ltd
bounce
hcl
virtusa
capgemini
cgi
merilytic
cropln
ferdelity
shodowfox
pobot labs
zomoto
exl
amex
logichub
cognizant
futurefirst
wipro
oracle
toppr
nautix
abzooba
cubastian consulting
flipkart
morgan stanley
skiify
embibe
axtria
capillary tech
netcracker technology
musigma
metlok
zemoso
nagarro
united health group
shell
itc
deloittle
global analytics
headstrong
evalue serve
schlumberger
bounce


*/