class Legeliste extends OrdnetLenkeliste<Lege>{

  //Leter igjennom liste etter lege, returnerer null, hvis den ikke finner.
    public Lege finnLege(String navn) {
        for (Lege l : this){
          if (l.hentNavn().equals(navn)){
            return l;
          }
        }
        return null;
    }


    public String[] stringArrayMedNavn(){
      String[] liste = new String[teller];
      int i = 0;

      for (Lege l : this){
        liste[i] = l.toString();
      }

      return liste;
    }
}
