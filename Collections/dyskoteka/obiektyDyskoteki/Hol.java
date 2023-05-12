package dyskoteka.obiektyDyskoteki;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Hol {

    private List<Uczestnik> uczestnicyWHolu;
    private static Random random = new Random();

    public Hol() {
        uczestnicyWHolu = new LinkedList<>();
        for(int i=0; i<33;i++) {
            uczestnicyWHolu.add(new Student());
        }
        for(int i=0; i<33;i++) {
            uczestnicyWHolu.add(new CzlowiekZewnetrzny());
        }
        for(int i=0; i<33;i++) {
            uczestnicyWHolu.add(new Studentka());
        }
    }

    public List<Uczestnik> getUczestnicyWHolu() {
        return uczestnicyWHolu;
    }
}
