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
* Add JAR files (the located under the lib folder of that zip file) to Eclispe project (Build path)

The automatic way is by using a build automation tool like Maven.

## Inversion of Control (IoC)

The approach of outsourcing the contruction and managment of objects.

The classic way to instatiate an object is by declaring a reference variable to an instatiation of the object. But there is a software engineering best practice which is "Code an interface". Which let easily change an object for another one.