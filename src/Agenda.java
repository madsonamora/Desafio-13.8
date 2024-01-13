import java.util.ArrayList;

import java.util.Collections;

public class Agenda {

    ArrayList<Pessoa> aniversariantes;

    public Agenda() {
        aniversariantes = new ArrayList<Pessoa>();

    }

    public void cadastrarPessoa(String nome, int ano, int mes, int dia) {

      

        if (!(mes > 0 && mes < 13)) {
            System.out.println("mes digitado errado!" + " do " + nome);
        }

        if (!(dia > 0 && dia < 31)) {
            System.out.println("dia nao existe! " + "do usuario " + nome);
        }

        if (!(ano > 1900 && ano < 2024)) {
            System.out.println("Ano digitado incorretamente! " + "do usuario " + nome);
        } else {

            Pessoa novaPessoa = new Pessoa(nome, ano, mes, dia);

            aniversariantes.add(novaPessoa);

        }

    }

    public Pessoa remover(String nome) {

        for (Pessoa pessoa : aniversariantes) {

            if (pessoa.nome == nome) {
                return aniversariantes.remove(aniversariantes.indexOf(pessoa));
            }
        }
        return null;
    }

    public void consultarPorDia(int dia) {

        ArrayList<Pessoa> aniverDia = new ArrayList<>();

        for (Pessoa pessoa : aniversariantes) {
            if (pessoa.dia == dia) {
                aniverDia.add(pessoa);
            }

        }
        for (Pessoa pessoa : aniverDia) {
                System.out.println("Aniversariantes do dia: "+ dia + "- "+ pessoa.nome);
        }
        
    }

    public void alterarDataAniversario(String nome, int novoDia, int novoMes) {
        for (Pessoa pessoa : aniversariantes) {

            if (pessoa.nome == nome) {

                pessoa.setDia(novoDia);
                pessoa.setMes(novoMes);

            }

        }
    }

    public void consultarPorMes(int mes) {
        ArrayList<Pessoa> aniverDia = new ArrayList<>();

        for (Pessoa pessoa : aniversariantes) {
            if (pessoa.mes == mes) {
                aniverDia.add(pessoa);
            }

        }

        for (Pessoa aniversariantes : aniverDia) {
            System.out.println(" Pessoas que fazer aniversario no dia "+ mes +" :"+aniversariantes.nome);
        }
    }

    public void mostrarOrdenadoPorMes() {

        ArrayList<Integer> aniversMes = new ArrayList();

        for (Pessoa pessoa : aniversariantes) {
            aniversMes.add(pessoa.mes);
        }
        Collections.sort(aniversMes);
        for (int aniv : aniversMes) {
            System.out.println(aniv + ": mes: " + aniv);
        }

    }

    public void imprimir() {
        for (Pessoa pessoa : aniversariantes) {
            System.out.println(pessoa.nome + " mes:" + pessoa.mes + " dia:" + pessoa.dia+" idade: "+pessoa.idade);
        }
    }
}
