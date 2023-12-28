package staticDemo

class StaticMethodDemo {

    def num = 10
    static staticNum = 20

    static main(args){

        StaticMethodDemo staticMethodDemo = new StaticMethodDemo()
        staticMethodDemo.sum()

        staticSum()
    }

    def sum(){
        println(num + num)
    }
    def static staticSum()
    {
        println( staticNum + staticNum)
    }
}
