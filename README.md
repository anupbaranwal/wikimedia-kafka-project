# Wikimedia Kafka Project

A project which reads the data from wikimedia open source streams and pushes it to a kafka broker.
There will be a consumer which will be reading data from Kafka broker and pushing them to database.

We will be using spring boot kafka libraries to store asynchronous streams for data into Kafka broker.

Once we are able to continuously store and update the data in database, the usage would be many.

In this project we are only storing the data in DB, later we will extend the project to multiple modules to 
prepare dashboard based on these data in realtime.