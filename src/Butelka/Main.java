package Butelka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        pole_prostokata pole = new pole_prostokata();

        pole.czytajDane();
        pole.oblicz();
        pole.wynik();
    }
}

class pole_prostokata
    {
            double a, b, pole;
            
            public void czytajDane ()
            {
                    System.out.print("Podaj długość a: ");
                    Scanner wejdz = new Scanner(System.in);
                    a = wejdz.nextDouble();
                    System.out.print("Podaj długość b: ");
                    b = wejdz.nextDouble();
            }

            public void oblicz ()
            {
                pole = a * b;
            }

            public void wynik ()
            {
                System.out.print("Pole prostokata o boku a = " + a);
                System.out.print(" o boku b = " + b + " wynosi = " + pole);
            }
    }
