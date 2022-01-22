//it doesn't have to match directory structure...
package foo.bar.baz

import chapter02.LocationKotlin //have to add dependency to another module in chater05.iml


fun main(args:Array<String>){
    println("my package doesn't match!")

    println(LocationKotlin(42, "using class from other module"))
}