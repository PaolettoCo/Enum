public class Rettangolo extends Forma {
    public Rettangolo(int base, int altezza, Tipo formaGeometrica) {
        super.base=base;
        super.altezza=altezza;
        super.formaGeometrica=formaGeometrica;
    }


    @Override
    public String toString() {
        return "Rettangolo {" +
                " base = " + base + " /" +
                " altezza = " + altezza + " /" +
                " tipo = " + formaGeometrica +
                '}';
    }

    @Override
    public int calcoloArea() {
        int area;
        area = super.base * super.altezza;
        return area;
    }
}

