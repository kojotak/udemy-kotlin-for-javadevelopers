package chapter08.src

import java.io.File

fun main(ars: Array<String>){
    //similar to java visitor from java

    File(".") //current directory = project root directory
        .walkTopDown()
        .filter { it.name.endsWith(".kt") } //kotlin file only
        .forEach { println(it) }
}