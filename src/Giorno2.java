import java.util.Scanner;

public class Giorno2 {

    public static void main(String[] args) {


        System.out.println("Introduzca un valor para pari dispari");
        boolean strBool=PariDispari();
        System.out.println(strBool);


    }
    public static boolean PariDispari() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int len=a.length();
        if( len % 2 == 0){



            return true;


        } else {

            return false;
        }

    }




    }

