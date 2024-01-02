package closures

class ClosureAsMethodParameter {

    static void main(String[] args) {

        def wish = {
            println "Closure as method paramter!"
        }

        sampleMethod(wish)

        add(10, 20)
    }

    static def sampleMethod(clos) {
        clos() //clos.call()
    }

    static def add(a, b) {
        println a + b
    }
}
