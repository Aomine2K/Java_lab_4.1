 public class Dom implements Budynek {

     private String budynek;
     private double pow;
     private String adres;
     private int okna;
     private int mieszkancy;
     private double poleBudynku;
     private KolorEnum kolor;


        @Override
        public double powierzchnia(double pow) {
            return pow;
        }

        @Override
        public String adresBudynku(String adres) {
        return adres;
        }

        @Override
        public int liczbaOkien(int value) {
            return okna;
        }

        @Override
        public void liczbaMieszkancow(int mieszkancy) { this.mieszkancy = mieszkancy;}

        @Override
        public void kolorDomu(KolorEnum kolor) {
            this.kolor = kolor;
        }

     @Override
     public void liczbaMieszkancow(int ilosc, int liczbaPolakow) {

     }


     public String getBudynek() {
            return budynek;
        }


     public void poleBudynku(double v, double v1) {
     }

        public void setBudynek(String budynek) {
            this.budynek = budynek;
        }

        public double getPow() {
            return pow;
        }

        public void setPow(double pow) {
            this.pow = pow;
        }

        public String getAdres() {
            return adres;
        }

        public void setAdres(String adres) {
            this.adres = adres;
        }

        public int getOkna() {
            return okna;
        }

        public void setOkna(int okna) {
            this.okna = okna;
        }

        public int getMieszkancy() {
            return mieszkancy;
        }

        public void setMieszkancy(int mieszkancy) {
            this.mieszkancy = mieszkancy;
        }

        public double getPoleBudynku() {
            return poleBudynku;
        }

        public void setPoleBudynku(double poleBudynku) {
            this.poleBudynku = poleBudynku;
        }

        public KolorEnum getKolor() {
            return kolor;
        }

        public void setKolor(KolorEnum kolor) {
            this.kolor = kolor;
        }

        public String toString(){
            return "Dane Domu: {" +
                    "Rodzina='" + budynek +
                    ", powierzchnia='" + pow +
                    ", adres=" + adres +
                    ", liczba okien=" + okna +
                    ", liczba mieszkancow=" + mieszkancy +
                    ", kolor domu=" + kolor +
                    '}';

        };




 }
