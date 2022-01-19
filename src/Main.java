import Klasy.Kwadrat;
import Klasy.Prostokat;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */


        Prostokat prostokat = new Prostokat();
        prostokat.nazwaFigury("Prostokat");
        System.out.println(prostokat.obwod(15, 12.3));
        System.out.println(prostokat.pole(4.5, 52.22));

        System.out.println();

        Kwadrat kwadrat = new Kwadrat();
        kwadrat.nazwaFigury("Kwadrat");
        System.out.println(kwadrat.obwod(55, 52.31));
        System.out.println(kwadrat.pole(7.3, 23.2));

        System.out.println();

    }
}
