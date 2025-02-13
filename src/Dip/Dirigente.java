package Dip;

public class Dirigente  extends Dipendente {
    private double stipendioDR;
    public Dirigente(String matricola, String nomecompl, double stipendioBase,Dip.Dipartimento Dipartimento) {
        super(matricola, nomecompl, stipendioBase, Dipartimento);

    }
    public double calculateSalaryDR()
    {
        this.stipendioDR = getStipendioBase();
        this.stipendioDR=this.stipendioDR*1.5;

        return stipendioDR;
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
                + "\nStipendio: " + this.calculateSalaryDR()
                + "\nDipartimento: " + getDipartimento().toString()
                + "\n***********************************";
    }

}
