
package csigaverseny;


public class Verseny {
    
//    private Csiga[] csiga;
//    private String nyertes;
//
//    public Verseny() {
//
//        csiga = new Csiga[]{
//            new Csiga("Piros"),
//            new Csiga("Kék"),
//            new Csiga("Zöld")
//        };
//    }
//
//    public void versenyIndito() {
//        for (int kor = 1; kor <= 10; kor++) {
//            System.out.println("Kör: " + kor);
//            
//            for (Csiga csiga : csiga) {
//                csiga.gyorsit();
//                System.out.println(csiga.getSzin() + " csiga sebessége: " + csiga.getMegy());
//            }
//            System.out.println("--------");
//        }
//
//        Csiga nyertescsiga = csiga[0];
//        for (Csiga csiga : csiga) {
//            if (csiga.getMegy() > nyertescsiga.getMegy()) {
//                nyertescsiga = csiga;
//            }
//        }
//
//        nyertes = nyertescsiga.getSzin();
//        System.out.println("A nyertes csiga: " + nyertes);
//    }
//
//    public void Fogadas(String fogatSzin) {
//        if (nyertes.equalsIgnoreCase(fogatSzin)) {
//            System.out.println("Gratulálok! Nyertél a fogadásoddal!");
//        } else {
//            System.out.println("Sajnálom, nem nyertél.");
//        }
//    }
//
//    public void versenyMegal() {
//        for (Csiga csiga : csiga) {
//            csiga.reset();
//        }
//    }
    private Csiga[] snails;
    private String winner;

    public Verseny() {
        // Csigák létrehozása
        snails = new Csiga[]{
            new Csiga("Piros"),
            new Csiga("Kék"),
            new Csiga("Zöld")
        };
    }

    // Játék futtatása 10 körön keresztül
    public void startRace() {
        for (int round = 1; round <= 10; round++) {
            System.out.println("Kör: " + round);
            
            // Minden csiga kap egy véletlenszerű gyorsítót
            for (Csiga snail : snails) {
                snail.boost();
                snail.displaySnail();  // Kiírjuk a csiga emojit
                System.out.println(snail.getColor() + " csiga sebessége: " + snail.getTotalSpeed());
            }
            System.out.println("--------");
        }

        // A nyertes csiga meghatározása
        Csiga winnerSnail = snails[0];
        for (Csiga snail : snails) {
            if (snail.getTotalSpeed() > winnerSnail.getTotalSpeed()) {
                winnerSnail = snail;
            }
        }

        winner = winnerSnail.getColor();
        System.out.println("A nyertes csiga: " + winner);
    }

    // Fogadás ellenőrzése
    public void checkBet(String betColor) {
        if (winner.equalsIgnoreCase(betColor)) {
            System.out.println("Gratulálok! Nyertél a fogadásoddal!");
        } else {
            System.out.println("Sajnálom, nem nyertél.");
        }
    }

    // Verseny resetelése a következő futtatáshoz
    public void resetRace() {
        for (Csiga snail : snails) {
            snail.reset();
        }
    }
}
