package Method

class MethodwithReturnType {

    static main(args){

        int m=10
        MethodwithReturnType returnType = new MethodwithReturnType()
        int total = returnType.Totalthree(10,20,30)
        int finalvalue = total*m
        println("The multiplied value is "+finalvalue)
    }

    /* def Totalthree(def a, def b, def c){
        def total =  a+b+c
       // return total //last statement is considered as return by default
         total*/
    def Totalthree(a,b,c){
        a+b+c
    }//alternative for above e.g
}
