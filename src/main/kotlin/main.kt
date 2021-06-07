fun main() {
    //Ejercicio 1
    for (numero in Ejercicio_1.array){
        print("$numero ")
    }
    println()
    //Ejercicio 2
    val arrayNumeros = Ejercicio_2.arreglo
    for (numero in arrayNumeros){
        print("$numero ")
    }
    println()
    
    //Ejercicio 3
    Ejercicio_3().arrayNumeros(Ejercicio_2.arreglo).forEach({print("$it ")})
}