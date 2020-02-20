class Militaerresept extends HvitResept{
  public Militaerresept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientID, int reit){
    super(legemiddel, utskrivendeLege, pasientID, reit);

  }

  @Override
  public double prisAaBetale(){
    return legemiddel.hentPris() * 0;
  }



}
