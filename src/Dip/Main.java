package Dip;



public class Main {
    public static Dipendente[] arrDipen = new Dipendente[3];
    public static void main(String[] args) {

        DipendentePartTime dpt4= new DipendentePartTime("dpt1", "CArmine ALlaiza",1200.00,Dipartimento.VENDITE);
        //dpt4.info();
        Dirigente DR5= new Dirigente("d5","Elon Musk",1200.00, Dipartimento.AMMINISTRAZIONE);
        //DR5.info();
        DipendenteFullTime DFT6 = new DipendenteFullTime("d6", "DIck Brown",1200.00,Dipartimento.AMMINISTRAZIONE);
        //DFT6.info();



        arrDipen[0]=dpt4;
        arrDipen[1]=DR5;
        arrDipen[2]=DFT6;
        stampaDipendenti();


    }
    public static void stampaDipendenti(){
        for(int i=0; i< arrDipen.length; i++) {
            Dipendente v = arrDipen[i];
            if(v instanceof DipendentePartTime) {
                DipendentePartTime a = (DipendentePartTime) v;

                System.out.println(a.info());
            } else if(v instanceof Dirigente) {
                Dirigente m = (Dirigente) v;
                System.out.println(m.info());
            } else if(v instanceof DipendenteFullTime) {
                DipendenteFullTime c = (DipendenteFullTime) v;
                System.out.println(c.info());
            }
        }
    }
}
