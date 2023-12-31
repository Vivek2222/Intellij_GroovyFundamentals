package Opps.overriding

class ChildClass extends ParentClass {

    static void main(String[] args) {
        ChildClass cc = new ChildClass()
        cc.sum()
        cc.sum("Sample", "Name")
    }

    def sum() {
        println("I am in Parent Sum Method")
    }

    def static sum(a, b) {
        println("I am in Parent Sum Method")
        println(a + b)
    }
}
