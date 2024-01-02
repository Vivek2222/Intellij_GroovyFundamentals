package closures

class SimpleClosureExample {

    static void main(String[] args) {

        def wish = {
            println("Hello Groovy User..!")
        }

        //2 ways to execute
        //1.Explicit call to the closure
        wish.call()

        //2.Implicit call to the closure
        wish()
        
    }
}
