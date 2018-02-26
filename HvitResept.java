public class HvitResept extends Resept{
  public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
    super(legemiddel, utskrivendeLege, pasientId, reit);
  }

  @Override
  public String farge(){return "hvit";}

  @Override
  public double prisAaBetale(){
    Legemiddel l = hentLegemiddel();
    return 0.75*l.hentPris();
  }

}
