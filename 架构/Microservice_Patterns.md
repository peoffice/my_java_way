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

* Microservice architecture to the rescue
  * Scale cube and microservices
    > ![cube](https://github.com/peoffice/my_java_way/blob/master/架构/png/cube.png)
    * x-axis scaling load balances requessts across multiple instances
      > ![x-axis]((https://github.com/peoffice/my_java_way/blob/master/架构/png/x-axis.png)
    * z-axis scaling routes requests based on an attribute of the request
      > ![z-axis]((https://github.com/peoffice/my_java_way/blob/master/架构/png/z-axis.png)
    * y-axis scaling functionally decomposes an application into services
      > ![y-axis]((https://github.com/peoffice/my_java_way/blob/master/架构/png/y-axis.png)
  * Microservices as a form of modularity
  * Each service has its own database
  * The FTGO microservice architecture
    > ![ftgo_microservice_architecture](https://github.com/peoffice/my_java_way/blob/master/架构/png/ftgo_microservice_architecture.png)
  * Comparing the microservice architecture and SOA
    > |    |SOA|Microservices|
    > |----|-----|-----|
    > |Inter-service communication|Smart pipes, such as Enterprise Service Bus, using heavyweight protocols, such as SOAP and the other WS* standards.|Dumb pipes, such as a message broker, or direct service-to-service communication, using lightweight protocols such as REST or gRPC|
    > |Data|Global data model and shared databases|Data model and database per service|
    > |Typical service|Larger monolithic application|Smaller service|
* Benefits and drawbacks of the microservice architecture
  * Benefits of the microservice architecture
    * It enables the continuous delivery and deployment of large, complex applications.
    * Services are small and easily maintained.
    * Services are independently deployable.
    * Services are independently scalable.
    * The microservice architecture enables teams to be autonomous.
    * It allows easy experimenting and adoption of new technologies.
    * It has better fault isolation.
  * Drawbacks of the microservice architecture
    * Finding the right set of services is chanenging
    * Distributed systems are complex, which makes development, testing, and deployment difficult.
    * Deploying features that span multiple services requires careful coordination.
    * Deciding when to adopt the microservice architecture is difficult
* The microservice architecture pattern language
  * Microservice architecture is not a silver bullet
  * Patterns and pattern language
    * A pattern is a reusable solution to a problem that occurs in a particular context. It's an idea that has its origins in real-world architecture and that has proven to be useful in software architecture and design.
  * Overview of the Microservice architecture pattern language
    > ![pattern_overview](https://github.com/peoffice/my_java_way/blob/master/架构/png/pattern_overview.png)
* Beyond microservices: Process and organization
  > ![process_organization](https://github.com/peoffice/my_java_way/blob/master/架构/png/process_organization.png)
* Summary
  * The monolithic architecture pattern structures the application as a single deployable unit.
  * The microservice architecture pattern decomposes a system into a set of independently deployable services, each with its own database.
  * The monolithic architecture is good choice for simple application, but microservice architecture is usually a better choice for large, comoplex applications.
  * The microservice architecture accelerates the velocity of software development by enabling small, autonomous teams to work in parallel.
  * The microservice architecture pattern language is a collection of patterns that help you architect an application using the microservice architecture. It helps you decide whether to use the microservice architecture, and if you pick the microservice architecture, the pattern language helps you apply it effectively.
  * You nned more than just the microservice architecture to accelerate software delivery. Successful software development also requires DevOpts and small, autonomous teams.
  * Don't forget about the human side of adopting microservices. You need to consider employees' emotions in order to successfully transition to a microservice architecture


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