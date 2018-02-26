abstract class Legemiddel{
  private String navn;
  private double pris;
  private double virkestoff;
  private int id;
  public static int legemiddelID;

  public Legemiddel(String navn, double pris, double virkestoff){
    this.navn = navn;
    this.pris = pris;
    this.virkestoff = virkestoff;
    id = legemiddelID;
    legemiddelID++;
  }

  public String toString(){
    return hentNavn();
  }

  public int hentId() {return id;}
  public String hentNavn() {return navn;}
  public double hentPris() {return pris;}
  public double hentVirkestoff() { return virkestoff;}


}
