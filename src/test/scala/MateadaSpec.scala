import org.scalatest.{FunSpec, Matchers}

class MateadaSpec extends FunSpec with Matchers {
  //describe("pasada de mate")
  it("en una ronda de 1 solo mateador toma"){

    val cebador = new Cebador()
    val mateador = new Mateador()

    cebador.iniciarPasada(List(mateador))
    mateador.matesTomadosEnUnaPasada should equal(1)
    
  }

  it("en una ronda de 2 solo mateador toma"){

    val cebador = new Cebador()
    val mateadores = List(new Mateador, new Mateador)

    cebador.iniciarPasada(mateadores)

  }
}



















