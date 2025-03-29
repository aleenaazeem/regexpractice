package assignment4;
import java.util.ArrayList;
import java.util.List;
public class tasks {

    public static boolean isValidEmail(String email) {
        // Basic format check and pattern rules
    	//here we are creating rules for the emails that wil be given by the user
    	// we will start with the donts and work are way over that
        String emailRegex = "^(?!.*\\.\\.)" +                            // No consecutive dots
                "(?!.*\\s)" +                                           // No whitespace
                "(?!.*[^a-zA-Z0-9@._-])" +                              // No special characters other than @ . _ -
                "(?=.{5,40}$)" +                                        // Length between 5 and 40
                "(?=[^@]*[A-Z].*[A-Z])" +                               // At least 2 uppercase letters
                "(?=[^@]*\\d)" +                                        // At least 1 digit in local part
                "(?=[^@]*_)" +                                          // At least 1 underscore in local part
                "(?!^[.-])" +                                           // Local part does not start with . or -
                "(?<![.-])" +                                           // Local part does not end with . or -
                "[a-zA-Z0-9._-]+@" +
                "(?!-)[a-zA-Z-]+(?<!-)" +                               // Domain part (no hyphen at start/end)
                "\\.[a-z]{3}$";                                         // Domain suffix (3 lowercase letters)

        return email.matches(emailRegex); //this will return the email if it matches or not
    }

    public static void main(String[] args) {
        List<String> emails = List.of(
        		//here we are giving multiple emails to the the program in order to
        		//check if the emails are valid or not
        		
                "Ex_Ample9@my-domain.com",
                "TEst_User1@hyphen-site.net",
                "user..name@domain.com",
                "username@domain123.com",
                "Username9@-domain.com");

        List<String> valid = new ArrayList<>();
        //here we are initializing lists to store the valid ones
        List<String> invalid = new ArrayList<>();
        //here we are initializing lists to store the invalid ones

        for (String email : emails) {
        	//this is where we are looping over the emails and checking their validity
            if (isValidEmail(email)) valid.add(email); //if its valid add to the list of email
            else invalid.add(email); //if it is unvalid at to the list of invalid emails.
        }

        System.out.println("The valid Emails after checking are: " + valid);
        //here we are printing out results
        System.out.println("The invalid Emails after checking are: " + invalid);
    }
}
