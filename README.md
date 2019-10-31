# Random Beer App
![](https://github.com/weishunliao/Random-Beer-App/blob/dev/app.png)


This repository is a technical challenge for Distilled. This interesting app would randomly display a beer for user with image and details. 


##Introduction
This is a full-stack web application based on React, Spring Boot and MySQL.Spring Boot act as backend-end server to provide restful API services and React is the frent-end franwork to implmemt user interface. All the service are deploy on the AWS services and dockerized. There are 3 containers, one for React, one for Sprint boot and one for Nginx, three of them are on EC2. MySQL database is on RDS and those beer photos are stored on S3.



## Getting Started
The app and the code could be access by following links.

###### Website: http://lets-beer.tk/
###### Github: https://github.com/weishunliao/Random-Beer-App


If you want to test it on your local computer, here has a step by step series that tell you how to get a development env running

```
a. Clone whole project
b. Ｉmport data to mysql database by execcuting beer.sql.

c. There is a 'application.properties' file in "Random-Beer-App-master/server/src/main/resources" 
, populate your database name ans password.
d. run "mvn package && java -jar target/beer-0.0.1.jar" under server folder, once finished 
this step, the restful spi server is up.

e. Go to client server and run "yarn install" and "yarn run start". Make sure you have installed Node.js on the computer before run these command.

f. Visit localhost:3000 on your browser.
```






## Others

* The beer data is from Brewery DB API(https://www.brewerydb.com/developers/docs).
* The photo of beer is scrape from google image, no business activity, personal use only.






