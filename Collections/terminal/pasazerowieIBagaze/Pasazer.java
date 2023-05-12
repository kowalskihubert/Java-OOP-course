package terminal.pasazerowieIBagaze;

import java.util.*;

public class Pasazer {

    private Bilet bilet;
    private Set<BagazGlowny> bagazeGlowne = new TreeSet<>(); // 2-3 posortowane malejaco po id bagazu!
    private List<BagazPodreczny> bagazePodreczne = new LinkedList<>(); //1-2
    private Random random = new Random();

    public Pasazer() {
        // Bilet
        this.bilet = Bilet.generujBilet();
        // Bagaze
        int iloscGlownych = random.nextInt(2,4);
        int iloscPodrecznych = random.nextInt(1,3);
        for(int i = 0; i < iloscGlownych; i++) {
            bagazeGlowne.add(new BagazGlowny());
        }
        for(int i = 0; i < iloscPodrecznych; i++) {
            bagazePodreczne.add(new BagazPodreczny());
        }
    }

    public Set<BagazGlowny> oddajBagazeGlowne() {
        Set<BagazGlowny> bagaze = new TreeSet<>(this.bagazeGlowne);
        this.bagazeGlowne.clear();
        return bagaze;
    }

    public List<BagazPodreczny> getBagazePodreczne() {
        return this.bagazePodreczne; // albo kopię ich
    }

    public void usunBagazPodreczny(BagazPodreczny bagazPodreczny) {
        this.bagazePodreczne.remove(bagazPodreczny);
    }

    public Bilet getBilet() {
        return this.bilet;
    }

    @Override
    public String toString() {
        return "Pasazer{" +
                "imie=" + bilet.getImie() + ", nazwisko=" + bilet.getNazwisko() +
                '}';
    }
}
