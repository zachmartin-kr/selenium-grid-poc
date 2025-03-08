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
