Problem Statement : Identify Courses
 
Search and display all web development courses 
1. Should be for beginners level.
2. Courses offered in English language
3. Display first two courses with name, total learning hours and rating.
(Suggested Site: coursera.org however  you are free to choose any other legitimate  site)
 
 
Detailed Description:
 
1. Search for web development courses for Beginners level & English Language and extract the course names, total learning hours & rating for first 2 courses
2. Look for Language Learning; Extract all the languages and different levels with its total count & display them
3. In Home page, go to "For Enterprise"; Look into Courses for Campus under Product; Fill the  "Ready to transform" form with any one input invalid (example: email); Capture the error message & display
(Suggested Site: coursera.org however  you are free to choose any other legitimate  site)
 
 
Key Automation Scope
 
Handling different browser windows, search option
Extract multiple drop down list items & store in collections
Navigating back to home page
Filling form (in different objects in web page)
Capture warning message
Scrolling down in web page
 
 
*********************************STEPS TO EXECUTE*********************************
 
-> unzip the folder
-> On eclipse, goto file-> import-> select maven-> click on existing maven project->next-> browse the location where u unzip the folder-> click on finish
-> Now go to the testng.xml file and run as TestNGSuite.
-> Now the file will Execute and we get the expected output as shown below.
-> Now go to TestRunner.java file and run as JUnit test.
-> Now the file will Execute in Cucumber and we get the expected output as shown below.
 
 
*********************************FILES DESCRIPTION*********************************
1. src/test/java - There are 8 packages present in this folder.
 
-> pageobject : Page Object containing different class contains which are BasePage, Module1, Module2, Module3, Module3_1
 
