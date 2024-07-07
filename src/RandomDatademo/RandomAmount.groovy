package RandomDatademo

class RandomAmount {

    int randomNumbershort() {
        Random rand = new Random()
        return 100 + rand.nextInt(90000) // Generates a random number between 1000 and 9999 (inclusive)
    }

    @Keyword
    def randomHours() {
        String number = new Random().nextInt(24 - 1 + 1) + 1
        return number
    }
}
