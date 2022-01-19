package Klasy;
import Interfejsy.PracownikI;



public class Pracownik implements PracownikI{


    private String imie;
    private int nazwisko;
    private String stanowisko;
    private int wynagrodzenie;
    private double premia;

    public String getImie() {
        return imie;
    }

    @Override
    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getNazwisko() {
        return nazwisko;
    }

    @Override
    public void setNazwisko(int nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    @Override
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Override
    public void setWynagrodzenie(double wynagrodzenie) {

    }

    @Override
    public void setPremia(int premia) {

    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    public double getPremia() {
        return premia;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko=" + nazwisko +
                ", stanowisko='" + stanowisko + '\'' +
                ", wynagrodzenie=" + wynagrodzenie +
                ", premia=" + premia +
                '}';
    }
}
