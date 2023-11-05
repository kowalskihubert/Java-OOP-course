package anonimWewLok.pszczoly;

public class Main {

    public static void main(String[] args) {
        Apis apis = new Apis();
        apis.dodajPszczole("Maja", 3);
        apis.dodajPszczole("Stinger", 10);
        apis.dodajPszczole("Bee", 18);

        System.out.println("Posortowane wg siły");
        apis.sortujWgPorownaniaSily();
        for(Pszczola pszczola : apis.getListaPszczol()) {
            System.out.println(pszczola);
        }

        System.out.println("\nPosortowane wg sily i imienia");
        apis.sortujWgSilyiImienia();
        for(Pszczola pszczola : apis.getListaPszczol()) {
            System.out.println(pszczola);
        }

        System.out.println("\nDodanie zolnierza");
        apis.dodajZolnierza("Helena", 20);

        System.out.println("\nWątki pszczol");
        apis.watkiPszczol();

        System.out.println("\nPo wykonaniu wątków");
        for(Pszczola pszczola : apis.getListaPszczol()) {
            System.out.println(pszczola);
        }

        System.out.println("\nTest Zwierza");
        Apis.Zwierz.Kot kot = apis.wypiszZwierzaKota();
        System.out.println(kot);
        Apis.Zwierz.Kot kot2 = new Apis.Zwierz.Kot("Bonifacy", 3);
        System.out.println(kot2);

    }
}
