class Cebador() {

  def iniciarPasada(mateadores: List[Mateador]){
    val mate = new Mate()

    while(mate.todosYaTomaron()){
      mate = mateadores.head.recibirMate(mate, mateadores.tail)
    }

  }
}

