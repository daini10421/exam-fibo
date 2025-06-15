FROM openjdk:17
COPY   .    /my_java_app
WORKDIR   /my_java_app  
RUN   javac   FibonacciSum.java
CMD  ["java",  "FibonacciSum"]