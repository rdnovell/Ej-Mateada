class Mateador() {

  var matesTomadosEnUnaPasada = 0

  def recibirMate(mate: Mate, siguientes: List[Mateador]){
    matesTomadosEnUnaPasada += 1

    if (tomeEnEstaPasada()){
      return if (siguientes.isEmpty)
        mate
      else
        siguientes.head.recibirMate(mate, siguientes.tail)
    }else{
      mate.teTome(this)
      mate
    }
  }
}
