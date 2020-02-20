class TestResepter{
  public static void main(String[] args) {
    Vanlig van = new Vanlig("vanlig", 150, 7);
    Vanedannende vaned = new Vanedannende("Heroin", 80, 5, 9000);
    Narkotisk nark = new Narkotisk("nark", 180, 9, 2);
    Lege lege = new Lege();


    HvitResept hres = new HvitResept(van, lege, 100, 150);
    HvitResept hres2 = new HvitResept(vaned, lege, 50, 15);
    PResept pres = new PResept(vaned, lege, 50);

    System.out.println(hres.farge());
    System.out.println(hres.hentId());
    System.out.println(hres2.hentId());
    System.out.println(pres.hentId());
    pres.bruk();
    System.out.println(pres.hentReit());

  }
}
