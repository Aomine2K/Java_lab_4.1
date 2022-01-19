package Klasy;

public class Kwadrat extends  Figura{

    @Override
    public double pole(double wysokosc, double szerokosc) {
        return wysokosc * szerokosc;
    }

    @Override
    public double obwod(double dlugoscA, double dlugoscB) {
        return 2*dlugoscA + 2*dlugoscB;
    }
}



