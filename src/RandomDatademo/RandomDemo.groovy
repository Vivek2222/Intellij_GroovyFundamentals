package RandomData

import java.util.Random;

class RandomData12 {
    Random rand = new Random()

    long number() {
        return rand.nextInt(1000000000)
    }

    static void main(String[] args) {
        RandomData12 randomData = new RandomData12()
        def randomNumber = randomData.number()
        println(randomNumber)
    }
}
