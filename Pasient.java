class Pasient{

  private String navn;
  private long fodselsnummer;
  private String gateadresse;
  private int postnummer;
  private int id;
  private static int idPasient;
  private Stabel<Resept> resepter = new Stabel<Resept>();

  Pasient(String navn, long fodselsnummer, String gateadresse, int postnummer) {
    this.navn = navn;
    this.fodselsnummer = fodselsnummer;
    this.gateadresse = gateadresse;
    this.postnummer = postnummer;
    id = idPasient;
    idPasient++;
  }

  public String toString(){
    return hentNavn()+"  (" +hentFodselsnummer()+ ")";
  }

  public int hentId() {return id;}
  public String hentNavn() {return navn;}
  public long hentFodselsnummer() {return fodselsnummer;}
  public String hentGateadresse() {return gateadresse;}
  public int hentPostnummer() {return postnummer;}

  public void leggTilResept(Resept resept) {
    resepter.settInn(resept);
  }

  public Stabel<Resept> hentReseptliste() {
    return resepter;
  }
}
