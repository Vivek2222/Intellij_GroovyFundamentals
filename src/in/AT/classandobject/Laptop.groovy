package in.AT.classandobject

class Laptop {
    def price
    def screenworkingcondition

    static main(args)
    {
        Laptop dell= new Laptop()
        dell.login()
        dell.logout()

        dell.price=10000
        dell.screenworkingcondition= true

        println(dell.price)
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
