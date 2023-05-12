package automatSprzedajacy.obiektySwiataAutomatow;

import automatSprzedajacy.wyjatki.SugarTooHighException;

import java.util.Random;

public class Serwisant extends Czlowiek {

    private Serwisowalne automatSerwisanta;
    private Random random = new Random();

    public Serwisant (Serwisowalne automatSerwisanta) {
        this.automatSerwisanta = automatSerwisanta;
    }

    public void doJob() {
        boolean kontynuacja = true;
        while(kontynuacja) {
            if(random.nextBoolean()) {
                try {
                    kontynuacja = automatSerwisanta.put(new Baton());
                } catch (SugarTooHighException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            } else {
                try {
                    kontynuacja = automatSerwisanta.put(new Rogal());
                } catch (SugarTooHighException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
        kontynuacja = true;
        while(kontynuacja) {
            try {
                kontynuacja = automatSerwisanta.putDrink(new Napoj());
            } catch (SugarTooHighException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        automatSerwisanta.randomOrder();
        automatSerwisanta.getAll();
    }

    @Override
    public String toString() {
        return "Serwisant{" +
                '}';
    }
}
