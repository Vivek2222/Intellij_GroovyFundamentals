package closures

class ClosureWithReturnType {

    static void main(String[] args) {

        def wish = { def name ->

            return "$name is a Groovy User..!"
        }

        def value = wish("Vivek")
        println(value)

        println(wish("Sample"))

        def add = {
            a, b -> return a + b
        }

        int sum = add(10, 20)
        println(sum)

        println add(50, 20)
    }
}
