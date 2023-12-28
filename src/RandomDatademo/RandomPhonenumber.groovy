package RandomDatademo

class RandomPhonenumber {
        Random rand = new Random()

        String mobileNumber() {
            String mobile = '9' // Set the first digit to 9 to avoid starting with zero
            for (int i = 1; i < 10; i++) {
                mobile += rand.nextInt(10) // Generate random digits for the remaining 9 digits
            }
            return mobile
        }
        static void main(String[] args) {
            RandomPhonenumber randomData = new RandomPhonenumber()
            String randomMobileNumber = randomData.mobileNumber()
            println(randomMobileNumber)
        }
    }
