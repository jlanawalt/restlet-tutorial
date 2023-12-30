# Restlet Framework Java EE Servlet WebApp Maven Sample Implementation

## Prerequisites

* Maven installed on your machine: [Maven documentation link](http://maven.apache.org/index.html)

* Git installed on your machine

The implementation is located [here](https://github.com/jlanawalt/restlet-tutorial/tree/java-ee/modules/org.restlet.tutorial.webapi.javaee). You can clone this repository; the source code is located in `/modules/org.restlet.tutorial.javaee/` folder.

This example uses [Restlet Framework 2.3.0](https://restlet.talend.com/downloads/current/) (Java EE edition).

Restlet Framework's User Guide is available [here](https://restlet.talend.com/documentation/user-guide/2.3/editions/overview).

## Installation

### Install Maven project

To install the Maven project:
* Go to the root directory of the your local copy of the git repository.
* Execute `mvn clean install`
* For eclipse users : run `mvn eclipse:eclipse`

For further instruction about running a Maven project : [Building a project with Maven](http://maven.apache.org/run-maven/index.html)

### Run this application

The main class is : `FirstStepsApplication.java`

This class is based on the "hello, world" application from the Restlet Framework
user guide for the Java EE edition.

https://restlet.talend.com/documentation/user-guide/2.3/editions/jee/overview

By default the application is launched at a context path of /RFJavaEE and the
route is bound to the relative URL /hello.

The exact hostname and port used will depend on your Servlet Container's configuration.
The default Apache Tomcat URL would be `http://localhost:8080/RFJavaEE/hello`.

### Project Creation Notes

This Restlet JavaEE example was bootstrapped using the Maven mvn archetype:generate
with the archetype artifact ID maven-archetype-webapp.

mvn.cmd archetype:generate -DgroupId=org.restlet.tutorial.javaee -DartifactId=RFJavaEE 
-DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

The pom.xml was then adapted from the org.restlet.tutorial.webapi RFSampleFullWebAPI,
switching from the Java SE (Group ID org.restlet.jse) to the Java EE edition 
(Group ID org.restlet.jee) libraries and the dependencies were paired down to
just org.restlet and org.restlet.ext.servlet.

The Restlet Framework Java EE Overview "hello, world" app uses a firstSteps
package and a WAR file and servlet context name of firstStepsServlet. This
example instead uses the org.restlet.tutorial.javaee package/namespace to better
fit the restlet-tutorial and an artifact ID/context of RFJavaEE. 

Software Versions:

 * JDK 8
 * JDK 17
 * Maven 3.9.5 (Bundled with NetBeans 20)
 * Tomcat 9.0.84
 * NetBeans 20*

*Initial editing and testing was done with the NetBeans 20 IDE, but IDE specific
configuration files will be excluded from the repository.