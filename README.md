# micro-git-trending
This project is a REST microservice that list the last 100 trending repositories created in github.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)

## General info
the project is built as an answer to a code challenge test.

## Technologies
* Spring boot - version 2.2.10
* Spring Web - version 2.2.10

## Setup
* You build the project using command line
` mvn clean install `
* You start the embeded tomcat 
` java -jar micro-git-trending-0.0.1-SNAPSHOT `
## Code Examples
* to display the number of trending repo for javascript language
http://localhost:8080/api/repositories/javascript/total

* to display the list of trending repo for javascript language
http://localhost:8080/api/repositories/javascript/list

## Features
 TODOs for future development
* Awesome feature 1

## Status
Project is: _Finished_
