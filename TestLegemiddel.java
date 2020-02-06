public class TestLegemiddel {
    public static void main(String[] args) {

        Vanlig van = new Vanlig("vanlig", 150, 7);
        Vanedannende vaned = new Vanedannende("Heroin", 80, 5, 9000);
        Narkotisk nark = new Narkotisk("nark", 180, 9, 2);

        //skal ikke fungere:
        //Legemiddel leg = new Legemiddel("feil", 150, 2);


        //lag tester for alle de forskjellige objektene. Test alle metoder.

        //Tester Vanlig først
        System.out.println("\nInformasjon om vanlig legemiddel: ");
        System.out.println("--------------");
        System.out.println(van.hentID());
        System.out.println(van.hentNavn());
        System.out.println(van.hentPris());
        System.out.println(van.hentVirkestoff());
        van.settNyPris(1);
        System.out.println("Ny pris: " + van.hentPris());


        //tester Vanedannende deretter
        System.out.println("\nInformasjon om vanedannende legemiddel: ");
        System.out.println("--------------");
        System.out.println(vaned.hentID());
        System.out.println(vaned.hentNavn());
        System.out.println(vaned.hentPris());
        System.out.println(vaned.hentVirkestoff());
        vaned.settNyPris(500);
        System.out.println("Ny pris: " + vaned.hentPris());


        //tester narkotiske legemidler
        System.out.println("\nInformasjon om narkotiske legemiddel: ");
        System.out.println("--------------");
        System.out.println(nark.hentID());
        System.out.println(nark.hentNavn());
        System.out.println(nark.hentPris());
        System.out.println(nark.hentVirkestoff());
        nark.settNyPris(666);
        System.out.println("Ny pris: " + nark.hentPris());



    }
}
