fun main() {
    var resp = "si"
    var cont = 0
    do {
    print("\nIngrese su nombre: ")
    val nombre = readLine()!!
    println("Hola $nombre bienvenido a la clase!")
    cont++
    print("Ingrese si, si hay más personas: ")
    resp = readLine()!!
    } while (resp == "si")
        println("Llegaron $cont Personas!")
        println("Fin del Ciclo!")
}

