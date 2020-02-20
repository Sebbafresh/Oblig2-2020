class BlaaResept extends Resept{

  public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientID, int reit){
    super(legemiddel, utskrivendeLege, pasientID, reit);
  }

  @Override
  public String farge(){
    return "Blaa";
  }

  @Override
  public double prisAaBetale(){
    return 0;
  }
}
