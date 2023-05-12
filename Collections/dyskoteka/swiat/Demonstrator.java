package dyskoteka.swiat;

import dyskoteka.obiektyDyskoteki.CzlowiekZewnetrzny;
import dyskoteka.obiektyDyskoteki.Student;
import dyskoteka.obiektyDyskoteki.Studentka;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class Demonstrator {

        public static void main(String[] args) {
            Dyskoteka dyskoteka = new Dyskoteka();
            dyskoteka.goLive();
            // demonstracjaDziwnejMapy();
        }

        public static void demonstracjaDziwnejMapy() {
            Map<String, Set<CzlowiekZewnetrzny>> rejestr = new HashMap<>();
            CzlowiekZewnetrzny c;
            for(int i = 0; i<10; i++) {
                c = new CzlowiekZewnetrzny();
                if( rejestr.containsKey( c.getName() ) ) {
                    rejestr.get(c.getName()).add(c);
                } else {
                    rejestr.put(c.getName(), new HashSet<>(Set.of(c)));
                }
            }
            System.out.println(rejestr);

            // Dopuszczamy sytuację w stylu:
            // Jola=[CzlowiekZewnetrzny{name=Jola, age=22, id=2}, CzlowiekZewnetrzny{name=Jola, age=29, id=4}]
            // Dlatego dodając do Mapy nie można zastosować put, bo wtedy wymazana zostanie poprzednia osoba w Secie
            // Unikalność osób zapewnia nam Set, a nie Mapa
        }

}
