package closures

class CloureWithMap {

    static void main(String[] args) {

        def map = [fruit: "apple", language: "english", device: "mouse"]

        println(map)

        map.each { println it.key }

        map.each { println it.value }

        map.each { println(it.value + " is a string") }
    }
}
