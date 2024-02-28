package RandomDatademo

class RandomAlphabet {

    def getRandomCountry() {
        // List of countries
        List<String> countries = ['USA', 'Canada', 'UK', 'Australia', 'Germany', 'France', 'Japan', 'Brazil', 'India', 'China']

        // Randomly select a country
        String randomCountry = countries[new Random().nextInt(countries.size())]
        return randomCountry
    }
}
