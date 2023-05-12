package task2.biletyIKasowniki;

public enum Stoliki {

    Stolik1(1), Stolik2(2), Stolik3(3), Stolik4(4), Stolik5(5), Stolik6(6), Stolik7(7), Stolik8(8);

    private int numer;

    Stoliki(int numer) {
        this.numer = numer;
    }

    public int getNumer() {
        return numer;
    }

}
