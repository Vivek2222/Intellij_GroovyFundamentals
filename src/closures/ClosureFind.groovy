package closures

import javax.swing.Spring
import javax.swing.SpringLayout

class ClosureFind {
    static void main(String[] args) {

        //find method finds the first value in a collection that matches the condition
        def list = [1, 2, 3, 4, 5, 6]

        def value = list.find(it -> it > 3)
        println value //4

        println list.find(el -> el == 3) //3

        println list.find(el -> el == 7) //null

    }
}
