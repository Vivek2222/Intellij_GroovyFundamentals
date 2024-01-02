package exceptions

class GroovyExceptionDemo {

    static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("./src/Files/data1.properties")
        }
        catch (FileNotFoundException e) {
            println "File is not found."
        }

//        try {
//            def i = 2 / 0
//            println("The value of i is : $i")
//        } catch (ArithmeticException) {
//            println("Can not divide by zero.")
//        }
    }
}
