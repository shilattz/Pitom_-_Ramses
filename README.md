Custom View + Threads

In this project we implement the application "Pithom and Ramses" 😊 in which a situation of workers trying to build a building while others are trying to destroy it is simulated ☹.
Every worker/destroyer is a walker. who tries to add/remove a stone from the building.

In order to avoid synchronization problems, we will need a supervisor (monitor) who will have to help make sure that there is no simultaneous access to the building. And he will have to put the workers to sleep when the building is ready (the destroyers haven't had time to destroy yet) or put the destroyers to sleep when there is nothing left to destroy. (And of course also wake them up at some point..)
Part A – the employee department:
The worker is represented by a class that inherits from the Thread class.
It accepts the marshal in the constructor - and saves it as a class variable - so that it can use the functions it will provide when needed.
In the Run function, the operator will run in an infinite loop in which it works to create bricks - and adds them to the building - using the orderer. Between creating one brick and another the verb goes to rest and sleep for one second.

Part B - The Destroyer Department:
The destructor is represented by a class that inherits from the Thread class.
It accepts the marshal in the constructor - and saves it as a class variable - so that it can use the functions it will provide when needed.
In the run function, the destroyer runs in an endless loop in which he toils to destroy bricks - by removing a brick from the building - using the bouncer. Between demolishing one brick and another, the destroyer goes to rest and sleep for half a second.

Part C - The usher's department:
The class will include an ArrayList of bricks, and provide methods for workers and destructors to do their "job".
And you will make sure to put the walkers to sleep and wake them up at the appropriate time. Of course the functions are defined in a way that will allow synchronization.

Part D - Building Department:
The class inherits from the View class
The department creates and saves as attributes the orderer and the operators and destroyers.
In the onDraw method, the method draws the bricks as rectangles on the screen.
In the constructor of the class, another thread is created that will run in an infinite loop and every short time will receive from the orderer the bricks that are on it for the axis.

The activity part:
  2 activities:
The first includes a title for the application, 2 text boxes to select the amount of operators and destroyers to create, as well as a button to move to the next screen.
On the second screen, only a "building" type component is defined
