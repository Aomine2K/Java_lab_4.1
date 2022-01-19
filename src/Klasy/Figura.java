package Klasy;

public abstract  class Figura {

    public abstract double pole(double wysokosc, double szerokosc);

    public abstract double obwod(double dlugoscA, double dlugoscB);

   public void nazwaFigury(String figura){

       System.out.println("To jest figura " + figura);
   }

}
