package anonimWewLok.przesluchanie;

public abstract class Iterrogated {

    public abstract void interrogateMe();

    public static class Swiadek extends Iterrogated {

        protected String imie;
        protected String nazwisko;

        public Swiadek(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        @Override
        public String toString() {
            return "Swiadek: " + imie + " " + nazwisko.charAt(0) + ".";
        }

        @Override
        public void interrogateMe() {
            System.out.println("Jestem przesluchiwany. " + this);
        }
    }

    public static class Podejrzany extends Iterrogated {

        protected String imie;
        protected String nazwisko;

        public Podejrzany(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        @Override
        public String toString() {
            class ProdukcjaStringa {
                public String getString() {
                    return "Podejrzany: " + imie + " " + nazwisko.charAt(0) + ".";
                }
            }
            ProdukcjaStringa ps = new ProdukcjaStringa();
            return ps.getString();
        }

        @Override
        public void interrogateMe() {
            System.out.println("Jestem przesluchiwany" + this);
        }
    }

    public static class TajnyAgent extends Iterrogated {
        protected String pseudonim;

        public TajnyAgent(String pseudonim) {
            this.pseudonim = pseudonim;
        }

        @Override
        public String toString() {
            return "Agent: " + pseudonim;
        }

        @Override
        public void interrogateMe() {
            System.out.println("Jestem przesluchiwany. " + this);
        }
    }
}
