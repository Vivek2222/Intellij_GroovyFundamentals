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

}
