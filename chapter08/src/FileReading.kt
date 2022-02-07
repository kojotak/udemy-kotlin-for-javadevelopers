import java.io.File

fun main(ars: Array<String>){

    //Kotlin builds on java libraries using extension methods

    //opens it in utf-8
    File("testfile").reader().readLines().forEach{ println(it)}

    //zkracene
    File("testfile").reader().forEachLine{ println(it)}

    //muzu pouzit use() -> kotlin po nas uzavre dany reader
    //muzu pouzit jiny reader
    File("testfile").bufferedReader().use{ it.readText() } //readText to precte cely

}
