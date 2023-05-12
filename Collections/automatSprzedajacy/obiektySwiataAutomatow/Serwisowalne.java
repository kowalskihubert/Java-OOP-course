package automatSprzedajacy.obiektySwiataAutomatow;

import automatSprzedajacy.wyjatki.SugarTooHighException;

public interface Serwisowalne extends Automatopodobne {

    boolean put(Slodycz slodycz) throws SugarTooHighException;
    boolean putDrink(Napoj napoj) throws SugarTooHighException;

}
