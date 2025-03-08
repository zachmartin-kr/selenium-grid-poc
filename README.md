# Selenium Grid and Containerized Web Application Example

This project demonstrates how to run a Selenium Grid locally alongside a containerized web application. The Selenium Grid (with a hub and Chrome node) performs automated tests against the web application running in Docker.

## How to Run

1. **Start the Docker Containers Detached**  
   In the project root, run:
   ```bash
   docker-compose up -d --build
2. **Perform Maven Test**
   In the project root, run:
   ```bash
   mvn clean test

To view the Selenium Grid, once the containers have started navigate to localhost:4444 in your browser. If you want to watch the test as it is performed, click the Sessions tab on the left of the screen, and then the camera icon for the running node. The password is **secret**.
