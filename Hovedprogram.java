public class Hovedprogram{
  public static void main(String[] args){

    //først opprette en av hvert legemiddel
    Vanlig van = new Vanlig("Paracet", 150, 7);
    Vanedannende vaned = new Vanedannende("Heroin", 80, 5, 9000);
    Narkotisk nark = new Narkotisk("Nark", 180, 9, 2);

    //opprette lege og Spesialist
    Lege lege = new Lege("Adele");
    Spesialist spes = new Spesialist("Arne", 1337);

    //så opprette resepter
    HvitResept hres = new HvitResept(van, lege, 100, 150);
    HvitResept hres2 = new HvitResept(vaned, lege, 50, 15);
    PResept pres = new PResept(vaned, lege, 50);
    BlaaResept bres = new BlaaResept(nark, spes, 50, 15);

    /*
    if(bres.hentLege() instanceof Spesialist){
      System.out.println("Du kan skrive ut legemiddel");
    } else {
      System.out.println("Du kan ikke skrive ut legemiddel");
    }
    */

  }

}
