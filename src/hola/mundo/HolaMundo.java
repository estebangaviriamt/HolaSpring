/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola.mundo;

import java.util.Scanner;

public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el primer numero");
        x = Integer.parseInt(sc.nextLine());
        System.out.println("Escriba el segundo numero");
        y = Integer.parseInt(sc.nextLine());
        System.out.println(x+y);
         */
        /*
        Scanner sc = new Scanner(System.in);
        double distanciamt, distanciacm, distanciakm;
        System.out.println("Escriba su distancia en Kilometros");
        distanciakm = Double.parseDouble(sc.nextLine());
        distanciamt = distanciakm * 1000;
        distanciacm = distanciakm * 100000;
        System.out.println("Su distancia en metros es: " + distanciamt+ " Metros");
        System.out.println("Su distancia en centimetros es: " + distanciacm + " Centimetros");
        System.out.println("La distancia que usted puso en kilometros es: " + distanciakm + " Kilometros");
       */
        Scanner sc = new Scanner(System.in);
        double ejex1, ejex2, ejey1, ejey2, distancia;
        System.out.println("Escriba el eje x1");
        ejex1 = Double.parseDouble(sc.nextLine());
        System.out.println("Escriba el eje x2");
        ejex2 = Double.parseDouble(sc.nextLine());
        System.out.println("Escriba el eje y1");
        ejey1 = Double.parseDouble(sc.nextLine());
        System.out.println("Escriba el eje y2");
        ejey2 = Double.parseDouble(sc.nextLine());
        distancia = Math.sqrt(Math.pow((ejex2 - ejex1), 2) + Math.pow((ejey2 - ejey1), 2));
        System.out.println("La distancia es " + distancia);

    }

}
