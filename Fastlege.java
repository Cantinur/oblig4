class Fastlege extends Lege implements Kommuneavtale{
  private int avtalenr;

    public Fastlege(String etternavn, int avtalenr){
      super(etternavn);
      this.avtalenr = avtalenr;
    }

    public int hentAvtalenummer(){
      return avtalenr;
    }
}
