public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */
        Dom dom1 = new Dom();
        dom1.setBudynek("Muzykant");
        dom1.powierzchnia(200.0);
        dom1.adresBudynku("Kolejowa 10");
        dom1.liczbaOkien(56);
        dom1.liczbaMieszkancow(8);
        dom1.poleBudynku(30.0, 48.0);
        dom1.kolorDomu(KolorEnum.Czarny);

        System.out.println(dom1.toString());

        System.out.println();

        Budynek dom2 = new Dom();
        dom2.setBudynek("Wika");
        dom2.powierzchnia(100.0);
        dom1.adresBudynku("Długa 2");
        dom1.liczbaOkien(11);
        dom1.liczbaMieszkancow(1);
        dom1.poleBudynku(19.0, 33.0);
        dom1.kolorDomu(KolorEnum.Biały);

        System.out.println(dom2.toString());

        System.out.println();




   }



        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */






        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */



    }

