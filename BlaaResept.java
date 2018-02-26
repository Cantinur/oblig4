public class BlaaResept extends Resept{
  int id;
  public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
    super(legemiddel, utskrivendeLege, pasientId, reit);
  }

  @Override
  public String farge(){return "blaa";}

  @Override
  public double prisAaBetale(){
    Legemiddel l = hentLegemiddel();
    return 0.25*l.hentPris();
  }

}
