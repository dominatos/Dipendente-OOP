package Dip;

public class DipendentePartTime  extends Dipendente {
    private double stipendioPT;
    private Dipartimento Dipartimento;
    public DipendentePartTime(String matricola, String nomecompl, double stipendioBase, Dipartimento Dipartimento) {
        super(matricola, nomecompl, stipendioBase, Dipartimento);

    }
    public double calculateSalaryPT()
    {
        this.stipendioPT = getStipendioBase();
        this.stipendioPT=this.stipendioPT*0.5;

        return this.stipendioPT;
    }
    public String info() {
//        System.out.println("Matricola: " + getNomecompl());
//        System.out.println("Nome del componente: " + getNomecompl());
//        System.out.println("Stipendio Base: " + getStipendioBase());
//        System.out.println("Stipendio: " + this.calculateSalaryPT());
//        System.out.println("Dipartimento: " + getDipartimento());
//        System.out.println("************************************");
        return "Matricola: " + getMatricola()
                + "\nipo di contratto:  Part Time"
                + "\nNome del componente: " + getNomecompl()
                + "\nStipendio Base: " + getStipendioBase()
                + "\nStipendio: " + this.calculateSalaryPT()
                + "\nDipartimento: " + getDipartimento().toString()
                + "\n***********************************";
    }
}
