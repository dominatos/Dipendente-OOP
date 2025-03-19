package Dip;

//import static Dip.dipartimento.*;

public class Dipendente {
    private String matricola;
    private String nomecompl;
    private double stipendioBase;
    private double stipendio;
    private Dipartimento dipartimento;



    public String getMatricola()  {
        return this.matricola;
    }
    //public double calculateSalary(double stipendioBase)
    public double calculasalario()
    {

        if (this.dipartimento.equals(Dipartimento.PRODUZIONE))
        {

            return this.stipendioBase;
        }
        else if (this.dipartimento.equals(Dipartimento.AMMINISTRAZIONE))
        {

            double aumento=1.20;
//            this.stipendioBase = stipendioBase*aumento;
            return this.stipendioBase*aumento;

        }
        else if (this.dipartimento.equals(Dipartimento.VENDITE))
        {

            double aumento=1.40;
            //this.stipendioBase = stipendioBase*aumento;
            return this.stipendioBase+(this.stipendioBase*0.40);
        }
        else
        { this.stipendioBase = stipendioBase;
            return this.stipendioBase;
        }


    }
    public String getNomecompl()  {return this.nomecompl;}
    public double getStipendioBase()  {return this.stipendioBase;}
    public double getStipendio()  {return this.stipendio;}
    public String getDipartimento()  {return this.dipartimento.toString();}

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public Dipendente(String matricola, String nomecompl, double stipendioBase, Dipartimento dipartimento)
        {
            this.dipartimento = dipartimento;
        this.matricola = matricola;
        this.nomecompl = nomecompl;
        this.stipendioBase = stipendioBase;
        this.stipendio = calculasalario();

        }



}
