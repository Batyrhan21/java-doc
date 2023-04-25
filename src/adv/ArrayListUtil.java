package adv;

import java.util.ArrayList;

public class ArrayListUtil {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        for (int counter = 0; counter < cars.size(); counter++) {
            System.out.println(cars.get(counter));
        }
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
