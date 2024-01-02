package closures

class AccssVariablesInClosure {

    static void main(String[] args) {

        def userName = "Vivek"

        def wish = {
            println("Hello $userName..!")
        }

        userName = "Sample"

        wish()
    }
}
