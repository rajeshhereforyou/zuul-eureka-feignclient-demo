# zuul-demo
Sample Zuul to route your rest call to redirect to open google.com

##How to run this app?

Step 1: Clone this repo at  https://github.com/rajeshhereforyou/zuul-demo.git

Step 2: Once you cloned the repo,all the gradle dependencies should be resolved and available in your classpath to run the zuul router

Step 3: Now, you can run the app using Spring boot 'bootRun' command

Step 4: Once you have the app up and running, you can the health of the app using 'http://localhost:9090/actuator/health'. This should return '{"status":"UP"}'

Step 5: Now, to test the Zuul routing, if you hit 'http://localhost:9090/home', you would be automatically redirected the google store site. That's it.


If you are interested to see the zuul routing configuration, you can see the code at '/src/main/resources/application.yml' in this repo
