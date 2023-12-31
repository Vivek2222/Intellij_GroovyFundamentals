package Opps.overloading

class MethodOverloadingDemo {

    static void main(String[] args) {

        MethodOverloadingDemo mo = new MethodOverloadingDemo()
        mo.add(2, 3)
        mo.add(2, 3, 4)
        mo.add(5)
        mo.add("Sample", "Name")
    }

    def add(a, b) {
        println(a + b)
    }

    def add(a, b, c) {
        println(a + b + c)
    }

    def add(a) {
        println(a + a + a)
    }

    def add(String a, String b) {
        println(a + " " + b)
    }
}
