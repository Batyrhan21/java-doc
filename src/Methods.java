public class Methods {
//Java Methods
    /*Information can be passed to methods as parameter. Parameters act as variables inside the method.

    Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

    The following example has a method that takes a String called fname as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name: */
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

        int result = sum(5, 10);
        System.out.println(result);
    }




//Java Recursion
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
