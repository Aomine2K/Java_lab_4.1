package Klasy;
import Interfejsy.StudentI;

public class Student implements StudentI{

    private String imie;
    private String nazwisko;
    private String kierunek;
    private String specjalizacja;
    private int nrindeksu;

    public String getImie() {
        return imie;
    }

    @Override
    public void setImie(String imie) {
        this.imie = imie;
    }


    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKierunek() {
        return kierunek;
    }

    @Override
    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    @Override
    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    @Override
    public void setNrIndeksu(int nrIndeksu) {

    }

    public int getNrindeksu() {
        return nrindeksu;
    }

    public void setNrindeksu(int nrindeksu) {
        this.nrindeksu = nrindeksu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko=" + nazwisko +
                ", kierunek='" + kierunek + '\'' +
                ", specjalizacja='" + specjalizacja + '\'' +
                ", nrindeksu=" + nrindeksu +
                '}';
    }
}
