package Dip;

import static Dip.Dipartimento.*;

public class Dipendente {
    private String matricola;
    private String nomecompl;
    private double stipendioBase;
    private double stipendio;
    private Dipartimento Dipartimento;



    public String getMatricola()  {
        return this.matricola;
    }
    //public double calculateSalary(double stipendioBase)
    public double calculasalario(double stipendioBase)
    {

        if (this.Dipartimento == PRODUZIONE)
        {
            this.stipendioBase = stipendioBase;
            return this.stipendioBase;
        }
        else if (this.Dipartimento == AMMINISTRAZIONE)
        {

            double aumento=1.20;
//            this.stipendioBase = stipendioBase*aumento;
            return this.stipendioBase*aumento;

        }
        else if (this.Dipartimento == VENDITE)
        {

            double aumento=1.40;
            //this.stipendioBase = stipendioBase*aumento;
            return this.stipendioBase*aumento;
        }
        else
        { this.stipendioBase = stipendioBase;
            return this.stipendioBase;
        }


    }
    public String getNomecompl()  {return this.nomecompl;}
    public double getStipendioBase()  {return this.stipendioBase;}
    public double getStipendio()  {return this.stipendio;}
    public String getDipartimento()  {return this.Dipartimento.toString();}

    public void setDipartimento(Dipartimento Dipartimento) {
        this.Dipartimento = Dipartimento;
    }

    public Dipendente(String matricola, String nomecompl, double stipendioBase, Dipartimento Dipartimento)
        {
        this.matricola = matricola;
        this.nomecompl = nomecompl;
        this.stipendioBase = stipendioBase;
        this.stipendio = calculasalario(this.stipendioBase);
        this.Dipartimento = Dipartimento;
        }



}
