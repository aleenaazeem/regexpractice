import java.util.regex.*;
import java.util.*;

public class EmailExtractor {

    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b[a-zA-Z0-9._%+-]+@[a-zA-Z.-]+\\.[a-z]{2,6}\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }

    public static void main(String[] args) {
        String text = "Contact us at test_email@gmail.com or support@company.org.";
        System.out.println("Emails found: " + extractEmails(text));
    }
}
