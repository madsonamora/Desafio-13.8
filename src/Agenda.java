import java.util.ArrayList;

public class Agenda {

    ArrayList<Pessoa> aniversariantes;

    public Agenda() {
        aniversariantes = new ArrayList<Pessoa>();

    }

    public void cadastrarPessoa(String nome, int idade, int ano, int mes, int dia) {

        if (!(idade < 120 && idade > 0)) {
            System.out.println("idade errada!" + " do " + nome);
        }

        if (!(mes > 0 && mes < 13)) {
            System.out.println("mes digitado errado!" + " do " + nome);
        }

        if (!(dia > 0 && dia < 31)) {
            System.out.println("dia nao existe! " + "do usuario " + nome);
        }

        if (!(ano > 1900 && ano < 2024)) {
            System.out.println("Ano digitado incorretamente! " + "do usuario " + nome);
        } else {

            Pessoa novaPessoa = new Pessoa(nome, idade, ano, mes, dia);

            aniversariantes.add(novaPessoa);

        }

    }

    // public void excluirPessoa(String nome) {
    // for (int i = 0; i < aniversariantes.size(); i++) {
    // if(aniversariantes.pessoa == nome){
    // }
    // }
    // }

    public Pessoa remover(String nome) {
       

        for (Pessoa pessoa : aniversariantes) {

            if (pessoa.nome == nome) {

                 int index= aniversariantes.indexOf(pessoa);
               
                return aniversariantes.remove(index);

            }

        }
        return null;
       
    }

    public static void excluirPessoa(String nome) {
        // agenda.excluirPessoa(nome);
    }

    public void alterarAniversario() {

    }

    public void consultarPorMes() {

    }

    public void consultarPorInicial() {

    }

    public void mostrarOrdenadoPorNome() {

    }

    public void mostrarOrdenadoPorMes() {

    }

    public void imprimir() {
        for (Pessoa pessoa : aniversariantes) {
            System.out.println(pessoa.nome + " - " + pessoa.mes);
        }
    }
}
