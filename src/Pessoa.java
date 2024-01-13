import java.time.Year;

public class Pessoa {
    public String nome;
    public int idade;
    public int dia;
    public int mes;
    public int ano;

    public Pessoa(String n,  int ano, int mes, int dia) {
        super();
        this.nome = n;
        int currentYear = Year.now().getValue();
        this.idade = currentYear - ano;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;

    }

    public void setNome(String nome){
    
        this.nome=nome;
    }
  public void setDia(int dia){
    
        this.dia=dia;
    }
      public void setMes(int mes){
    
        this.mes=mes;
    }
   
}
