package GroovyBasics.staticDemo

class StaticDemo {

    static main(args) {

        EmployeeData employeeData = new EmployeeData()
        employeeData.empID = 101
        employeeData.empName = "Tom"

        println "The Id of the Employee one is: " + employeeData.empID
        println "The Name of the Employee one is: " + employeeData.empName
        println "The Company of the Employee one is: " + EmployeeData.companyName

        EmployeeData employeeData1 = new EmployeeData()
        employeeData1.empID = 102
        employeeData1.empName = "Jerry"

        println "The Id of the Employee one is: " + employeeData1.empID
        println "The Name of the Employee one is: " + employeeData1.empName
        println "The Company of the Employee one is: " + EmployeeData.companyName

    }
}
