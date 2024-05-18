package lecture.mid1.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // Formatting
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date); // ISO starndard

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate = date.format(formatter);
        System.out.println("formattedDate = " + formattedDate);

        // Parsing (string to date)
        String input = "2030/01/01";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("parsedDate = " + parsedDate);
    }
}
