abstract class Resept{
  private Legemiddel legemiddel;
  private Lege utskrivendeLege;
  private int pasientId;
  private int reit;
  private int id;
  public static int reseptID;

  public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
    this.legemiddel = legemiddel;
    this.utskrivendeLege = utskrivendeLege;
    this.pasientId = pasientId;
    this.reit = reit;
    id = reseptID;
    reseptID++;
  }

public int hentId(){return id;}
public Legemiddel hentLegemiddel(){return legemiddel;}
public Lege hentLege() {return utskrivendeLege;}
public int hentPasientId() {return pasientId;}
public int hentReit() {return reit;}

public String toString(){
  return "["+hentId()+"]  " + "Pasient ID: " +  hentPasientId() + " Utskrevet: "+hentLege()+ "  Reit: "+hentReit();
}


public boolean bruk() {
  switch (reit) {
    case 0:
      return false;
    default:
      reit--;
      return true;
  }
}

abstract public String farge();
abstract public double prisAaBetale();

}
