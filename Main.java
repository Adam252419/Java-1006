package pkg1006;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Add meg az életkorodat:");
        int eletkor = scanner.nextInt();
        
        if(eletkor <= 5){
            System.out.println("Ingyenes");
        }
        else if(eletkor <=13) {
            System.out.println("Gyerekjegy ára: 1200 Ft");
        }
        else if (eletkor <= 17) {
            System.out.println("Diákjegy ára: 1600 Ft");
        }
        else{
            
            System.out.println("Van diákod?");
            int vanDiak = scanner.nextInt();
           
            if {
                int ar = (int) (2200 * 0.8); 
                System.out.println("Kedvezményes felnőtt jegy ára (diákkal): " + ar + " Ft");
            } else {
                System.out.println("Felnőtt jegy ára: 2200 Ft");
            }
        }
    }
    public static void vizsgaeredmenyek(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hány % lett a vizsgád:");
        int vizsgaeredmeny = scanner.nextInt();
        
        if(vizsgaeredmeny == 100){
            System.out.println("Jeles, gratulálok");
        }
        else if (vizsgaeredmeny <= 99){
            System.out.println("Jeles");
        }
        else if(vizsgaeredmeny <= 84){
            System.out.println("Jó");
        }
         else if(vizsgaeredmeny <= 64){
            System.out.println("Közepes");
        }
        else if(vizsgaeredmeny <= 50){
            System.out.println("Elégséges");
        } 
        else{
            System.out.println("Értékelés: Elégtelen");
        }
    }
}
