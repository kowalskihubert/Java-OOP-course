package task2.biletyIKasowniki;

import task2.wyjatki.ProblemyZPolaczeniemException;

public interface Kasownik {

    boolean walidujBilet(Bilet bilet) throws ProblemyZPolaczeniemException;
}
