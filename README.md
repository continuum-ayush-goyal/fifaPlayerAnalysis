
# fifaPlayerAnalysis

This is a SpringBoot Rest project where a coach wants to get best players for his team based on certain attributes of the player

<u>**About The Project**</u>
It was one of the hiring Challenge project in HackerRank
I have Exposed Three APIs : 

 1. `localhost:8080/addData` - It will add data from the CSV file to the table(table creation will be done automatically).You need to make a one time call to this API to set your data in the database.<br/>Method type = *GET*<br/>      
 2. `localhost:8080/player` - This endpoint will give the details and attributes of the player based on player Name.<br/>Method type : *POST*
 Method body type : JSON
 {
		        "name": "L. Messi"
}
 3. `localhost:8080/club` - This Endpoint will list down all the players with its attributes based on club name.
 Method type : *POST*
 Method body type : JSON
{
		        "name": "FC Barcelona"
}

        
<u><b>How to deploy the Project : </b></u>

 1. Clone the Repository
 2. Make changes to application.properties -  <br/>  Provide your Database connection string,or if you want to use the embedded Database,just uncomment derby dependency and remove DB connection String properties from application.properties
 3. Copy the Fifa player Data Set in your local drive
 4. Set the path of each csv file in paths.properties
 5. Create it into a jar file(Recommended to do a *maven clean* and then a *maven install*)
 6. You can run this project from Eclipse also,run the class [FifaPlayerAnalysisApplication.java](https://github.com/goyalayush57/fifaPlayerAnalysis/blob/master/fifaPlayerAnalysis/src/main/java/com/fifa/FifaPlayerAnalysisApplication.java "FifaPlayerAnalysisApplication.java")
 7. run the jar file(java -jar [jar name])
 8. Now hit the services
 9. Voila!!

> In case of queries please feel free to drop me a message or add a comment
> Please Contribute by forking this Project

## ScreenShots

-    localhost:8080/player

Request :
[https://photos.app.goo.gl/7syVBf4aG2aHMtjv6](https://photos.app.goo.gl/7syVBf4aG2aHMtjv6)

Response : 
https://photos.app.goo.gl/7syVBf4aG2aHMtjv6
               
