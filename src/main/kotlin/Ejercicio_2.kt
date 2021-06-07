import kotlin.random.Random

open class Ejercicio_2 (var tamaño : Int, rellenarArray : (Int) -> Int) {
    val array = Array (tamaño, rellenarArray)
    companion object Singleton : Ejercicio_2(10, { Random.nextInt(50, 250)}) {
        fun showArray() {
            for (numero in array){
                print("$numero, ")
            }
        }
    }
}