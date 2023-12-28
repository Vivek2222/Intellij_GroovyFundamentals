package RandomDatademo
import java.util.Random;
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class samplerandomdate {
     static String getDateStringForDateBefore(String format) {
        int maxDayDifference = 1000;
        LocalDate date = LocalDate.now();
        Random rand = new Random();
        int days = rand.nextInt(maxDayDifference);
         LocalDate randomDate = date.minusDays(days);
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        String formattedDateTime = randomDate.format(formatter);
        return formattedDateTime;
    }

     static void main(String[] args) {
        String randomDateString = getDateStringForDateBefore("dd/MM/yyyy");
        System.out.println("Random Date String: " + randomDateString);
    }
}
