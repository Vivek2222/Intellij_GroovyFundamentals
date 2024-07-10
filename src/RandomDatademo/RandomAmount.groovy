package RandomDatademo

class RandomAmount {

    int randomNumbershort() {
        Random rand = new Random()
        return 100 + rand.nextInt(90000) // Generates a random number between 1000 and 9999 (inclusive)
    }

    //@Keyword
    def randomHours() {
        String number = new Random().nextInt(24 - 1 + 1) + 1
        return number
    }

    //@Keyword
    def generateRandomLink() {
        def baseUrl = "https://www."
        def domains = [
                "google",
                "yahoo",
                "bing",
                "duckduckgo",
                "baidu",
                "yandex"
        ]
        def tlds = [
                ".com",
                ".org",
                ".net",
                ".info",
                ".biz"
        ]

        def random = new Random()
        def randomDomain = domains[random.nextInt(domains.size())]
        def randomTld = tlds[random.nextInt(tlds.size())]

        return baseUrl + randomDomain + randomTld
    }


}
