import javax.lang.model.type.UnionType;
import java.util.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }




// Primitive Data Types            Size     Stores whole

        byte byteType = 20; //             1 byte   (-128 to 127)
        short shortType = 30; //           2 bytes  (-32,768 to 32,767)
        int numberType = 10; //            4 bytes  (-2,147,483,648 to 2,147,483,647)
        long longType = 20; //             8 bytes  (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        float floatType = 80.2F; //        4 bytes  (fractional numbers. Sufficient for storing 6 to 7 decimal digits)
        double doubleType = 40.2d; //       8 bytes (fractional numbers. Sufficient for storing 15 decimal digits)
        String charType = "ABC"; //        2 bytes  (a single character/letter or ASCII values)
        boolean booleanType = true; //     1 bit    (true or false values)
        char singleChar = 'B'; //                    (char data type is used to store a single character)




        final int final_virable = 15;
        // final_virable = 20;  // will generate an error: cannot assign a value to a final variable




        System.out.println("\nDictionary types :");
        Dictionary types = new Hashtable();

        types.put("byte_type", byteType);
        types.put("short_type", shortType);
        types.put("numberType", numberType);
        types.put("longType", longType);
        types.put("floatType", floatType);
        types.put("doubleType", doubleType);
        types.put("charType", charType);
        types.put("booleanType", booleanType);

        for (Enumeration i = types.elements(); i.hasMoreElements();)
        {
            System.out.println("Value in Dictionary : " + i.nextElement());
        }



// Java Type Casting
        System.out.println("\nDictionary types :");

    /*Type casting is when you assign a value of one primitive data type to another type.

        In Java, there are two types of casting:

        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
    */
    // Widening Casting

    int widInt = 9;
    double widDouble = widInt; // Automatic casting: int to double

    System.out.println(widInt);      // Outputs 9
    System.out.println(widDouble);   // Outputs 9.0


    //Narrowing Casting
    double narrDouble = 9.78d;
    int narrInt = (int) narrDouble; // Manual casting: double to int

    System.out.println(narrDouble);   // Outputs 9.78
    System.out.println(narrInt);      // Outputs 9




//Java Operators

    /*
        Operator    Name                Description                                 Example
        +           Addition            Adds together two values                    x + y
        -           Subtraction         Subtracts one value from another            x - y
        *           Multiplication      Multiplies two values                       x * y
        /           Division            Divides one value by another                x / y
        %           Modulus             Returns the division remainder              x % y
        ++          Increment           Increases the value of a variable by 1      ++x
        --          Decrement           Decreases the value of a variable by 1      --x
    */




//Java If ... Else
        System.out.println("\nJava If ... Else:");

    /*Java has the following conditional statements:

        Use if to specify a block of code to be executed, if a specified condition is true
        Use else to specify a block of code to be executed, if the same condition is false
        Use else if to specify a new condition to test, if the first condition is false
        Use switch to specify many alternative blocks of code to be executed
    */

//        Java Short Hand If...Else (Ternary Operator)

//        Instead of writing:
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

//        You can simply write:
        int secondTime = 20;
        String result = (secondTime < 18) ? "Good day." : "Good evening.";
        System.out.println(result);



//Java Switch
        System.out.println("\nJava Switch:");
        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

//Java While Loop
        System.out.println("\nJava While Loop:");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);




//Java For Loop
        System.out.println("\nJava For Loop:");
        /*  Nested Loops

        It is also possible to place a loop inside another loop. This is called a nested loop.

        The "inner loop" will be executed one time for each iteration of the "outer loop":*/

        // Outer loop
        for (int x = 1; x <= 2; x++) {
            System.out.println("Outer: " + x); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }




//Java For Each Loop
        System.out.println("\nJava For Each Loop:");
        /*
        There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
        */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String y : cars) {
            System.out.println(y);
        }




//Java Arrays and Arrays Loop
        System.out.println("\nJava Arrays and Arrays Loop:");
        /*
        Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

        To declare an array, define the variable type with square brackets:

        You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.

        The following example outputs all elements in the cars array:
        */
        String[] personNames = {"James", "Rom", "Bob", "Kyotaka"};
        for (int t = 0; t < personNames.length; t++) {
            System.out.println(personNames[t]);
        }
//Java Multi-Dimensional Arrays
        System.out.println("\nJava Multi-Dimensional Arrays:");
        /*
        A multidimensional array is an array of arrays.

        Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

        To create a two-dimensional array, add each array within its own set of curly braces:
        */

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int z = 0; z < myNumbers.length; ++z) {
            for(int c = 0; c < myNumbers[z].length; ++c) {
                System.out.println(myNumbers[z][c]);
            }
        }
    }
}
