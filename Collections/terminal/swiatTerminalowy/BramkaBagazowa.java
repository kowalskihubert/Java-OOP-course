package terminal.swiatTerminalowy;

import terminal.pasazerowieIBagaze.BagazGlowny;
import terminal.pasazerowieIBagaze.Bilet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class BramkaBagazowa implements BagazoZdawalne {

    private Map<Bilet, Set<BagazGlowny>> mapaBiletBagazGlowny = new HashMap<>();

    public void zdajBagaz(Bilet bilet, BagazGlowny bagazGlowny) {
        if(mapaBiletBagazGlowny.containsKey(bilet)) {
            mapaBiletBagazGlowny.get(bilet).add(bagazGlowny);
        } else {
            mapaBiletBagazGlowny.put(bilet, new HashSet<>(Set.of(bagazGlowny)));;
        }
    }


}
