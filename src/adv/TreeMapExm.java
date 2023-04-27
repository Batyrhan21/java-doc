package adv;

import java.util.TreeMap;
import java.util.SortedSet;

public class TreeMapExm {
    public static void main(String[] args) {
        TreeMap<Double, String> treeMap = new TreeMap<Double, String>();
        String str1 = "Hello";
        String str2 = "Halo";
        String str3 = "Привет";
        String str4 = "Muchas Grasias";
        treeMap.put(9.2, str1);
        treeMap.put(5.3, str2);
        treeMap.put(18.4, str3);
        treeMap.put(1.2, str4);
        System.out.println(treeMap);
    }
}
