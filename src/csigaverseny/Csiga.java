
package csigaverseny;


public class Csiga {
    
//    private String szin;
//    private String karakter = "🐌";
//    private int megy;
//    private int gyorsit;
//
//    public Csiga(String szin) {
//        this.szin = szin;
//        this.megy = 0;      
//        this.gyorsit = 0;
//    }
//    
//    public String getSzin() {
//        return szin;
//    }
//
//    public void Gyorsit() {
//        int gyorsit = (int)(Math.random() * 4);
//        this.megy += gyorsit;
//    }
//
//    public int getMegy() {
//        return megy;
//    }
//
//    public int getGyorsit() {
//        return gyorsit;
//    }
    private String color;
    private int totalSpeed;
    private String emoji = "🐌";  // Csiga emoji

    public Csiga(String color) {
        this.color = color;
        this.totalSpeed = 0;
    }

    // Véletlenszerű gyorsító hozzáadása a csiga sebességéhez
    public void boost() {
        int boost = (int)(Math.random() * 4);  // Véletlenszerű gyorsító: 0, 1, 2 vagy 3
        this.totalSpeed += boost;
    }

    // Csiga színének lekérése
    public String getColor() {
        return color;
    }

    // Csiga sebességének lekérése
    public int getTotalSpeed() {
        return totalSpeed;
    }

    // Sebesség alaphelyzetbe állítása a következő versenyhez
    public void reset() {
        this.totalSpeed = 0;
    }

    // Csiga emoji kiírása
    public void displaySnail() {
        System.out.println(emoji + " " + this.color + " csiga");
    }
}
