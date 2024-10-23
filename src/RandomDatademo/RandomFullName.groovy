package RandomDatademo

class RandomFullName {

    //This all keywords we can use it in the Katalon Automation
    // Generate a random FullName 1
    //@Keyword
    def GenerateFullName() {
        String alphabet = 'abcdefghijklmnopqrstuvwxyz'
        String FirstName = ''
        String LastName = ''
        String FullName = ''
        Random rand = new Random() // Define the rand variable here
        for (int i = 0; i < 8; i++) {
            FirstName += alphabet.charAt(rand.nextInt(alphabet.length()))
            LastName += alphabet.charAt(rand.nextInt(alphabet.length()))
            FullName = (((FirstName + 'EN '.toUpperCase()) + LastName) + 'Kar')
        }
        return FullName
    }

    // Generate a random FullName 2
    //@Keyword
    def GenerateFullName2() {
        String alphabet = 'abcdefghijklmnopqrstuvwxyz'
        String FirstName = ''
        String LastName = ''
        String FullName2 = ''
        Random rand = new Random() // Define the rand variable here
        for (int i = 0; i < 8; i++) {
            FirstName += alphabet.charAt(rand.nextInt(alphabet.length()))
            LastName += alphabet.charAt(rand.nextInt(alphabet.length()))
            FullName2 = (((FirstName + 'EN '.toUpperCase()) + LastName) + 'Kar')
        }
        return FullName2
    }
    // Generate today's date
    //@Keyword
    def GenerateTodaysDate() {
        // Get the current date
        def date = new Date()

        // Format the date as YYYY-MM-DD
        String formattedDate = String.format("%tF", date)

        return formattedDate
    }
    // Select leap years
    @Keyword
    def selectLeapYears(int startYear, int endYear) {
        def leapYears = []

        // Iterate through the range of years
        for (int year = startYear; year <= endYear; year++) {
            // Check if the year is a leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                leapYears.add(year)
            }
        }

        return leapYears
    }

    // Generate first, middle, and last names
    @Keyword
    def generateFullName() {
        // List of sample first names, middle names, and last names
        def firstNames = ["John", "Emma", "Michael", "Sophia", "David", "Olivia"]
        def middleNames = ["James", "Marie", "Alexander", "Grace", "William", "Rose"]
        def lastNames = ["Smith", "Johnson", "Brown", "Taylor", "Anderson", "Williams"]

        // Randomly pick a first name, middle name, and last name
        String firstName = firstNames[(int) (Math.random() * firstNames.size())]
        String middleName = middleNames[(int) (Math.random() * middleNames.size())]
        String lastName = lastNames[(int) (Math.random() * lastNames.size())]

        // Combine the first, middle, and last names
        String fullName = "$firstName $middleName $lastName"

        return fullName
    }

}
