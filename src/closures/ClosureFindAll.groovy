package closures

class ClosureFindAll {

    static void main(String[] args) {
        //findAll method returns a list of all values found as per the condition

        def list = [1, 2, 3, 4, 5, 6]

        println list.findAll(it -> it > 3)

        list = ["java", "groovy", "python"]

        println list.findAll { x -> x.contains("o") }
    }
}
