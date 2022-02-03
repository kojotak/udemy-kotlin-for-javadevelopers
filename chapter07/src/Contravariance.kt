fun main(ars: Array<String>){

    val flowerTender = object: FlowerCare<CoFlower>{
        override fun prune(flower: CoFlower) = println("prune a flower $flower")
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

    //we can not use one flowerTender and use it in roseGarden and in daffodilGarden
}


class CoGarden<T: CoFlower>(val flowers:List<T>,
                          val flowerCare: FlowerCare<T>){
    fun pick(i: Int) = flowers[i]

    fun tendFlower(i: Int){
        flowerCare.prune(flowers[i])
    }
}

open class CoFlower{

}
class CoRose: CoFlower(){

}
class Daffodil: CoFlower(){

}
interface FlowerCare<T>{
    fun prune(flower: T)
}