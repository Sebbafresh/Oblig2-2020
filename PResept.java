class PResept extends HvitResept{
  private int pris;
  public PResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientID){
    super(legemiddel, utskrivendeLege, pasientID, 3);

  }


  @Override
  public double prisAaBetale(){
    if(pris > 108){
      return pris - 108;
    }
    return 0;
  }


}
