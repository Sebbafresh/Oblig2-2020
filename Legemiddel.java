abstract public class Legemiddel {
    protected String navn;
    protected double pris;
    protected double virkestoff;
    protected int id;
    protected static int idTeller = 1;


    public Legemiddel(String navn, double pris, double virkestoff){
        this.navn = navn;
        this.pris = pris;
        this.virkestoff = virkestoff;
        id = idTeller;
        idTeller++;
    }

    public int hentID(){
        return id;
    }

    public String hentNavn(){
        return navn;
    }

    public double hentPris(){
        return pris;
    }

    public double hentVirkestoff(){
        return virkestoff;
    }

    public void settNyPris(double nyPris){
        pris = nyPris;
    }

}
