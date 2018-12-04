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
      > ![x-axis](https://github.com/peoffice/my_java_way/blob/master/架构/png/x-axis.png)
    * z-axis scaling routes requests based on an attribute of the request
      > ![z-axis](https://github.com/peoffice/my_java_way/blob/master/架构/png/z-axis.png)
    * y-axis scaling functionally decomposes an application into services
      > ![y-axis](https://github.com/peoffice/my_java_way/blob/master/架构/png/y-axis.png)
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
* What is the microservice architecture exactly?
  * Software architecture is its high-level structure, which consists of constituent parts and the dependencies between those parts.
  * A definition of software architecture
    > The software architecture of a computing system is the set of structures needed to reason about the system, which comprise software elements, relations among them, and properties of both.
    * Decomoposition is important for a couple of reasons
      * It facilitates the division of labor and knowledge.
      * It defines how the software elements interact.
  * The 4+1 view model of software architecture
    > ![4_1_view_model.png](https://github.com/peoffice/my_java_way/blob/master/架构/png/4_1_view_model.png)
      * Logical view - The software elements that are created by developers. In object-oriented languages, these elements are classes and packages. The realtions between them are the relationships between classes and packages, including inheritance, associations, and depends-on.
      * Implementatin view - The output of the build system. This view consists of modules, which represent packaged code, and components which are executable or deployable units consisting of one or more modules. In Java, a module is a JAR file, and a component is typically a WAR file or an executable JAR file. The relations between them include dependency relationships between modules and composition relationships between components and modules
      * Process view - The components at runtime. Each element is a process, and the relations between processes represent interprocess communication.
      * Deployment view - How the processes are mapped to machines. The elemetns in this view consist of (physical or virtual) machines and the processes. The relations between machines represent networking. This view also describes the relationship between processes and machines.
  * Why architecture matters(tow categories of requirements)
    * functional requirements
    * quality of service requirements
  * Overview of architectural styles
    > An architectural style, then, defines a family of such systems in terms of a pattern of structural organization. More specifically, an architectural style determines the vacabulary of components and connectors that can be used in instance of that style, together with a set of constrains on how they can be combined.
    * The layered architectural style
    * The hexagonal architectural style
    * The microservice architecture
      * What is a service?
        > A service is a standalone, independently deployable software component that implements some useful functionality.
      * What is loose coupling?
        > An important characteristic of the microservice architecture is that the services are loosely coupled. All interaction with a service happens via its API, which encapsulates its implementation details.
      * The role of shared libraries
        > Developers often package functionality in a library so that it can be reused by multiple applications without duplicating code. But you must consider that you don't increase coupling between services.
      * The size of a service is mostly unimportant
        > microservice dont' mean it is small or micro, it just means that your service is standalone.
* Defining an application's microservice architecture
  > ![define_ma.png](https://github.com/peoffice/my_java_way/blob/master/架构/png/define_ma.png)
  * Identifying the system operations
    > ![defining_dd.png](https://github.com/peoffice/my_java_way/blob/master/架构/png/defining_dd.png)
  * Defining services by applying the decompose by business capability pattern
    > [Pattern:Decompose by business capability](http://microservices.io/patterns/decomposition/decompose-by-business-capability.html)
    > ![decompose_services.png](https://github.com/peoffice/my_java_way/blob/master/架构/png/decompose_services.png)
  * Defining services by applying the decompose by sub-domain pattern
    > [Pattern:Decompose by subdomain](http://microservices.io/patterns/decomposition/decompose-by-subdomain.html)
    > ![sub_domain.png](https://github.com/peoffice/my_java_way/blob/master/架构/png/sub_domain.png)
  * Decomposition guidelines
    * Single responsibility principle
      > A class should have only one reason to change.
    * Common Closure Principle
      > The classes in a package should be closed together against the same kinds of changes. A change that affects a package affects all the classes in that package.
  * Obstacles to decomposing an application into services
    * Network latency
    * Reduced availability due to synchronous communication
    * Maintaining data consistency across services
    * Obtaining a consistent view of the data
    * Good classes preventing decomposition
* Summary
  * Architecture determines your application's -ilities, including maintainability, testability, and deployability, which directly impact development velocity.
  * The microservice architecture is an architecture style that gives an application high maintainability, testability, and deployability.
  * Services in a microservice architecture are organized around business concerns business capabbilities or subdomains - rather than technical concerns.
  * There are two patterns for decomposition:
    * Decompose by business capability, which has its origins in business architecture
    * Decompose by subdomain, based on concepts from domain-driven desing
  * You can eliminate god classes, which cause tangled dependencies that prevent decomposition, by applying DDD and defining a seperate domain model for each service.


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






































