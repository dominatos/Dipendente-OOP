import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> asdasdasdasdasdasd
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner pn= new Scanner(System.in);

        System.out.println("Scrivi numero uno:");
        int n1=Integer.parseInt(pn.nextLine());


        System.out.println("Scrivi numero due:");
        int n2=Integer.parseInt(pn.nextLine());

        int ressom=somma(n1,n2);
        int resmult=mult(n1,n2);
        int resdiv=divis(n1,n2);
        int ressotr=sotr(n1,n2);

        printres(ressom,resmult,resdiv,ressotr,n1,n2);
    }




        public static int somma(int x, int y) {
        int result= x + y;
        return result;
        }
        public static int sotr(int x, int y) {
        int result= x - y;
        return result;
        }
        public static int mult(int x, int y) {
        int result= x * y;
        return result;
        }
        public static int divis(int x, int y) {
        int result= x / y;
        return result;
        }
        public static void printres(int Somma, int Multiplica, int Division, int Sottrazione, int n1, int n2) {
        System.out.println("Somma "+n1+" + "+n2+" = "+Somma+"" +
                "\nSottrazione "+n1+" - "+n2+" = "+Sottrazione+"" +
                "\nMultiplica "+n1+" x "+n2+" = "+Multiplica+"" +
                "\nDivisione "+n1+" / "+n2+" = "+Division);

        }

}