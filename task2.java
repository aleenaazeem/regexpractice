package assignment4;
import java.util.ArrayList;
import java.util.List;

public class task2 {

    public static boolean isValidPhoneNumber(String number) {
        // Regex explanation in comments below
        String regex = "^(\\+?1[ -]?)?" +                // Optional +1 or 1 country code
                "(?=.{12,14}$)" +                       // Total length must be 12 or 14
                "(?!.*[a-zA-Z])" +                      // No alphabets
                "(?!.*[^0-9\\-() ])" +                  // Only allowed special characters
                "(?!.*--|  )" +                         // No consecutive hyphens or spaces
                "(?!.*\\(.*\\(.*\\))" +                 // At most one pair of ()
                "(?!.*\\s$|^\\s)" +                     // No leading/trailing space
                "\\(?[2-9]\\d{2}\\)?[ -]?" +            // Area code: starts with 2-9
                "[2-9]\\d{2}[ -]?" +                    // Central office code: not starting with 0/1
                "\\d{4}$";                              // Line number: last 4 digits

        return number.matches(regex);
    }

    public static void main(String[] args) {
        List<String> numbers = List.of(
                "(416) 823-7784", "647-392-4482", "905 625 2324",
                "+93-647-333-2211", "289--453-2284", "4165557890"
        );

        List<String> valid = new ArrayList<>();
        List<String> invalid = new ArrayList<>();

        for (String number : numbers) {
            if (isValidPhoneNumber(number)) valid.add(number);
            else invalid.add(number);
        }

        System.out.println("Valid Phone Numbers: " + valid);
        System.out.println("Invalid Phone Numbers: " + invalid);
    }
}
