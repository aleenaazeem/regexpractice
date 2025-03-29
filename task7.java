import java.util.regex.*;
import java.util.*;

public class PriceExtractor {

    public static List<String> extractPrices(String text) {
        List<String> prices = new ArrayList<>();
        Pattern pattern = Pattern.compile("(\\$\\d+(\\.\\d{2})?)|(\\d+(\\.\\d{2})?\\s?(CAD|USD))");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            prices.add(matcher.group());
        }
        return prices;
    }

    public static void main(String[] args) {
        String text = "The book costs $12.99 or 14.00 CAD. Old price was $9.00.";
        System.out.println("Prices found: " + extractPrices(text));
    }
}
