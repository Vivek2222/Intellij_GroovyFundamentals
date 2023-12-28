package RandomDatademo
import java.util.Random

class RandomFirstName {
    def alphabet = 'abcdefghijklmnopqrstuvwxyz'
    def GenerateFirstName() {
        Random rand = new Random()
        String generatedFirstName = ''

        for (int i = 0; i < 8; i++) {
            generatedFirstName += alphabet.charAt(rand.nextInt(alphabet.length()))
        }

        return generatedFirstName
    }
        static void main(String[] args) {
        RandomFirstName ref = new RandomFirstName();
        println(ref.GenerateFirstName())
        }
    }