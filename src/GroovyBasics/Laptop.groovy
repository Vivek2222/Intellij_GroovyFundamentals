package GroovyBasics

class Laptop {

    def price
    def brand
    def screenWorkinCondition

    static void main(String[] args) {

        Laptop lap = new Laptop()
        lap.login()
        lap.logout()
    }

    def login()
    {
        println("System Logging In.")
    }

    def logout()
    {
        println("System Logging Out")
    }
}
