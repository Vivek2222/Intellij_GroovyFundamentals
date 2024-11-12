package RandomDatademo

import java.time.LocalDate

class RandomDate {

    // Function to generate a random date within a specified date range
    static LocalDate generateRandomDate(LocalDate startDate, LocalDate endDate) {
        long startEpochDay = startDate.toEpochDay()
        long endEpochDay = endDate.toEpochDay()

        long randomEpochDay = startEpochDay + (long) (Math.random() * (endEpochDay - startEpochDay + 1))

        return LocalDate.ofEpochDay(randomEpochDay)
    }

    // Usage example:
    static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 1, 1) // January 1, 2023
        LocalDate endDate = LocalDate.of(2023, 12, 31) // December 31, 2023

        LocalDate randomDate = generateRandomDate(startDate, endDate)
        println randomDate
    }

}
