package RandomDatademo

import java.time.LocalDate;
import java.util.Random;

class RandomEmail {

    static String getRandomizedEmailAddress(String address, String domain) {
        String randomSuffix = "user";
        String randomPrefix = "example.com";
        String randomEmailAddress = getEmail(randomSuffix, randomPrefix);
        System.out.println("Random Email Address: " + randomEmailAddress);
        return randomEmailAddress
        //String randomizedAddress = address + System.nanoTime() + domain;
        //return randomizedAddress;
//        return randomEmailAddress
//        System.out.println("sd" + randomEmailAddress);
    }

    public static String getEmail(String suffix, String prefix) {
        int randomNo = (int) (Math.random() * 1000);
        return suffix + randomNo + "@" + prefix;
    }

    public static void main(String[] args) {
        String randomEmailAddress = getRandomizedEmailAddress("randomuser", "@example.com");
//        System.out.println("Random Email Address: " + randomEmailAddress);
    }

}