fun main() {
  println("Ingrese el valor de la compra")
  // los signos de admiracion significa que no va a recibir datos nulos
  var valorCompra=readLine()!!.toDouble()

  println("Valor compra: $valorCompra")

  var descuento: Double

  if(valorCompra>=100000){
    descuento=valorCompra*0.5
    valorCompra-=descuento
    println("Se aplico un descuento del 50% equivalente a: $descuento")
  }

  println("Valor final: $valorCompra")
}
