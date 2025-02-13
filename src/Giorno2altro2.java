import java.util.Scanner;

public class Giorno2altro2 {
    public static void main(String[] args) {

        String sudd=inserisciStringa();

        suddividiStringa(sudd);
        String[] out=popolaArray();

        popolaArray2(out);
        System.out.println("");
        rovescia();

    }
    public static String inserisciStringa(){
        Scanner sc = new Scanner(System.in);

        String text;
        int len;
        do{System.out.print("Inserisci una stringa di almeno 5: ");
            text=sc.nextLine();

            len=text.length();}
        while(len<5);
        return text;
    }
    public static void suddividiStringa(String stringa){
         int lens=stringa.length();
         for(int i=0; i<lens; i++){
int x=i+1;

if(i==lens-1)
{System.out.print(stringa.substring(i,x)+"\n");
    }
                 else
                 {System.out.print(stringa.substring(i,x)+",");}

         }
    }
    public static String[] popolaArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci la quantita di elementi di nuovo array: ");
        int lenar=Integer.parseInt(sc.nextLine());
        String[] arr=new String[lenar];
        for(int i=0; i<lenar; i++){
            System.out.print("Elemento ("+i+") ");
            String textarr=inserisciStringa();

            arr[i]=textarr;


        }
        return arr;
    }
    public static void popolaArray2(String[] stringa){
        for(int i=0; i<stringa.length; i++){
            //System.out.print(stringa[i]);
            suddividiStringa(stringa[i]);
        }

    }
    public static void rovescia(){
        System.out.println("Inserici un numero da fare vedere in conto alla rovescia");
        Scanner sc = new Scanner(System.in);
        int y=Integer.parseInt(sc.nextLine());

        for(int i=y; i>=0; i--){
            System.out.println(i);
        }

    }

}
