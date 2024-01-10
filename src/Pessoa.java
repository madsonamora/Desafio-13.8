import java.time.Year;

public class Pessoa {
    public String nome;
    public int idade;
    public int dia;
    public int mes;
    public int ano;

    public Pessoa(String n, int idade, int ano, int mes, int dia) {
        super();
        this.nome = n;
        int currentYear = Year.now().getValue();
        this.idade = currentYear - ano;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;

    }



   
}
