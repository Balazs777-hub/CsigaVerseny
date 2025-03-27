
package csigaverseny;


public class Verseny {
    
    private Csiga[] csiga;
    private String nyertes;

    public Verseny() {

        csiga = new Csiga[]{
            new Csiga("Piros"),
            new Csiga("Kék"),
            new Csiga("Zöld")
        };
    }

    public void versenyIndito() {
        for (int kor = 1; kor <= 10; kor++) {
            System.out.println("Kör: " + kor);
            
            for (Csiga csiga : csiga) {
                csiga.gyorsit();
                System.out.println(csiga.getSzin() + " csiga sebessége: " + csiga.getMegy());
            }
            System.out.println("--------");
        }

        Csiga nyertescsiga = csiga[0];
        for (Csiga csiga : csiga) {
            if (csiga.getMegy() > nyertescsiga.getMegy()) {
                nyertescsiga = csiga;
            }
        }

        nyertes = nyertescsiga.getSzin();
        System.out.println("A nyertes csiga: " + nyertes);
    }

    public void Fogadas(String fogatSzin) {
        if (nyertes.equalsIgnoreCase(fogatSzin)) {
            System.out.println("Gratulálok! Nyertél a fogadásoddal!");
        } else {
            System.out.println("Sajnálom, nem nyertél.");
        }
    }

    public void versenyMegal() {
        for (Csiga csiga : csiga) {
            csiga.reset();
        }
    }
}
