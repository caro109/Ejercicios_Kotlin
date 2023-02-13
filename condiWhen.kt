fun main() {
    print("Ingrese el numero de horas trabajadas")
    val horasTrabajadas = readLine()!!.toInt()
    val tarifaHora=2000

    var salario = horasTrabajadas*tarifaHora
    println("El salario base es $salario")
    var porc=0.1
    var descuento=salario*porc
    var salarioTotal=salario-(descuento)
    println("Salario neto a pagar aplicado el descuento es: $salarioTotal")

    print("Ingrese el tipo de empleado (A, B, C): ")
    var tipoEmpleado = readLine()
    var porcAumento=0.0
    when (tipoEmpleado){
        "a", "A" -> {
            porcAumento=30.0
            println("Es tipo A")
        }
        "b", "B" ->{
            porcAumento=20.0
            println("Es tipo b")
        }
        "c", "C" ->{
            porcAumento=10.0
            println("Es tipo c")
        }
        else ->{
            println("No se realizara ningun aumento")
            porcAumento=0.0
            }
    }
    if(porcAumento!=0.0){
        var aumento=salarioTotal*(porcAumento/100)
        salarioTotal=salarioTotal+aumento
        println("Se realizó un aumento de $aumento, Equivalente al $porcAumento% ")
        println("Se realizó un aumento de $aumento Equivalente al $porcAumento% ")
        println("El salario final quedó en $salarioTotal ")

    }
} 