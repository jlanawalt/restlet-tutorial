# Restlet Framework JAX-RS Java EE Servlet WebApp Maven Sample Implementation

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

The main class is : `MyJaxRsApplication.java`

This class is based on the JAX-RS "easy" application from the Restlet Framework
user guide for the JAX-RS extension using the Java EE edition.

https://restlet.talend.com/documentation/user-guide/2.3/extensions/jaxrs

By default the application is launched at a context path of /RFJaxRSJavaEE and the
route is bound to the relative URL /easy.

The exact hostname and port used will depend on your Servlet Container's configuration.
The default Apache Tomcat URL would be `http://localhost:8080/RFJaxRSJavaEE/easy`.

### Project Creation Notes

This Restlet JAX-RS JavaEE example was bootstrapped using the Maven mvn archetype:generate
with the archetype artifact ID maven-archetype-webapp.

mvn.cmd archetype:generate -DgroupId=org.restlet.tutorial.javaee -DartifactId=RFJavaEE 
-DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

The pom.xml was then adapted from the org.restlet.tutorial.webapi RFSampleFullWebAPI,
switching from the Java SE (Group ID org.restlet.jse) to the Java EE edition 
(Group ID org.restlet.jee) libraries and the dependencies were paired down to
just org.restlet and org.restlet.ext.servlet.

The Restlet Framework JAX-RS example "simple" app uses a test.restlet.jaxrs
and focuses on a Java SE standalone run, and gives a partial Servlet example
extending JaxRsApplication. This example uses the org.restlet.tutorial.javaee 
package/namespace and fills out the config files to a working example. 

Software Versions:

 * JDK 8
 * JDK 17
 * Maven 3.9.5 (Bundled with NetBeans 20)
 * Tomcat 9.0.84
 * NetBeans 20*

*Initial editing and testing was done with the NetBeans 20 IDE, but IDE specific
configuration files will be excluded from the repository.