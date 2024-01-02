package closures

class ClosureWithList {

    static void main(String[] args) {
        def list = [10, 20, 30, 40, 50]

        //print all the elements
        list.each { println it }
        println("---------------------------------")
        list.each { println it + 5 }
        println("---------------------------------")
        list.each { element -> println(element > 30) }
    }
}
