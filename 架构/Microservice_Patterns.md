#### Book Info
* Microservices Patterns With Examples in Java 
* Chris Richardson

#### 1. Escaping monolithic hell
* [Big Ball of Mud](www.laputan.org/mud/)

* The benefits of the monolithic architecture
  * Simple to develop - IDEs and other developer tools are focused on building a single application
  * Easy to make radical changes to the application - You can change the code and the database achema, build, and deploy
  * Straightforward to test - The developers wrote end-to-end tests that launched the application, invoked the REST API, and tested the UI with Selenium.
  * Straightforward to deploy - All a developer had to do was copy the WAR file to a server that had Tomcat installed.
  * Easy to scale - FTGO ran multiple instances of the application behand a load blancer.
  * ![architecture](https://github.com/peoffice/my_java_way/blob/master/架构/png/ftgo_architecture.png)

* The slow march toward monolithic hell
  * development is slow
  * path from commit to deployment is long and arduous 
  * scaling is difficult
  * delivering a reliable monolith is chanllenging
  * locked into increasingly obsolete technology stack
  * ![slow march](https://github.com/peoffice/my_java_way/blob/master/架构/png/ftgo_slow_march.png)

* What you'll learn in this book
  * The essential characteristics of the microservice architecture, its benefits and drawbacks, and when to use it
  * Distributed data management patterns
  * Effective microservice testing stargeties
  * Deployment options for microservices
  * Strategies for refactoring a monolithic application into a microservice architecture
#### 2. Decomposition strategies

#### 3. Interprocess communication in a microservice architecture

#### 4. Managing transactions with sagas

#### 5. Designing business logic in a microservice arthitecture

#### 6. Developing business logic with event sourcing

#### 7. Implementing queries in a microservice architecture

#### 8. External API patterns

#### 9. Testing microservices: Part 1

#### 10. Tesing microservices: Part 2

#### 11. Developing production-ready services

#### 12. Deploying microservices

#### 13 Refactoring to microservides