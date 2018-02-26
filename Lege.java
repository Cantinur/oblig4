class Lege implements Comparable<Lege>{

  private String etternavn;
  private Koe<Resept> resepter = new Koe<Resept>();

  public Lege(String etternavn){
    this.etternavn = etternavn;
  }

  public String toString(){return etternavn;}

  public String hentNavn() {return etternavn;}

  public int compareTo(Lege annenLege) {
    return etternavn.compareTo(annenLege.hentNavn());
  }

  public void leggTilResept(Resept resept) {
    resepter.settInn(resept);
  }

  public Koe<Resept> hentReseptliste(){
    return resepter;
  }

}
