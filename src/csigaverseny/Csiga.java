
package csigaverseny;


public class Csiga {
    
    private String szin;
    private String karakter = "🐌";
    private int megy;
    private int gyorsit;

    public Csiga(String szin) {
        this.szin = szin;
        this.megy = 0;      
        this.gyorsit = 0;
    }
    
    public String getSzin() {
        return szin;
    }

    public void Gyorsit() {
        int gyorsit = (int)(Math.random() * 4);
        this.megy += gyorsit;
    }

    public int getMegy() {
        return megy;
    }

    public int getGyorsit() {
        return gyorsit;
    }
}
