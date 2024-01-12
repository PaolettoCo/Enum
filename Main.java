public class Main {
    public static void main(String[] args) {
    Rettangolo ret1 = new Rettangolo(2,3,Tipo.Rettangolo);
    System.out.println(ret1);
    System.out.println("L'area del ret1 è = " + ret1.calcoloArea());
    System.out.println("--------------------------------------------");

    Triangolo tri1 = new Triangolo(4,5,Tipo.Triangolo);
        System.out.println("La base di tri1 è " + tri1.base);
        System.out.println("L'altezza di tri1 è " + tri1.altezza);
        System.out.println(tri1);
        System.out.println("L'area del tri1 è = " + tri1.calcoloArea());
        System.out.println("--------------------------------------------");
        tri1.setBase(6);
        tri1.setAltezza(7);
        System.out.println("La nuova base di tri1 è " + tri1.base);
        System.out.println("La nuova altezza di tri1 è " + tri1.altezza);
        System.out.println("La nuova area del tri1 è = " + tri1.calcoloArea());

    }
}