# Spring
Spring framework from scratch

## Why Spring?

Becasue is a simplier and lightweight alternative to J2EE. Because early version of EJB were extremely complex (Multiple deploymnet descriptor, interfaces...)

### Goals of Spring

* Lightweight development with java POJOs
* Dependency injection to promote loose coupling
* Declarative programming with Aspect-Oriented-Programming (AOP)
* Minimize the boilerplate java code

## The steps to start a Spring project manually

* Create a Eclispe project (File/New/Java Project)
* Download Spring JAR files (https://repo.spring.io/release/org/springframework/spring/5.3.6/spring-5.3.6-dist.zip)
* Add JAR files (the located files under the lib folder of that zip file) to Eclispe project (Build path)

The automatic way is by using a build automation tool like Maven.

## Inversion of control (IoC)

The approach of outsourcing the construction and management of objects.

The classic way to instantiate an object is by declaring a reference variable to an instantiation of the object. But there is a software engineering best practice which is "Code an interface". Which let easily change an object for another one.

### Spring container
#### Primary functions:
* Create and manage objects (Inversion of control)
* Inject object's dependencies (Dependency injection)

#### Configuring and spring container, there are three options:
* XML configuration
* Java annotations
* Java Source Code

## XML configuration. Spring development process
1. Configure your Spring Beans
2. Create a Spring Container
3. Retrieve Beans from Spring Container

## Dependency injection
The client delegates to calls to another object the responsibility of providing its dependencies.
The most common type of dependencies injection:
* Constructor injection
* Setter injection

### Constructor injection
Inject dependencies by calling the constructor on your class.

#### Development process. Constructor injection
1. Define the dependency interface and class
2. Create a constructor in your class for injections
3. Configure the dependency injection in Spring configuration file

### Setter injection
Inject dependencies by calling setter method(s) on your class.

#### Development process. Setter injection
1. Create setter method(s) in your class for injections
2. Configure the dependency injection in Spring configuration file

## Spring bean scopes and Lifecycle
Scopes refers to the lifecycle of a bean. How long does the bean live? How many instances are created? How is the bean shared?
By default the scope is singleton, it means that Spring Container creates only one instance of the bean by default, it is cached in memory and all requests for the bean will return a shared reference of the same bean.

Additional spring bean scopes:

| Scope	| Description |
| :----: | :----: |
| singleton	| Creates a single shared instance of the bean |
| prototype	| Creates a new instance bean for each container request |
| request 	| Scoped to and HTTP web request. Only used for web apps |
| session	| Scoped to and HTTP web session. Only used for web apps |
| global-session	| Scoped to a global HTTP web session. Only used for web apps |

Bean Lifecycle

![alt text](https://github.com/mikedr/Spring/blob/main/images-readme/beanLifecycle.png)

### Java Annotations
Java annotations are special markers add to Java classes. Annotations minimizes the XML configuration which could be big on large projects.

When we use annotations Spring scans the Java classes and automatically register the beans in the Spring container.

## Java annotations. Spring development process
1. Enable component scanning in Spring config file
2. Add the @Component annotation to the java classes
3. Retrieve bean from Spring container
