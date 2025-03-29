import java.util.regex.*;
import java.util.*;

public class PhoneExtractor {

    public static List<String> extractPhones(String text) {
        List<String> phones = new ArrayList<>();
        Pattern pattern = Pattern.compile("(\\(?[2-9]\\d{2}\\)?[ -]?[2-9]\\d{2}[ -]?\\d{4})");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            phones.add(matcher.group());
        }
        return phones;
    }

    public static void main(String[] args) {
        String text = "Call (416) 823-7784 or 647-392-4482 or 905 625 2324 today!";
        System.out.println("Phone Numbers found: " + extractPhones(text));
    }
}
