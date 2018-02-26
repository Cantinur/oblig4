import java.util.Iterator;


class DynamiskTabell<T> extends StatiskTabell<T>{

  public DynamiskTabell(int lengde){
    super(lengde);
    this.tabell = (T[]) new Object[skrivLengde()];
  }

  private T[] tabell;


  @Override
  public void settInn(T element){
    for (int i = 0; i <= tabell.length-1; i++){
      if (tabell[i] == null){
        tabell[i] = element;
        return;
      }
    }
    T[] temp = tabell;
    int nyLengde = endreLengde(skrivLengde()*2);
    tabell = (T[]) new Object[nyLengde];
    int i = 0;
    for (T data : temp){
      tabell[i] = data;
      i++;
    }
    tabell[i] = element;
  }
}
