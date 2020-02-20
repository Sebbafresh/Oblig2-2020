public abstract class Resept{
  protected Legemiddel legemiddel;
  private Lege utskrivendeLege;
  protected int pasientID;
  protected int reit;
  protected static int idTeller = 1;
  protected int id;

  public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientID, int reit){
    this.legemiddel = legemiddel;
    this.utskrivendeLege = utskrivendeLege;
    this.pasientID = pasientID;
    this.reit = reit;
    id = idTeller;
    idTeller++;
  }

  public Legemiddel hentLegemiddel(){
    return legemiddel;
  }

  public Lege hentLege(){
    return utskrivendeLege;
  }

  public int hentPasientID(){
    return pasientID;
  }

  public int hentReit(){
    return reit;
  }

  public int hentId(){
    return id;
  }

  public boolean bruk(){
    if(reit > 0){
      reit--;
      return true;
    } else {
      return false;
    }
  }

  abstract public String farge();
  abstract public double prisAaBetale();


}
