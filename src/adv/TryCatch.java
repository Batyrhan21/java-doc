package adv;

public class TryCatch {
    public static void main(String[ ] args) {
        try {
            int[] myNUmbers = {1,2,3};
            System.out.println(myNUmbers[10]);
        } catch (Exception e) {
            System.out.println("Something wrent wrong.");
        } finally {
            System.out.println("The 'try catch' is finished !");
        }
    }
}