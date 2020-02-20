class HvitResept extends Resept{
  public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientID, int reit){
    super(legemiddel, utskrivendeLege, pasientID, reit);
  }

  @Override
  public String farge(){
    return "Hvit";
  }

  @Override
  public double prisAaBetale(){
    return 0;
  }
}
