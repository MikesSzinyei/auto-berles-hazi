
package kellkocsi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class KellKocsi {
    
private static ArrayList<Autok> autok = new ArrayList<Autok>();
private static ArrayList<Berles> berles = new ArrayList<Berles>();

    
    public static void main(String[] args) {
        
        try{
        BufferedReader brAutok = new BufferedReader(new FileReader("c:/file/Autok.csv"));
        String sor= brAutok.readLine();
        
        while( sor !=null)
        {
            autok.add(new Autok(sor));
            sor= brAutok.readLine();
        }
        
        brAutok.close();
        }
        catch (IOException e)
        {
            System.out.println("Hiba: "+e);
        }
        
//        for (Autok a : autok) {
//            System.out.println(a);
//        }
        
        System.out.println("");
        try{
        BufferedReader brBerles = new BufferedReader(new FileReader("c:/file/Berles.csv"));
        String sor= brBerles.readLine();
        
        while( sor !=null)
        {
            berles.add(new Berles(sor));
            sor= brBerles.readLine();
        }
        
        brBerles.close();
        }
        catch (IOException e)
        {
            System.out.println("Hiba: "+e);
            
        }
        
//        for (Berles b : berles) {
//            System.out.println(b);
//        }
        
        System.out.println("1.feladat");
        System.out.println("Az adott ügyfélhez "+berles.size()+"berlesi esemény tartozik.");
        System.out.println("Az adott ügyfél"+autok.size()+ "különböző autót bérelt.");
        System.out.println("");
        
//        System.out.println("2.feladat");
//        Collections.sort(berles);
//        for (Berles b: berles) {
//            System.out.println(b);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a rendszámot");
        String rendszam=sc.nextLine();
        
        int berletiDij= -1000;
        for (Autok a : autok) {
            
            if (a.getRendszam()==rendszam) {
                berletiDij=a.getBerletiDij();
            }
            
            if(berletiDij>=0) {
                
                for (Berles b: berles) {
                    if(b.getRendszam().equals(rendszam)){
                        Date kezdet = new Date(b.getKDatum);
                    }
                }
            } else {
                System.out.println("Nincs ilyen auto");
            }
            
       }
        
    }
    
}
