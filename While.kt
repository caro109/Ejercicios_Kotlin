fun main() {
    var opcion: Int=0
    var num1: Float
    var num2: Float
    while (opcion != 5){
    print("Ingrese el primer número: ")
    num1 = readLine()!!.toFloat()
    print("Ingrese el segundo número: ")
    num2 = readLine()!!.toFloat()
    print("Elija una opción: \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Finalizar")
    opcion = readLine()!!.toInt()
    when (opcion) {
    1 -> println("La suma es: ${num1 + num2}")
    2 -> println("La resta es: ${num1 - num2}")
    3 -> println("La multiplicación es: ${num1 * num2}")
    4 -> {
    if (num2 <= 0) {
    println("El segundo número no puede ser negativo o cero.")
    } else {
    println("La división es: ${num1 / num2}")
    }
    }
    5 -> println("Programa finalizado.")
    else -> println("Opción inválida.")
    }
    }
}
    