-> test_base:In this package we have BaseClass.java is our main project file in which we Firstly invoke the selected browser and generate the report file in html format and store it in report opening Coursera website [Cousera](https://www.coursera.org/) and closing the browser
 
-> test_cases:In this package we have TC001, TC002, TC003 java files which extends baseClass.java where the methods are present which will login to the page and verify and validate all the testCases.
 
-> utilities: In the utilities package all the read, write work of and extent report work is done.
-> TestRunner : In this package we have TestRunner.java file where we include feature file path and cucumber plugins to generate cucumber report.
 
-> Cucumber.Step : This package contains StepsDefinition.java which contains the testSteps to execute the project in Cucumber and Hooks.java contains the driver setup , screenshots and Closing the browser.
 
-> Factory : In this package we have CucumberBaseClass.java file in which we invoke the browser initialization, we also added logger and properties method to include logs and access config.properties file.
 
-> IdentifyCourse : This package contains the selenium file of the project
 
 
2. src/test/resources- In this folder, there are three files
->  config.properties  : This file is used to store the reusable values such as apprl,browser name and os name.
->  log4j2.xml  : This file is used to generate log informations about the execution of test cases.
->  extent.properties  : This file is used to generate the extentReport for the execution in cucumber framework.
3. JRE System Library: In this File we have all dependencies of JAR.files.         
4. Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. When a Maven build is executed, Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.
5. Report: In this folder the Test-Report-YYYY.MM.DD.html is present which is the report of the project
6. ScreenShots : There are 9 images, 1 clickcourse.png, 2 clickenterprises.png, 3 clicking.png, 4 clickoffer.png, 5 course1.png, 6 course2.png, 7 fillForm.png, 8 getLangLvl.png, 9 searching.png
 
7. src: In this, there are two folders
	-main:It is an empty folder
	-test:It is an empty folder
8. target: It is an empty folder
 
9. Feature Files : In this folder we have all the feature files with .feature extension which needs to be invoked while excuting the project in cucumber framework.
10. Logs : In this folder logs are present which is generated while executing the project.
 
11. TestData : In this folder we have two files
	-Read  : In this excel file all the data which need to be passed to required WebElements are stored.
	-Write  : After the execution of project the result will be stored.
12. pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.
 
13. Mastertestng.xml : this file contain suit from where the compilation of project begins.

 
*********************************OUTPUT*********************************
 
***TestNG***
 
Module 1 : Search for web development courses for Beginners level & English Language and extract the course names, total learning hours & rating for first 2 courses
 
------1st Course------
Course Name : IBM Full Stack Software Developer Professional Certificate
Rating : 4.6
(5,274 reviews)
Total Learning Hours : 4 months at 10 hours a week
------2nd Course------
Course Name : Meta Front-End Developer Professional Certificate
Rating : 4.7
(14,642 reviews)
Total Learning Hours : 7 months at 6 hours a week
 
Module 2 : Look for Language Learning; Extract all the languages and different levels with its total count & display them
 
List of Languages
English (2,101)
Spanish (1,392)
French (1,280)
Arabic (1,249)
Portuguese (Brazil) (1,201)
German (1,166)
Indonesian (1,152)
Turkish (1,150)
Chinese (China) (1,147)
Italian (1,144)
Ukrainian (1,144)
Dutch (1,143)
Greek (1,143)
Hindi (1,143)
Polish (1,143)
Swedish (1,143)
Thai (1,143)
Russian (1,119)
Kazakh (1,093)
Hungarian (839)
Japanese (66)
Korean (56)
Chinese (Traditional) (3)
Hebrew (2)

24 - Total number of Language 

List of Levels
Beginner (1,641)
Intermediate (760)
Advanced (86)
Mixed (197)

4 -  Counts of level
 
Module 3 : In Home page, go to "For Enterprise"; Look into Courses for Campus under Product; Fill the  "Ready to transform" form with any one input invalid (example: email); Capture the error message & display
 
Error Message : Please enter your work email address
 
===============================================
Suite
Total tests run: 25, Passes: 25, Failures: 0, Skips: 0
===============================================
 
 
***Cucumber***
 
@sanity @regression
Scenario: Get Details of Web development courses                                           # Features/IdentifyingCourses.feature:4
  Given User is on the Coursera Website                                                    # Cucumber.Steps.StepDefinitions.user_is_on_the_coursera_website()
 
    Embedding Get Details of Web development courses [image/png 180040 bytes]
 
Module 1 : Search for web development courses for Beginners level & English Language and extract the course names, total learning hours & rating for first 2 courses
  When User Searches for Web Development Courses                                           # Cucumber.Steps.StepDefinitions.user_searches_for_web_development_courses()
 
    Embedding Get Details of Web development courses [image/png 389477 bytes]
 
  And English Language and Beginner Level is Selected From the Search Results Page         # Cucumber.Steps.StepDefinitions.english_language_and_beginner_level_is_selected_from_the_search_results_page()
 
    Embedding Get Details of Web development courses [image/png 86790 bytes]
 
 
------1st Course------
Course Name : IBM Full Stack Software Developer Professional Certificate
Rating : 4.
(5,274 reviews)
Total Learning Hours : 4 months at 10 hours a week
------2nd Course------
Course Name : Meta Front-End Developer Professional Certificate
Rating : 4.7
(14,642 reviews)
Total Learning Hours : 7 months at 6 hours a week
  Then First and Second Displayed Course is Selected and Details of the Course are Printed # Cucumber.Steps.StepDefinitions.first_and_second_displayed_course_is_selected_and_details_of_the_course_are_printed()
 
    Embedding Get Details of Web development courses [image/png 450116 bytes]
 
 
@sanity @regression
Scenario: Get languages,levels and their count        # Features/IdentifyingCourses.feature:11
 
Module 2 : Look for Language Learning; Extract all the languages and different levels with its total count & display them
  When User searches for Language learning            # Cucumber.Steps.StepDefinitions.user_searches_for_language_learning()
 
    Embedding Get languages,levels and their count [image/png 253863 bytes]
 
  And Click on See more                               # Cucumber.Steps.StepDefinitions.click_on_see_more()
 
    Embedding Get languages,levels and their count [image/png 153744 bytes]
 
 
List of Languages

English (2,101)
Spanish (1,392)
French (1,280)
Arabic (1,249)
Portuguese (Brazil) (1,201)
German (1,166)
Indonesian (1,152)
Turkish (1,150)
Chinese (China) (1,147)
Italian (1,144)
Ukrainian (1,144)
Dutch (1,143)
Greek (1,143)
Hindi (1,143)
Polish (1,143)
Swedish (1,143)
Thai (1,143)
Russian (1,119)
Kazakh (1,093)
Hungarian (839)
Japanese (66)
Korean (56)
Chinese (Traditional) (3)
Hebrew (2)

24 - Total number of Language

List of Levels
Beginner (1,641)
Intermediate (760)
Advanced (86)
Mixed (197)

4 -  Counts of level

Then Get lists of languages, levels and their count # Cucumber.Steps.StepDefinitions.get_lists_of_languages_levels_and_their_count()
 
    Embedding Get languages,levels and their count [image/png 291478 bytes]
 
 
@sanity @regression
Scenario: Navigate and fill form                                    # Features/IdentifyingCourses.feature:17
  When User clicks on For Enterprise                                # Cucumber.Steps.StepDefinitions.user_clicks_on_for_enterprise()
 
    Embedding Navigate and fill form [image/png 674792 bytes]
 
  And User clicks on Offer and navigates to click course            # Cucumber.Steps.StepDefinitions.user_clicks_on_offer_and_navigates_to_click_course()
 
    Embedding Navigate and fill form [image/png 814715 bytes]
 
 
Module 3 : In Home page, go to "For Enterprise"; Look into Courses for Campus under Product; Fill the  "Ready to transform" form with any one input invalid (example: email); Capture the error message & display
 
Error Message : Please enter your work email address
  Then User Fills and submits the form, Error message is displayed. # Cucumber.Steps.StepDefinitions.user_fills_and_submits_the_form_error_message_is_displayed()
 
    Embedding Navigate and fill form [image/png 116841 bytes]