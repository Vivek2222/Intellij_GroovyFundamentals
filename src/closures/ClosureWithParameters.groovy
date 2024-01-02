package closures

class ClosureWithParameters {

    static void main(String[] args) {

        def wish = { def name ->

            println "$name is a Groovy User..!"
        }

        wish("Vivek")

        wish("Sample")

        def add = {
            def a, b -> println a + b
        }

        add(10, 20)
        add(50, 30)
    }
}
