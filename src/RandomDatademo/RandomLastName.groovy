package RandomDatademo

import java.util.Random

class RandomLastName {
    def alphabet = 'abcdefghijklmnopqrstuvwxyz'

    def GenerateLastName() {
        Random rand = new Random()
        String generatedLastName = ''

        for (int i = 0; i < 8; i++) {
            generatedLastName += alphabet.charAt(rand.nextInt(alphabet.length()))
        }
        return generatedLastName
    }

    static void main(String[] args) {
        RandomLastName ref = new RandomLastName();
        println(ref.GenerateLastName())
    }
}