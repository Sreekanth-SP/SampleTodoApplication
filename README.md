# SampleTodoApplication
---
## Todo Application with SpringBoot without using MVC  

> `This README file provides an overview and instructions for a sample Todo application built using Spring Boot framework, without following the traditional Model-View-Controller (MVC) architectural pattern. Instead, this application takes a simpler approach for demonstration purposes.`
---
### Features
* Add tasks to the list.
* Mark tasks as completed.
* Remove tasks from the list.
* View the list of tasks.
---
### Technologies Used
This sample Todo application is built using the following technologies:

* Java: The primary programming language used for the application logic.
* Spring Boot: A Java-based framework for building web applications.
* PostMan: To check the functions using HTTP Methods.
---
### Usage
Once you have the application running in your web browser, you can perform the following actions in Postman:

* Add a Task: Use the POST Method. Enter a task description in the input field (Body -> raw) and write the todo objects (id, name, and flag ) in Json format and click the "Send" button. The task will be added to the list.
* Complete a Task: Use the PUT Method. Enter the code with the path variables and check whether the status is true or false. If true, the task is completed.
* Remove a Task: Use the DELETE Method. Enter the code with the Request params and check whether the id is the same. If it is the same then the task should be deleted.
* View Tasks: Use the GET Method. The tasks will be displayed in a list of JSON format on the screen. We can also view the done tasks and undone tasks in the list.
---
### Acknowledgement
> This Todo application is designed to showcase a simplified approach without utilizing the traditional MVC(Model-View-Controller) pattern.Here the codes are only for backend purposes.We can add frontend technologies also.
 
