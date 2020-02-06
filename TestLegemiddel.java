public class TestLegemiddel {
    public static void main(String[] args) {

        Vanlig van = new Vanlig("vanlig", 150, 7);
        Vanedannende vaned = new Vanedannende("Heroin", 80, 5, 9000);
        Narkotisk nark = new Narkotisk("nark", 180, 9, 2);

        //skal ikke fungere:
        //Legemiddel leg = new Legemiddel("feil", 150, 2);

        System.out.println(van.hentNavn());
        System.out.println(nark.hentID());

        //lag tester for alle de forskjellige objektene. Test alle metoder.
        //bruk true false for å sjekke

        boolean idTest = van.hentID() == nark.hentID();
        System.out.println(van.hentID());
        System.out.println(vaned.hentID());
        System.out.println(nark.hentID());


    }
}
