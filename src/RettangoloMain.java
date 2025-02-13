public class RettangoloMain {
    public static void main(String[] args) {

        Rettangolo quad=new Rettangolo();
        quad.altezza=quad.getAltezza();
        quad.largezza=quad.getLargezza();

        int areat=quad.arearet(quad.altezza, quad.largezza);
        int perim=quad.perimetro(quad.altezza, quad.largezza);


        Rettangolo quad2=new Rettangolo();
        quad2.altezza=quad2.getAltezza();
        quad2.largezza=quad2.getLargezza();

        //int areat2=quad2.arearet(quad2.altezza, quad2.largezza);
        //int perim2=quad2.perimetro(quad2.altezza, quad2.largezza);




    }
}
