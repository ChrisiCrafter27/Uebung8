package h1;

public class Bruch {
    public int zaehler, nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggt(int x, int y) {
        int sign = y < 0 ? -1 : 1;
        int a = Math.max(Math.abs(x), Math.abs(y));
        int b = Math.min(Math.abs(x), Math.abs(y));
        if(b == 0) return Math.max(a, 1) * sign;
        int rA = a;
        int rB = b;
        int rC;
        while(true) {
            rC = rA % rB;
            if(rC == 0) break;
            rA = rB;
            rB = rC;
        }
        return rB * sign;
    }

    public void shorten() {
        int ggt = ggt(zaehler, nenner);
        zaehler /= ggt;
        nenner /= ggt;
    }

    public boolean hasSameValueAs(Bruch b) {
        return zaehler * b.nenner == nenner * b.zaehler;
    }

    @Override
    public String toString() {
        return zaehler + "/" + nenner;
    }
}
