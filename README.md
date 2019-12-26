# [](https://github.com/metcs/met-cs665-assignment-2-jpperezt/blob/master/README.md#assignment-2---cs665-boston-university---by-jose-perez-torres)Assignment #2 - CS665 Boston University - By Jose Perez Torres

This is a Java Maven Project corresponding to the **Assignment #2** in the CS665 course - Software Dessign and Patterns. This application is the responsible for handling the notiﬁcation system to send notiﬁcations about delivery requests to drivers.

# [](https://github.com/metcs/met-cs665-assignment-1-jpperezt/blob/master/README.md#implementation-description)Implementation Description

-   This application is based on the **Observer Pattern**.
    
    > Observable Package --> Contains the Subject interface (ShopSubject) and the Concrete Subject class (ShopNotificationSystem)   which controls:
    
	    > Register  -->  Add a new driver in the consortium
	    > Remove -->  Remove a driver in the consortium
	    > Update  --> Notify all the drivers with the delivery request
    
    > Observer Package --> Contains the Observer interface (DriverObserver) and the Concrete Observer class (BasicNotification) who is the responsible to update or notify all the drivers presenting the Delivery Request.


   -   It was designed for handling flexibility and reusability, it means that if we want to add certain functionality it will be easy to implement. I used the DisplayDeliveryRequest interface for handling any different way to display the notification., i.e. I will add a new vehicle type in the consortium and it could have a different way to display the notification.
    
-   This implementation is **Sufficiency** because is getting the requirements for this assignment.
    
    > Controls the notiﬁcation system to send notiﬁcations about delivery requests to drivers. When a store gets a product delivery orders should be created at store and a delivery request should be broadcasted to all drivers.

    
-   This implementation is **Understandable ** because any other Java Programmer could be read it and understand easily.
    
    > Class and Variable Naming reflect the purpose and meaning of its existence, following the Observer Pattern. Coupling was thinking in this design, so, each class can act separately.
    
-   This implementation is avoiding duplicated code using polymorphism to get different behaviors with the same code only depending of the vehicle type in the case of the notifications display. 


# [](https://github.com/metcs/met-cs665-assignment-2-jpperezt/blob/master/README.md#uml-diagrams)UML diagrams

**Class Diagram** (https://picasaweb.google.com/113574334349572414933/6741031691144590337#6741031689657410706 "Assignment2-UML-jpperezt")

Also it could be find under the src/uml folder inside the project.
