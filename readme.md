# run services guide
## Eureka-server
1. Go to the microservice-eureka directory
```bash
cd microservice-eureka
```
2. Run the following command
```bash
docker-compose up --build
```
3. Open the browser and go to the following URL
```bash
http://localhost:8761/
```
microservice-eureka is running on port 8761, you can see the Eureka dashboard.
This server that will be used by all the microservices to register themselves.
