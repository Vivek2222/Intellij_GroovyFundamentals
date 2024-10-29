package RandomDatademo

class randomCityName {
    Random rand = new Random()

    // List of sample city names
    List<String> cities = [
            "New York", "Los Angeles", "Chicago", "Houston", "Phoenix",
            "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"
    ]

    // Method to get a random city name
    String randomCity() {
        return cities[rand.nextInt(cities.size())]
    }

    static void main(String[] args) {
        // Create an instance of randomCityName
        randomCityName randomData = new randomCityName()

        // Generate a random city name
        String randomCityName = randomData.randomCity()

        println("Random City Name: " + randomCityName)
    }
}

