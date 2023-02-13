fun main() {
  println("Ingrese su nombre:")
  val nombre = readLine().toString()

  println("Ingrese su materia:")
  val materia = readLine().toString()

  println("Ingrese la nota 1:")
  val nota1 = readLine()!!.toFloat()

  println("Ingrese la nota 2:")
  val nota2 = readLine()!!.toFloat()

  println("Ingrese la nota 3:")
  val nota3 = readLine()!!.toFloat()

  val prom = (nota1+nota2+nota3)/3

  println("El promedio de nota es: $prom")

  if(prom>=3.5){
    println("El estudiante $nombre Ganó la materia de $materia")
  }else{
    println("El estudiante $nombre Perdió la materia de $materia")
  }
}
