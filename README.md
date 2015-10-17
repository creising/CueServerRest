# CueServerRest

![Build Status](https://travis-ci.org/creising/CueServerRest.svg?branch=master)

This is just to play with a RESTful service with CueServer's existing CGI API.
Just a sandbox to try new things out.

## Build
To run in a standalone container use `./gradlew JettyRunWar`

## Demo
The application is hosted on [Heroku](https://cueserver-rest.herokuapp.com/).
The container falls asleep after 30min of inactivity. If you go to the page and
it times out wait a minute then try again. It should come up the second time.
Sorry, I'm cheap.

You will also find an instance of Swagger UI running if you wish to dive into the
documentation and play with some of the available commands.