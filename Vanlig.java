public class Vanlig extends Legemiddel {

    public Vanlig(String navn, double pris, double virkestoff){
        super(navn, pris, virkestoff);

    }

    @Override
    public String toString(){
      return "Navnet paa preparatet: " + navn + "| ID: " + id + "| pris: " + pris + "| virkestoff " + virkestoff;
    }
}
