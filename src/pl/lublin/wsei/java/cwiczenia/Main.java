package pl.lublin.wsei.java.cwiczenia;

import static java.lang.Math.pow;

public class Main {
    /**
     *
     * @param args Argumenty funkcji Main
     */
    public static void main(String[] args) {

        // Komentarz jednolinijkowy
        /* komentarz wielolinijkowy */
        System.out.println("Hello there");
        System.out.print("Pola");
        System.out.print(" ma ");
        System.out.print("królika\n");

        System.out.println("Pola");
        System.out.println("ma");
        System.out.println("królika");

        System.out.print("Pola\n");
        System.out.print("ma\n");
        System.out.print("królika\n");

        int a = 15;
        double b = 4.13;
        String s = "Kot Puszek";

        System.out.printf("a = %d, b = %.2f, s = %20s %n",a,b,s);

        System.out.println("Nazwaliśmy to \"witaminą B3\"");

        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i <= 360; i+=10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));

        int suma=0;

        System.out.printf("arg\t\tlog2(arg)\t\tsum(arg)\n");
        for (int i = 0; i <= 15; i+=1)
            System.out.printf("%d\t\t%f\t\t%d\t\n", (int)pow(2, i), (Math.log((int)pow(2, i)) / Math.log(2)), (int)(suma+=(int)pow(2, i)));

    }
}
