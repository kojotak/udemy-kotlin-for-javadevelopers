fun main(ars: Array<String>){

    val flowerTender = object: FlowerCare<CoFlower>{
        override fun prune(flower: CoFlower) = println("prune a flower ${flower.name}")
    }

    val roseTender = object: FlowerCare<CoRose>{
        override fun prune(flower: CoRose) = println("prune a rose $flower")
    }
    val roseGarden = CoGarden<CoRose>(listOf(CoRose(), CoRose(), CoRose()), roseTender)
    roseGarden.tendFlower(0)//prune a rose CoRose@133314b

    val daffodilTender = object: FlowerCare<Daffodil> {
        override fun prune(flower: Daffodil) = println("prune a daffodil $flower")
    }
    val daffodilGarden = CoGarden<Daffodil>(listOf(Daffodil(), Daffodil(),Daffodil()), daffodilTender)
    daffodilGarden.tendFlower(1)//prune a daffodil Daffodil@30dae81

    //until now, we have used: interface FlowerCare<in T>{
    //we can not use one flowerTender and use it in roseGarden and in daffodilGarden
    //until FlowerCare is contravariant, that is with relaxed type parameter

    val roseGardenContravariant = CoGarden<CoRose>(listOf(CoRose(), CoRose(), CoRose()), flowerTender)
    roseGardenContravariant.tendFlower(0)//prune a flower Rose
}


class CoGarden<T: CoFlower>(val flowers:List<T>,
                          val flowerCare: FlowerCare<T>){
    fun pick(i: Int) = flowers[i]

    fun tendFlower(i: Int){
        flowerCare.prune(flowers[i])
    }
}

open class CoFlower(val name: String){

}
class CoRose: CoFlower("Rose"){

}
class Daffodil: CoFlower("Daffodil"){

}
//input type parameter for contravariance
interface FlowerCare<in T>{
    fun prune(flower: T)

    //if type parameter T is only 'in', we can not use it as return parameter
    //fun pick(): T//Type parameter T is declared as 'in' but occurs in 'out' position in type T
}