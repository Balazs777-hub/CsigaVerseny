
package csigaverseny;

import java.util.Scanner;


public class CsigaVerseny {

    private static final Scanner scr = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Verseny verseny = new Verseny();    

        System.out.println("Melyik csigára fogadsz? (Piros, Kék, Zöld)");
        String fogatSzin = scr.nextLine();

        verseny.versenyIndito();

        verseny.Fogadas(fogatSzin);

        scr.close();

    }

    
}
