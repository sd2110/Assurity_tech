# Assurity
# Overview
This repository contains the automation of test cases that were mentioned in the Assurity technical assessment.
The tests are performed on the API https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false and written with the Cucumber framework using selenium and JAVA.

# Pre-requisites
1. JAVA
2. Maven
3. Jenkins (optional)

# Guidelines
The following methods can be used to run the tests:
1. Cloning the repository
    1. Clone the repository on your local machine
    2. Open the project using an IDE of your choice
    3. The project dependencies will start downloading with maven
    4. Run ApiTestRunner.java file to run the tests
    5. An index.html file gets generated under the targets>cucumber-reports>APIAutomationReport folder displaying the test report
2. Running in the pipeline
    1. Open Jenkins
    2. Create a new item > pipeline
    3. Under Definition, select "Pipeline script from SCM"
    4. Enter the github repository url "https://github.com/sd2110/Assurity_tech.git"
    5. Select branch specifier as "./main" and Script path as "Jenkinsfile"
    6. Click Save and Apply
    7. Click on Build Now and the tests will start running

# Support
Please contact sagar2110@gmail.com for any query or support.
