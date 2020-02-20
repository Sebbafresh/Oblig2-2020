class BlaaResept extends Resept{
  private int pris;
  public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientID, int reit){
    super(legemiddel, utskrivendeLege, pasientID, reit);
  }

  @Override
  public String farge(){
    return "Blaa";
  }

  @Override
  public double prisAaBetale(){
    return legemiddel.hentPris() * 0.25;
  }
}
