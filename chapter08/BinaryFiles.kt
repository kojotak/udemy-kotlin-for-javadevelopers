package chapter08.src

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream

fun main(ars: Array<String>){

    val di = DataInputStream(FileInputStream("testfile.bin"))
    var si: String
    try{
        while(true){
            si = di.readUTF()
            println(si)
        }
    } catch (e: EOFException){
        //TODO handle the exception
    }


}