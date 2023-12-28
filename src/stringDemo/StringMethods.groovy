package stringDemo

class StringMethods {

    static void main(String[] args) {

        //String is Immutable

        def s = "Groovy"
        def s1= s.concat(" Program")

        println(s1)

        //"Groovy Program"

        def str1  = "Groovy"
        def str2 = "groovy"
        def str3 = ""
        def str4 = "Java Program"
        def str5 = "          Groovy Program         "

        println("The Length of the s1 is :"+s1.length())
        println("The character at position 5 is: "+s1.charAt(5))
        println("The contains value is "+s1.contains("Gro"))
        println("The start with demo: "+s1.startsWith("Groo"))
        println("The end with demo:"+ s1.endsWith("gram"))
        println("The Equal demo: "+str1.equals(str2))
        println("The index of y is: "+s1.indexOf('y'))
        println("The Empty demo: "+s1.isEmpty())
        println("The empty demo: "+str3.isEmpty())
        println("The Replace demo: "+str4.replace("Java","Groovy"))
        println("The substring demo: "+s1.substring(3,10))
        println("The lower case demo: "+s1.toLowerCase())
        println("The Upper case demo: "+s1.toUpperCase())
        println("The trim demo: "+str5.trim())
        println("The Split demo: "+s1.split("v")[1])

        def str6 = "GROOVY"
        def str7 = "groovy"

        println("The Equal ignores case demo: "+str6.equalsIgnoreCase(str7))

    }
}
