# What is this app
This is a simple Spring boot 2 app demonstrating integration of zuul, Eureka and Feign Client

## Pre-requisite

1. Before running this app, you have to make sure that you have the a sample Eureka server is up and running. 
You can find the instructions and code to build and deploy a sample Eureka server using Spring Boot 2 at 

https://github.com/rajeshhereforyou/eureka-server-demo 

2. You need a Spring boot 2 app with a Feign client 

## How to run this app?

Step 1: Clone this repo at  https://github.com/rajeshhereforyou/zuul-demo.git

Step 2: Once you cloned the repo,all the gradle dependencies should be resolved and available in your classpath to run the zuul router

Step 3: Now, you can run the app using Spring boot 'bootRun' command

Step 4: Once you have the app up and running, you can the health of the app using 'http://localhost:9090/actuator/health'. This should return '{"status":"UP"}'

Step 5: Now, to test the Zuul routing, if you hit 'http://localhost:9090/home', you would be automatically redirected the google store site. That's it.


If you are interested to see the zuul routing configuration, you can see the code at '/src/main/resources/application.yml' in this repo

## How the Zuul, Eureka and Feign is working together

If you hit http://localhost:9090/test-feign/user/1, then it should hit the endpoint '/user/{userId}' of 'EurekaFeignClientDemoApplication' app based on the zuul routing specified at '/src/main/resources/application.yml' and execute that method
