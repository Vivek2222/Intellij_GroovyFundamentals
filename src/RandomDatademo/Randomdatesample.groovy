package RandomDatademo

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Randomdatesample {
    public static String getDateStringForDateBefore(String format = "dd/MM/YYY") {
        int maxDayDifference = 1000
        LocalDate date = LocalDate.now()
        Random rand = new Random()
        int days = rand.nextInt(maxDayDifference)
        LocalDate randomDate = date.minusDays(days)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        String formattedDateTime = randomDate.format(formatter);
        return formattedDateTime
    }
    def String BirthDate() {
        //Creates 20 year old birth date
        //Available date formats: MMddyyyyHHmmssSSS
        SimpleDateFormat sdf = new SimpleDateFormat('MMddyyyy')
        Calendar c = Calendar.getInstance()
        c.setTime(new Date())
        c.add(Calendar.DATE, 0)
        c.add(Calendar.YEAR, -20)
        def BirthDate = sdf.format(c.getTime())
        return BirthDate
    }
}

