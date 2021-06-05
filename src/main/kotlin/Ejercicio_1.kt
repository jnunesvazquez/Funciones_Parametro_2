open class Ejercicio_1 (var tamaño : Int) {
    companion object Singleton : Ejercicio_1(11) {
        val array = Array(tamaño){it * 7}
    }
}