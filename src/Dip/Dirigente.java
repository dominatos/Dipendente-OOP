package Dip;

public class Dirigente  extends Dipendente {

    public Dirigente(String matricola, String nomecompl, double stipendioBase, Dipartimento dipartimento) {
        super(matricola, nomecompl, stipendioBase, dipartimento);

    }
    public double calculateSalaryDR()
    {
        return getStipendio()*1.5;
    }
    public String info()
    {
//        System.out.println("Matricola: " + getNomecompl());
//        System.out.println("Nome del componente: " + getNomecompl());
//        System.out.println("Stipendio Base: " + getStipendioBase());
//        System.out.println("Stipendio: " + this.calculateSalaryDR());
//        System.out.println("Dipartimento: " + getDipartimento());
//        System.out.println("************************************");
        return "Matricola: " + getMatricola()
                + "\nipo di contratto: Dirigente"
                + "\nNome del componente: " + getNomecompl()
                + "\nStipendio Base: " + getStipendioBase()
                + "\nDipartimento: " + getDipartimento().toString()
                + "\nStipendio: " + this.calculateSalaryDR()

                + "\n***********************************";
    }

}
