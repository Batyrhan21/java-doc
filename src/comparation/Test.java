package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Gosha");
        list.add("Schiftian");
        list.add("Adias");
        Collections.sort(list);
        System.out.println(list);
    }
}
