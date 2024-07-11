package RandomDatademo

class Randomfirstlast {
        //@Keyword
        def GenerateFirstName() {
            String alphabet = 'abcdefghijklmnopqrstuvwxyz'
            String randomFirstName = ''
            Random rand = new Random() // Define the rand variable here
            for (int i = 0; i < 8; i++) {
                randomFirstName += alphabet.charAt(rand.nextInt(alphabet.length()))
            }
            return randomFirstName

}
