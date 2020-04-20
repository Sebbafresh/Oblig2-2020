public class Spesialist extends Lege implements Godkjenningsfritak{
  private int id;

  public Spesialist(String navn, int id){
    super(navn);
    this.id = id;
  }

  public int hentKontrollID(){
    return id;
  }

  @Override
  public String toString(){
    return this.hentNavn() + " KontrollID: " + id;
  }
}
