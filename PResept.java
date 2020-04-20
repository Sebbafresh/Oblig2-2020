class PResept extends HvitResept{
  public PResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientID){
    super(legemiddel, utskrivendeLege, pasientID, 3);
  }


  @Override
  public double prisAaBetale(){
    double pris = legemiddel.hentPris();
    if(pris > 108){
      return pris - 108;
    }
    return 0;
  }


}
