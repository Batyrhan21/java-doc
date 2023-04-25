package OOP;

public class General {
    int x = 5;

    public static void main(String[] args) {
        General myObj = new General();
        System.out.println(myObj.x);

        General myCar = new General();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    /*Example explained

    1) We created a custom Main class with the class keyword.

    2) We created the fullThrottle() and speed() methods in the Main class.

    3) The fullThrottle() method and the speed() method will print out some text, when they are called.

    4) The speed() method accepts an int parameter called maxSpeed - we will use this in 8).

    5) In order to use the Main class and its methods, we need to create an object of the Main Class.

    6) Then, go to the main() method, which you know by now is a built-in Java method that runs your program (any code inside main is executed).

    7) By using the new keyword we created an object with the name myCar.

    8) Then, we call the fullThrottle() and speed() methods on the myCar object, and run the program using the name of the object (myCar), followed by a dot (.), followed by the name of the method (fullThrottle(); and speed(200);). Notice that we add an int parameter of 200 inside the speed() method.*/




//Java Constructors
/*    int b;  // Create a class attribute

    // Create a class constructor for the Main class
    public OPP() {
        b = 5;  // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        OPP myObj = new OPP(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.b); // Print the value of x
    }
*/

// Outputs 5
}

