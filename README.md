A Simple Spring Boot Transaction Example
Check the account limit in PaymentUtils class

Start the application


Failure scenario
http://localhost:8080/api/bookFlightTicket
POST
{
  "passengerInfo":{
    "name":"Test User",
    "email":"testuser@testmail.com",
    "source":"Delhi",
    "Destination":"Mumbai",
    "travelDate":"22-09-20233",
    "pickupTime":"3PM",
    "arrivalTime":"6PM",
    "fare":"13000"
  },
  
  "paymentInfo":{
  	"accountNo":"acc1",
    "cardType":"credit"
  }
}


Success Scenario [Change the fare]
http://localhost:8080/api/bookFlightTicket
POST
{
  "passengerInfo":{
    "name":"Test User",
    "email":"testuser@testmail.com",
    "source":"Delhi",
    "Destination":"Mumbai",
    "travelDate":"22-09-20233",
    "pickupTime":"3PM",
    "arrivalTime":"6PM",
    "fare":"11000"
  },
  
  "paymentInfo":{
  	"accountNo":"acc1",
    "cardType":"credit"
  }
}
