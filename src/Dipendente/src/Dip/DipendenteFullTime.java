package Dip;

public class DipendenteFullTime extends Dipendente {
    public double stipendioFT;
    public DipendenteFullTime(String matricola, String nomecompl, double stipendioBase, Dipartimento dipartimento) {
        super(matricola, nomecompl, stipendioBase, dipartimento);
    }
    public double calcolaFT()
    {
        return getStipendio()*1;

    }
    public String info()
    {
//        System.out.println("Matricola: " + getNomecompl());
//        System.out.println("Nome del componente: " + getNomecompl());
//        System.out.println("Stipendio Base: " + getStipendioBase());
//        System.out.println("Stipendio: " + this.calcolaFT());
//        System.out.println("Dipartimento: " + getDipartimento());
//        System.out.println("************************************");
        return "Matricola: " + getMatricola()
                + "\nipo di contratto:  Full Time"
                + "\nNome del componente: " + getNomecompl()
                + "\nStipendio Base: " + getStipendioBase()
                + "\nDipartimento: " + getDipartimento().toString()
                + "\nStipendio: " + this.calcolaFT()

                + "\n***********************************";
    }



}
