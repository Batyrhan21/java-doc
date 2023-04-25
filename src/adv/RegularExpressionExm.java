package adv;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpressionExm {
    public static void  main(String[] args) {
        Pattern pattern = Pattern.compile("regex", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("this is regex example");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else  {
            System.out.println("Match not found");
        }
    }
}
