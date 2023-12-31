package controlStatements

class SwitchDemo {

    static void main(String[] args) {

        def marks = 60
        switch (marks) {
            case 0..34:
                println("Failed")
                break
            case 35..60:
                println("Passed in Third Class.")
                break
            case 60..75:
                println("Passed in Second Class.")
                break
//            case { marks < 35 }:
//                println("Failed")
//                break
//            case { marks > 35 && marks < 60 }:
//                println("Passed in Third Class.")
//                break
//            case { marks > 60 && marks < 75 }:
//                println("Passed in Second Class.")
//                break
            default:
                println("Passed in First Class.")
        }
    }
}
