
import java.util.*;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Pessoa> agenda = new ArrayList<>();
        Pessoa p1 = new Pessoa("madson", 11);
        Pessoa p2 = new Pessoa("amora", 22);

        agenda.add(p1);
        agenda.add(p2);

        for (Pessoa pessoa : agenda) {
            System.out.println(pessoa.nome);
        }

        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarPessoa(scanner);
                    break;
                case 2:
                    excluirPessoa(scanner);
                    break;
                case 3:
                    alterarAniversario(scanner);
                    break;
                case 4:
                    consultarPorData(scanner);
                    break;
                case 5:
                    consultarPorMes(scanner);
                    break;
                case 6:
                    consultarPorInicial(scanner);
                    break;
                case 7:
                    mostrarOrdenadoPorNome();
                    break;
                case 8:
                    mostrarOrdenadoPorMes();
                    break;
                case 9:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 9);
    }

    private void cadastrarPessoa() {

    }

    private void excluirPessoa() {

    }

    private void alterarAniversario() {

    }

    private void consultarPorMes() {

    }

    private void consultarPorInicial() {

    }

    private void mostrarOrdenadoPorNome() {

    }

    private void mostrarOrdenadoPorMes() {

    }

    private static void exibirMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Cadastrar pessoa");
        System.out.println("2. Excluir pessoa");
        System.out.println("3. Alterar dia ou mês");
        System.out.println("4. Consultar por data");
        System.out.println("5. Consultar por mês");
        System.out.println("6. Consultar por inicial do nome");
        System.out.println("7. Mostrar agenda ordenada por nome");
        System.out.println("8. Mostrar agenda ordenada por mês");
        System.out.println("9. Sair");
    }

}
