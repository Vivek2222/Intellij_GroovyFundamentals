package GroovyBasics.ContructorDemo

class ParameterizedConstructorDemo {
    def empName
    def empId

    ParameterizedConstructorDemo(empName, empId) {
        this.empName = empName //this  is keyword to access the class level info
        this.empId = empId

        println("The Employee Name is : " + empName)
        println("The Employee Id is : " + empId)
    }

    static main(args) {
        ParameterizedConstructorDemo emp1 = new ParameterizedConstructorDemo("Tom", 101)
        ParameterizedConstructorDemo emp2 = new ParameterizedConstructorDemo("Jerry", 102)

    }
}
