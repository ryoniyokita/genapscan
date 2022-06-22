/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnpscanner;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Gnpscanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int awal, akhir, data;
        Scanner dataInput = new Scanner(System.in);
        System.out.print("Masukkana awal : ");
        awal = dataInput.nextInt();
        System.out.print("Masukkana akhir : ");
        akhir = dataInput.nextInt();
        System.out.println("========================");
        System.out.print("Bilanganp : ");
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Bilanganil : ");
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
    
}
