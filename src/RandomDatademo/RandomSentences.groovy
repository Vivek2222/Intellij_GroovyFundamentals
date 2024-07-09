package RandomDatademo

class RandomSentences {

    
    def String generateRandomSentence() {
        String alphabet = 'abcdefghijklmnopqrstuvwxyz'
        Random rand = new Random()
        String randomSentence = ''
        for (int j = 0; j < 5; j++) {
            String randomWord = ''
            for (int i = 0; i < 8; i++) {
                randomWord += alphabet.charAt(rand.nextInt(alphabet.length()))
            }
            randomSentence += randomWord + ' '
        }
        return randomSentence.trim()
    }
}
