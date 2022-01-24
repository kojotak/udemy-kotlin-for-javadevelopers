
fun main(ars: Array<String>){
    val someCondition = 10 > 20

    var num: Int

    if( someCondition) {
        num = 50
    } else {
        num = 60
    }

    //num = (1>1) 50 : 60 //only in java
    val num2 = if(someCondition) 50 else 60 //Kotlin's alternative
    println(num2) // 60

    println("strange use of if: ${if(someCondition){ 
        print(" foo ") 
        55 
    } else { 
        print(" bar ") 
        66 
    }}")// bar strange use of if: 66

}