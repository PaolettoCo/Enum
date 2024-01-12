public class Triangolo extends Forma {

    public Triangolo(int base, int altezza, Tipo formaGeometrica) {
        super.base=base;
        super.altezza=altezza;
        super.formaGeometrica=formaGeometrica;
    }

    @Override
    public String toString() {
        return "Triangolo {" +
                " base = " + base + " /" +
                " altezza = " + altezza + " /" +
                " tipo = " + formaGeometrica +
                '}';
    }

    @Override
    public int calcoloArea() {
        int area;
        area = (super.base * super.altezza) / 2;
        return area;
    }
}