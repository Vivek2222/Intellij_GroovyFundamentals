package RandomDatademo

class RandomCountryName {

    Random rand = new Random()

    // List of sample country names
    List<String> countries = [
            "United States", "Canada", "Mexico", "Brazil", "United Kingdom",
            "France", "Germany", "Italy", "Australia", "India", "Iceland",
            "China", "Japan", "South Korea", "Russia", "South Africa", "Srilanka",
            "Bahamans", "Maldives", "Malaysia", "Norway", "Turkey", "Ukraine"
    ]

    // Method to get a random country name
    String randomCountry() {
        return countries[rand.nextInt(countries.size())]
    }

    static void main(String[] args) {
        // Create an instance of RandomCountryName
        RandomCountryName randomData = new RandomCountryName()

        // Generate a random country name
        String randomCountryName = randomData.randomCountry()

        println("Random Country Name: " + randomCountryName)
    }
}
