package closures

class ClosureAnyAndEvery {

    static void main(String[] args) {

        /*
        any method iterates through each element of a collection and checks whether a boolean predicate is valid for
        at least on element
        every -> all the elements
         */
        def list = [10, 20, 30, 40, 50]

        println list.any { it -> it > 30 }//true
        println list.any { el -> el == 60 }//false

        println list.every { el -> el > 30 }//false
        println list.every { el -> el > 5 }//true
    }
}
