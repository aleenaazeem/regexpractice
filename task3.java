package assignment4;

import java.util.regex.*;
import java.util.*;
public class task3 {

public class DateExtractor {

    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\d{4}-\\d{2}-\\d{2}\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }

    public static void main(String[] args) {
        String sampleText = "Today is 2025-03-28 and tomorrow is 2025-03-29. 1990-05-05 was long ago.";
        System.out.println("Dates found: " + extractDates(sampleText));
    }
}}
