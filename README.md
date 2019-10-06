# spring-rest
A demonstration of Spring Boot REST API

Files created -------
1.Spring initialiser 
2.Controller
3.DAO
4.Model

Methods to import project -------
1. Import an existing maven project
2. Download all the dependencies i.e. maven dependencies
3. Run application with Spring Boot App
4. Bang the server will be up and running at http://localhost:8080/ , incase this port is free.

Method to test the API -------
1. Open POSTMAN, go to Headers set Accepts as application/json, next
2. Go to the [endpoint]  http://localhost:8080/employees/ in your POSTMAN with GET method and hit on Send.
3. Boom you will get output like this:

{
    "employeeList": [
        {
            "id": 1,
            "firstName": "Subham",
            "lastName": "Sahu",
            "email": "subhamkumar.official@gmail.com"
        },
        {
            "id": 2,
            "firstName": "Korai",
            "lastName": "Purusottam",
            "email": "kpurusottam@gmail.com"
        },
        {
            "id": 3,
            "firstName": "Deepak",
            "lastName": "Bali",
            "email": "deepak@gmail.com"
        }
    ]
}

4. Now Go to the [endpoint] http://localhost:8080/employees/ in your POSTMAN with POST method and add the below request in JSON and hit Send.

{ "firstName":"Siddharth","lastName":"Panigrahi","email":"siddharthp@gmail.com"}

you will see: Status 201 Created 79ms 125 B

5. Now in order to check if the record is added or not, go to [endpoint] http://localhost:8080/employees/ with GET method and hit on Send.
6. You played with GET and POST method.

Thank you. Happy Learning.
