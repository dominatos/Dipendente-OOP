import java.util.Scanner;

public class Rettangolo {
    public static void main(String[] args) {

    }
public Scanner sc = new Scanner(System.in);
        public int altezza;
        public int largezza;
   public int getAltezza()
   {
       System.out.println("Insira o altezza do rettangolo");
       int altezza=Integer.parseInt(sc.nextLine());
       return altezza;
   }

    public int getLargezza() {
       System.out.println("Insira o Largezza do rettangolo");
       int largezza=Integer.parseInt(sc.nextLine());
        return largezza;
    }

    public int perimetro(int altezza, int largezza) {
        int perimetro = (altezza + largezza)*2;
        //System.out.println(perimetro
        return perimetro;
    }
    public int arearet(int altezza, int largezza) {
        int arearet= altezza*largezza;
        //System.out.println(arearet);
        return arearet;}

}
public int stampa(int perimetro,int arearet)
{
    System.out.println(perimetro);
    System.out.println(arearet);
}
