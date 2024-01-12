enum Tipo {
    Triangolo,
    Rettangolo;
}
public class Forma {
    protected int base;
    protected int altezza;
    protected Tipo formaGeometrica;

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int calcoloArea(){
        int area = 0;
        return area;
    };

}

