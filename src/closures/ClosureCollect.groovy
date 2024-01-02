package closures

class ClosureCollect {

    static void main(String[] args) {

        /* Collect method iterates through a collection, converting each element into a new
        value using the closure as the transformer */

        def list = [10, 20, 30, 40, 50]

        println list.collect { el -> el * 5 }

        list = ['java', 'groovy', 'python']
        println(list.collect { el -> el.contains("o") })
    }
}
