package GroovyBasics.classandobject

class Laptop_Class_Objects {
    def price
    def brand
    def screenworkingcondition

    static main(args)
    {
        Laptop_Class_Objects dell= new Laptop_Class_Objects()
        dell.login()
        dell.logout()

        dell.price=10000
        dell.screenworkingcondition= true

        println(dell.price)
        println(dell.brand)
        println(dell.screenworkingcondition)
    }

    def login()
    {
        println("System logging In")
    }

    def logout()
    {
        println("System logging Out")
    }
}
