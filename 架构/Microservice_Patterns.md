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
* Overview of interprocess communication in a microservice architecture
  * interaction styles
    > ||one-to-one|one-to-many|
    > |-----|------|-------|
    > |Synchronous|Request/response||
    > |Asynchronous|Asynchronous; request/response; one-way notifications|publish/subscribe; publish/async response| 
    * one-to-one way
      * Request/response - A service client makes a request to a service and waits for a response. The client expects the response to arrive in a timely fashion. It might event block while waiting. This is an interfaction style that generally results in services being tightly coupled.
      * Asynchronous request/response - A service client sends a request to a service, which replies asynchronously. The client doesn't block while waiting, because the service might not send the response for a long time.
      * one-way notifications - A service client sends a request to service, but no reply is expected or sent.
    * one-to-many way
      * publish/subscribe - A client publishes a notification messages, which is consumed by zero or more interested services
      * publish/async responses - A client publishes a request message and then waits for a certain amount of time for responses from interested services.
* Communicating using the synchronous remote procedure invocation pattern
  > [Pattern:Remote procedure invocation]((http://microservices.io/patterns/communication-style/messaging.html)
  > ![rpc.png](https://github.com/peoffice/my_java_way/blob/master/架构/png/rpc.png)
    * Using REST
      * REST is an IPC mechanism that (almost always) uses HTTP.
      * REST provides a set of architectural constrains that, when applied as a whole, emphasizes scalability of component interractions generality of interfaces, independent deployment of components, and intermediary components to reduce interaction latency, enforce, enforce security, and encapsulate legacy systems.
      * Benefits to using REST
        * It's simple and familiar
        * You can test an HTTP API from within a browser using, for example, the Postman plugin, or from the command line using curl(assuming JSON or some other text format is used)
        * It directly supports request/response style communication
        * HTTP is, of course, firewall friendly.
        * It doesn't require an intermediate broker, which simplifies the system's architecture
      * Drawbacks to using REST
        * It only suports the request/response style of communication
        * Reduced availiability. Because the client and service communicate directly without an intermediary to buffer messages, they must both be running for the duration of the exchange.
        * Clients must know the lcoations(URLs) of the service instance(s). As descirbed in section 3.2.4, this is nontrivial problem in a modern application. Clients must use what is known as a service discovery mechanism to locate servie instances.
        * Fetching multiple resources in a single request is challenging
        * It's sometimes difficult to map multiple update operations to HTTP verbs.
    * Using [gRPC](www.grpc.io)
      > As mentioned in the preceding section, one challenge with using REST is that because HTTP only provides a limited number of verbs, it's not always straightforward ot design a REST API that supports multiple update operations.
    * Handling partical failure using the circuit breaker pattern.
      * [Pattern: Circuit breaker](http://microservices.io/patterns/reliability/circuit-breaker.html)
        > An RPI proxy that immediately rejects invocations for a timeout period after the number of consecutive failures exceeds a specified threashold.
    * Using service discovery
      * [Pattern: Self registration](http://microservices.io/patterns/self-registration.html)
        > A service instance registers itself with the service registry.
      * [Pattern: Client-side discovery](http://microservices.io/patterns/clientside-discovery.html)
        > A service client retrieves the list of available service instances from the service registry and load balances across them.
      * [Pattern: 3rd party registration](http://microservices.io/patterns/3rd-party-registration.html)
        > Service instances are automatically registered with the service registry by a third party.
      * [Pattern: Server-side discovery](http://microservices.io/patterns/server-side-discovery.html)
        > A client makes a request to a router, which is responsible for service discovery.
* Communicating using the asynchronous messaging pattern
  > A messaging-based appliction typically uses a message broker, which acts as an intermediary between the servies, although another option is to use a brokerless architecture, cchere the services communicate directly with each other.
  * [Pattern: Messaging](http://microservices.io/patterns/communication-style/messaging.html)
    > A client invokes a service using asynchronous messaging.
  * Implementing the interaction styles using messaging
    > ![implement_messaging](https://github.com/peoffice/my_java_way/blob/master/架构/png/implement_messaging.png)
  * Creating an API specification for a messaging-based service API
    > ![api_messaging](https://github.com/peoffice/my_java_way/blob/master/架构/png/api_messaging.png)
  * Using a message broker
    > ![message_broker](https://github.com/peoffice/my_java_way/blob/master/架构/png/message_broker.png)
    * Brokerless messaging
      > In a brokerless architecture, services can exchange messages directly. [ZeroMQ](http://zeromq.org) is a popular brokerless messaging technology.
      * Benefits
        * Allows lighter network traffic and better lateny, because messages go directly from the sender to the receiver, instead of having to go from the sender to the message broker and from there to the receiver
        * Eliminates the possibility of the message broker being a performance bottle-neck or single point of failure
        * Features less operational complexity, because there is no message broker to set up and maintain
      * Drawbacks
        * Servies need to know about each other's locations and must therefore use one of the discovery mechanisms describer earlier in section 3.2.4
        * It offers reduced availability, because both the sender and receiver of a message must be available while the message is being exchanged.
        * Implementing mechannisms, such as guaranteed delivery, is more challenging.
    * Broker-based messaging
      > A message broker is an itermediary through which all messages flow. A sender writes the message to the message broker, and the message borker delivers it to the receiver. An important benefit of using a message broker is that the sender doesn't need to know the network location of the consumer. Another benefit is that a message broker buffers messages until the consumer is able to process them.
      * Examples
        * [ActiveMQ](http://activemq.apache.org)
        * [RabbitMQ](https://www.rabbitmq.com)
        * [Apache Kafka](http://kafka.apache.org)
      * Benefits
        * Loose coupling
        * Message buffering
        * Flexible communication
        * Explicit interprocess communication
      * Drawbacks
        * Potential performance bottleneck
        * Potential single point of failure
        * Additional operational complexity
    * Handling duplicate messages
      * Write idempotent message handlers
      * Track messages and discard duplicates
    * Transactinal messaging
      * [Pattern: Transactinal outbox](http://microservices.io/patterns/data/transactional-outbox.html)
        > Publish an event or message as part of a database transaction by saving it in an OUTBOX in the database.
      * [Pattern: Polling publisher](http://microservices.io/patterns/data/polling-publisher.html)
        > Publish messages by polling the outbox in the database.
      * [Pattern: Transaction log tailing](http://microservices.io/patterns/data/transaction-log-tailing.html)
        > Publish changes made to the database by tailing the transaction log.
* Using asynchronous messaging to improve availability
  * Synchronous communication reduces availability
    > REST is an extremely popular IPC mechanism. You may be tempted to use it for interservice communication. The problem with REST, though, is that it's a synchronous protocol: an HTTP client must wait for the service to send a response. Whenever services commuicate using a synchronous protocol, the availability of the application is reduced.
  * Eliminating synchronous interaction
    > ![asyn_message](https://github.com/peoffice/my_java_way/blob/master/架构/png/asyn_message.png)
    > ![async_message_2](https://github.com/peoffice/my_java_way/blob/master/架构/png/async_message_2.png)
* Summary
  * The microservice architecture is a distributed architecture, so interprocess communication plays a key role.
  * It's essential to carefully manage the evolution fo a service's API. Backward-compatible changes are the easiest to make because they don't impact clients. If you make a breaking change to a service's API, it will typically need to support both the old and new version until its clients have been upgraded.
  * There are numerous IPC technologies, each with different trade-offs. One key design decision is to choose either a synchronous remote proccedure invocation pattern or the asynchronous Messaging pattern. Synchronous remote procedure invocation-based protocols, such as REST, are the easiest to use. But services should ideally communicate using asynchronous messaging in order to increase availability.
  * In order to prevent failures from cascading through a system, a service client that uses a synchronous protocol must be designed to handle partial failures, which are when the invoked service is either down or exhibiting high latency. In particular, it must use timeouts when making requests, limit the number of outstanding requests, and use the Circuit breaker pattern to avoid making calls to a failing service.
  * An architecture that uses synchronous protocols must include a service discovery mechanism in order for clients to determine the network location of a service instance. The simplest approach is to use the service discovery mechanism implemented by the deployment platform: the Server-side discovery and 3rd party registration patterns. But an alternative approach is to implement service discovery at the application level: the Client-side discovery and Self registration patterns. It’s more work, but it does handle the scenario where services are running on multiple deployment platforms.
  * A good way to design a messaging-based architecture is to use the messages and channels model, which abstracts the details of the underlying messaging system. You can then map that design to a specific messaging infrastructure, which is typically message broker–based.
  * One key challenge when using messaging is atomically updating the database and publishing a message. A good solution is to use the Transactional outbox pattern and first write the message to the database as part of the database transaction. A separate process then retrieves the message from the database using either the Polling publisher pattern or the Transaction log tailing pattern and publishes it to the message broker.


#### 4. Managing transactions with sagas
* Transaction management in a microservice architecture
  * The need for distributed transactions in a microservice arthitecture
    > ![need_transaction](https://github.com/peoffice/my_java_way/blob/master/架构/png/need_transaction.png)
  * The trouble with distributed transaction
    > The traditional approach to maintaining data consistency across multiple services, databases, or message brokers is to use distributed transactions.
  * Using the Saga pattern to maintain data consistency
    > Sagas are mechanisms to maintain data consistency in microservice architecture without having to use distributed transactions. You define a saga for each system command that needs to update data in multiple srevices. A saga is a sequence of local transactions. Each local transaction updates data within a single service using the familiar ACID transaction frameworks and libraries mentioned earlier.
    * [Pattern: Saga](http://microservices.io/patterns/data/saga.html)
      > Maintain data consistency across services using a sequence of local transactions that are coordinated using asynchronous messaging.
* Coordinating sagas
  > A saga's implementation consists of logic that coordinates the steps of the saga. When a saga is initiated by system command, the coordination logic must select and tell the first saga participant to execute a local transaction. Once that transaction completes, the saga's sequencing coordination selects and invokes the next saga participant. This process continues until the saga has executed all the steps. If any local transaction fails, the saga must execute the compensating transactions in reverse order.
  * There are a couple of different ways to structure a saga's coordination logic:
    * Choreography - Distributed the decision making and sequencing among the saga partipants. They primarily communicate by exchanging events
      > ![chor_ok](https://github.com/peoffice/my_java_way/blob/master/架构/png/chor_ok.png)
      > ![chor_fail](https://github.com/peoffice/my_java_way/blob/master/架构/png/chor_fail.png)
    * Orchestration - Centralize a saga's coordination logic in a saga orchestrator class. A saga orchestrator sends command messages to saga participants telling them which operations to perform.
      > ![orch](https://github.com/peoffice/my_java_way/blob/master/架构/png/orch.png)


#### 5. Designing business logic in a microservice arthitecture
* Business logic organization patterns
  * Designing business logic using the transaction script pattern
    * Pattern: Transaction script
      > Organize the business logic as a collection of procedural transaction scripts, one for each type of request.
  * Designing business logic using the domain model pattern
    * Pattern: Domain model
      > Organize the  business logic as an object model consisting of classes that have state and behavior
  * About Domain-driven design
    * DDD, which is described in the book Domain-Driven Desing, is a refinemetn of DDD and is an approach for developing complex business logic.
    * DDD also has some tacticl patterns that are building blocks for domain models. Each pattern is a role that a class plays in a domain model and defines the characteristics of the class
* Desinging a domain model using the DDD aggregate pattern
  > In traditional object-oriented design, a domain model is a collection of classes and relationships between classes. The classes are ususlly organized into packages.
  > ![ddd_demo](https://github.com/peoffice/my_java_way/blob/master/架构/png/ddd_demo.png)
  * The problem with fuzzy boundaries
  * Aggregates have explicit boundaries
    * Pattern: Aggregate
      > Organize a domain model as a collection of aggregates, each of which is a graph of objects that can be treated as a unit.
  * Aggregate rules
    * reference only the aggregate root
    * inter-aggregate referencces must use primary keys
    * one transaction creates or updates one aggregate
  * Aggregate granularity
  * Desinging business logic with aggregates
* Publishing domain events
  * Merriam-Webster lists several definitions of the word event, including these:
    * something that happens
    * a noteworthy happening
    * a social occasion or activity
    * an adverse or damaging medical occurence, a heart attack or other cardiac event
* Summary
  * The procedural transaction script pattern is often a good way to implement simple business logic. But when implementing complex business logic you should consider using the object-oriented domain model pattern
  * A good way to organize a service's business logic is as a collection of DDD aggregates. DDD aggregates are useful because they modularize the domain model, eliminate the possibility of object reference between services, and ensure that each ACID transaction is within a service
  * An aggregate should publish domain events when it's created or updated. Domain events have a wide variety of uses.


#### 6. Developing business logic with event sourcing
* Developing business logic using event sourcing
  > Event sourcing is a different way of structuring the business logic and persisting aggregates. I persist an aggregate as a ssequence of events. Each event represents a state change of the aggregate. An application recreates the current state of an aggregate by replaying the events.
  * [Pattern: Event sourcing](http://microservices.io/patterns/data/event-sourcing.html)
    > Persist an aggregate as a sequence of domain events that represent state changes
  * Benefits of event sourcing
    * reliably publishes domain events
    * preserves the history of aggregates
    * mostly avoids the o/r impedance mismatch problem
    * provides developers with a time machine
  * Drawbacks of event sourcing
    * it has a different programming model that has a learning curve
    * it has the complexity of a messaging-based application
    * evolving events can be tricky
    * deleting data is tricky
    * querying the event store is challenging
* Implementing an event store
  > An application that uses event sourcing stores its events in an event sotre. An event store is a hybrid of a database and a message broker. It behaves as a database because it has an API for inserting and retrieving an aggregate's events by primary key. And it behaves as a message broker because it has an API for subscribing to events.
* Using sagas and event sourcing together
* Summary
  * Event sourcing persists an aggregate as a sequence of events. Each event represents either the creation of the aggregate or a state change. An application recreates the state of an aggregate by replaying events. Event sourcing preserves the history of a domain object, provides an accurate audit log, and reliably publishes domain events
  * Snapshots improve performance by reducing the number of evetns that must be replayed.
  * Events are stored in an event store, a hybrid of a database and a message broker. When a service saves an event in an event store, it delivers the event to substribers.
  * Eventuate Local is an open source event store based on MySql and Apach Kafka. Developers use the Eventuate client framework to write aggregates and event handlers.
  * One challenge with using event sourcing is handling the evolution of events. An application potentially must handle multiple event versions when replaying evetns. A good solution is to use upcasting, which upgrades events to the latest version when they're loaded from the event store.
  * Deleting data in an event sourcing application is triky. An application must use techniques such as encryption and pseudonymization in order to comply with regrlations like the European Union's GDPR that requires an application to erase an individual's data.
  * Event sourcing is a simple way to implement choreography-based sagas. Services have event handlers that listen to the events published by event sourcing-based aggregates
  * Event sourcing is a good way to implement saga orchestrators. As a result, you can write applications that exclusively use an event store.


#### 7. Implementing queries in a microservice architecture
* Querying using the API composition pattern
  * [Pattern: API composition](http://microservices.io/patterns/data/apicomposition.html)
    > Implement a query that retrieves data from several services by querying each service via its API and combining the results.
* Using the CQRS pattern
  * [Pattern: Command query responsibility segregation](http://microservices.io/patterns/data/cqrs.html)
    > Implement a query that needs data from several services by using events to maintain a read-only view that replicates data from the services.
  * CQRS is a generalization of this kind of architecture. It maintains one or more view databases-not just text search databases - that implement one or omroe of the application's queries.
  * Overview of CQRS
    * CQRS separates commands from queries
      > ![cqrs_ar](https://github.com/peoffice/my_java_way/blob/master/架构/png/cqrs_ar.png)
    * Benefits of CQRS
      * Enables the efficient implementation of queries in a microservice architecture
      * Enables the efficient implementation of diverse queries
      * Makes querying possible in an event sourcing-based application
      * Improves separation of concerns
    * Drawbacks of CQRS
      * More complex architecture
      * Dealing with the replication lag
* Designing CQRS views
  > [cqrs_desing](https://github.com/peoffice/my_java_way/blob/master/架构/png/cqrs_desing.png)
* Summary
  * Implementing queries that retrieve data from multiple services is challenging because each service’s data is private.
  * There are two ways to implement these kinds of query: the API composition pattern and the Command query responsibility segregation (CQRS) pattern.
  * The API composition pattern, which gathers data from multiple services, is the simplest way to implement queries and should be used whenever possible.
  * A limitation of the API composition pattern is that some complex queries require inefficient in-memory joins of large datasets.
  * The CQRS pattern, which implements queries using view databases, is more powerful but more complex to implement.
  * A CQRS view module must handle concurrent updates as well as detect and discard duplicate events.
  * CQRS improves separation of concerns by enabling a service to implement a query that returns data owned by a different service.
  * Clients must handle the eventual consistency of CQRS views.

#### 8. External API patterns




#### 9. Testing microservices: Part 1




#### 10. Tesing microservices: Part 2




#### 11. Developing production-ready services




#### 12. Deploying microservices




#### 13 Refactoring to microservides






































