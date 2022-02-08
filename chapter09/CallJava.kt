package chapter09


fun main(args:Array<String>){

    val car = JavaCar("blue", "Ford", 2015)
    car.color = "red" //ok
    println(car)//JavaCar{color='red', model='Ford', year=2015}

    //car.color = null //will compile though
    //println(car) //.IllegalArgumentException: Argument for @NotNull parameter 'color' of chapter09/JavaCar.setColor must not be null

    var model = car.model//type is String?, because of @Nullable annotation on getter
    model = null
    println(model)//null

    //call java's vararg from kotlin
    car.variableMethod(5, "hello")//5 - hello

    val strings = arrayOf("foo","bar") //can not use Kotlin's array in Java's vararg
    //car.variableMethod(42, strings)  //Required: String! Found:Array<String>

    //how to access java objects...
    //(car.anObject as java.lang.Object).notify()

    //access static java... as usual
    println(JavaCar.getStaticX()) //X
}