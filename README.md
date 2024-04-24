## Spring Boot Virtual Threads Explained: Easy Configuration & Examples
For complete understanding of Spring Boot Virtual Threads and how we can enable it inside the Spring Boot application you can checkout our blog.
<br/><br/>**Blog Link:** [Spring Boot Virtual Threads Explained: Easy Configuration & Examples](https://bootcamptoprod.com/spring-boot-virtual-threads/)
<br/>

# spring-boot-virtual-threads
A simple app demonstrating how we can use virtual threads in Spring Boot application for enhanced concurrency and performance

## App Overview
This is a simple app containing three endpoints: **/hello** for basic greetings, **/hello-with-delay** to simulate response delays, and **/hello-async** for asynchronous processing.

## JMeter Test Plan
To test the performance of Spring Boot application with and without virtual threads:
<br/>**1.** Enable or disable virtual threads in the application properties.
<br/>**2** Run the JMeter test plan and analyze the output in the response time graph to compare the performance under different configurations.

The JMeter Test Plan is available under the resources folder.
<br/>[src > main > resources > jmeter > Spring-Boot-Virtual-Threads.jmx]

## Postman Collection
Additionally, the Postman collection is available under the resources folder containing all the requests.
<br/>[src > main > resources > postman > Spring-Boot-Virtual-Threads.postman_collection.json]