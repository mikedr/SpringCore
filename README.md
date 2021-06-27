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
* XML configuration (Full XML configuration)
* Java annotations (XML component scan)
* Java Source Code (Java configuration class)

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

## Java Annotations
Java annotations are special markers add to Java classes. Annotations minimizes the XML configuration which could be big on large projects.

When we use annotations Spring scans the Java classes and automatically register the beans in the Spring container.

### Java annotations. Spring development process
1. Enable component scanning in Spring config file
2. Add the @Component annotation to the java classes
3. Retrieve bean from Spring container

#### Default Component names
The @Component annotation can be used: @Component("theChossenId") but if we use only @Component the id will be the class name with the first letter in lower case.

### Spring dependency injection with Annotations and Autowiring
For dependency injection Spring can use auto wiring. Spring  will look for a class that matches the property (matches by type: class or interface). Spring will inject it automatically... hence autowired. There are three autowiring injection types:

* Contructor Injection
* Setter injection
* Fied injection

#### Contructor injection

Inject dependencies by using the constructor of the class.

Process:

1. Define the dependency interface and class
2. Create contructor in your class for injections
3. Configure the dependency injection with @Autowired annotation

#### Setter injection

Inject dependencies by calling setter methods on the class.

Process:

1. Create setter methods in the class for injections
2. Configure the dependency injection with @Autowired annotation

#### Method injection

Inject dependencies by calling ANY method in the class.

#### Field injection

Inject dependencies by setting fields values in the class (even private fields).

#### Qualifiers for dependency injection

So far we used autowiring, where Spring will look for @Component annotation and then it looks for a clase which iplements that interface. But, what happends if there are more multiple implementation of the needed interface? In this case we need to tell Spring which bean to use by using the @Qualifier annotation.

#### Annotations - Default Bean Names - The Special Case

Annotations - Default Bean Names ... and the Special Case

In general, when using Annotations, for the default bean name, Spring uses the following rule.

If the annotation's value doesn't indicate a bean name, an appropriate name will be built based on the short name of the class (with the first letter lower-cased).

For example:

HappyFortuneService --> happyFortuneService

---

However, for the special case of when BOTH the first and second characters of the class name are upper case, then the name is NOT converted.

For the case of RESTFortuneService

RESTFortuneService --> RESTFortuneService

No conversion since the first two characters are upper case.

#### How to inject properties file using Java annotations

1. Create a properties file to hold your properties. It will be a name value pair 
2. Load the properties file in the XML config file
3. Inject the properties values into your code

### Bean scopes	with annotations

The default scope is singleton.

#### Bean lifecycle with annotations

1. Define the methods for init and destroy
2. Add annotations @PostConstruct and @PreDestroy

## Spring Configuration with Java Code (no xml)

#### Development process

1. Create a class and annotate as @Configuration 
2. Add component scanning support: @ComponentScan (Optional)
3. Read Spring Java configuration class
4. Retrieve bean from Spring container

#### Defining Spring Beans with Java Code (no xml)

1. Define method to expose bean
2. Inject bean dependencies
3. Read Spring Java configuration class
4. Retrieve bean from Spring container

#### Injecting Values from Properties File

1. Create propeties file
2. Load properties file in Spring config
3. Reference values from properties file