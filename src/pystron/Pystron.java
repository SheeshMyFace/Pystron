/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pystron;

import java.util.Scanner;

/**
 *
 * @author DoDo
 */
public class Pystron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Измерительная программа объёма пиструн 1.0");
        System.out.println("Напиши 1 чтобы продолжить");

        System.out.print("Сюда = ");
        Double x = in.nextDouble();

        if (x == 1) {

            System.out.print("Напиши ширину Владика = ");
            Double D = in.nextDouble();
            System.out.print("Черкани длину бабиджона = ");
            Double h = in.nextDouble();
            Double V;
            Double Head;
            Double All;
            Head = (4) / (3) * Math.PI * Math.pow(D, 3);
            V = Math.PI * (D / 2) * h;
            All = Head + V;
            System.out.println("объём Ствола  = " + V);
            System.out.println("Головка равна = " + Head);
            System.out.println("А вместе это = " + All);

        } else {
            System.out.println("ПШЛНХЙ");
            System.out.print("https://youtu.be/gUdHsp5rs5g?si=IuwZBKI9H3Ydo36u");
        }
    }

}
