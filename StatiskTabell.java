/*Skriv en klasse StatiskTabell<T> som implementerer grensesnittet Tabell<T>
som er gjengitt ovenfor. Konstruktøren skal ta inn lengden på arrayet
(som også er tabellens kapasitet) som eneste parameter.
Denne beholderen skal kaste et FullTabellUnntak hvis arrayet er
fullt når et element blir forsøkt satt inn. Hvis man forsøker å hente fra en
plass som ikke er en gyldig indeks i arrayet, eller som det ikke er satt inn
noe på, skal det kastes et UgyldigPlassUnntak.*/
import java.util.Iterator;

class StatiskTabell<T> implements Tabell<T>{

  public StatiskTabell(int lengde){
    this.lengde = lengde;
    this.tabell = (T[]) new Object[lengde];
  }

  private int lengde;
  private T[] tabell;

  public int storrelse(){
    int teller = 0;
    for (T data : tabell){
      if (data != null){
        teller++;
      }
    }
    return teller;
  }

  public int skrivLengde(){
    return lengde;
  }

  public int endreLengde(int tall){
    lengde = tall;
    return lengde;
  }

  public boolean erTom(){
    for(T data : tabell){
      if (data != null){
        return false;
      }
    }
    return true;
  }

  public void settInn(T element) throws FullTabellUnntak{
      for (int i = 0; i <= tabell.length-1; i++){
        if (tabell[i] == null){
          tabell[i] = element;
          return;
        }
      }
      throw new FullTabellUnntak(tabell.length-1);
  }

  public void skrivUt(){
    for (T data : tabell){
      System.out.println(data);
    }
  }

  public T hentFraPlass(int plass)throws UgyldigPlassUnntak{
    if (!erTom()){
      if (plass == 0){
        T data = tabell[0];
        return data;
      } else if (plass <= tabell.length-1 && plass > 0){
          T data = tabell[plass];
          return data;
        }
    }
    throw new UgyldigPlassUnntak(plass, lengde);
  }

  public Iterator<T> iterator(){
    return new MinIterator();
  }

  private class MinIterator implements Iterator<T>{
    int teller = 0;

    public T next(){
      T data = tabell[teller];
      teller++;
      return data;
    }

    public void remove()throws UnsupportedOperationException{
       throw new UnsupportedOperationException("Kan ikke slette");
    }

    public boolean hasNext(){
      if (teller <= tabell.length-1){
        return (tabell[teller] != null);
      }
      return false;
    }
  }
}
