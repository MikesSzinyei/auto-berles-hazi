
package kellkocsi;


public class Autok implements Comparable<Autok>{
    
    private String rendszam;
    private int utasok;
    private String meghajtas;
    private int berletiDij;

    public Autok(String sor) {
    
        String[] t = sor.split(",");
        this.rendszam=t[0];
        this.utasok=Integer.parseInt(t[1]);
        this.meghajtas=t[2];
        this.berletiDij=Integer.parseInt(t[3]);
        
    }

    @Override
    public String toString() {
        return "Autok{" + "rendszam=" + rendszam + ", utasok=" + utasok + ", meghajtas=" + meghajtas + ", berletiDij=" + berletiDij + '}';
    }

    @Override
    public int compareTo(Autok o) {
        return this.rendszam.compareTo(o.rendszam);
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public int getUtasok() {
        return utasok;
    }

    public void setUtasok(int utasok) {
        this.utasok = utasok;
    }

    public String getMeghajtas() {
        return meghajtas;
    }

    public void setMeghajtas(String meghajtas) {
        this.meghajtas = meghajtas;
    }

    public int getBerletiDij() {
        return berletiDij;
    }

    public void setBerletiDij(int berletiDij) {
        this.berletiDij = berletiDij;
    }
    
   
    
    
    
}
