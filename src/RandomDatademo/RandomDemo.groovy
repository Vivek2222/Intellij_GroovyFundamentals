package RandomDatademo

class RandomNumber {
    Random rand = new Random()

    long number() {
        return rand.nextInt(1000000000)
    }

    static void main(String[] args) {
        RandomNumber randomData = new RandomNumber()
        def randomNumber = randomData.number()
        println(randomNumber)
    }
}
