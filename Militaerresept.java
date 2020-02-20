class Militaerresept extends HvitResept{
  private int pris;
  public Militaerresept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientID, int reit){
    super(legemiddel, utskrivendeLege, pasientID, reit);

  }

  @Override
  public double prisAaBetale(){
    return 0;
  }



}
