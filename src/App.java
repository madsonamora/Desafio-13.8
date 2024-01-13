
import java.util.*;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda();
        
        agenda.cadastrarPessoa("madson amora ferreira",1991, 7, 6);
        agenda.cadastrarPessoa("jose carlos",1991,3,4);
        agenda.cadastrarPessoa("antonio pereira",1974, 3, 1);
        agenda.cadastrarPessoa("paulo henrique",1974, 3, 1);
   
        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                  
                case 1:// ----------Cadastrar pessoa --------------------
                    menuCadastro(agenda);
                    break;

                    
                case 2: {// ----------REMOVER pessoa --------------------
                    System.out.println("Qual o NOME da pessoa que deseja REMOVER?");
                    agenda.remover(scanner.nextLine());
                }

                    break;
                    
                case 3: {// --------------ALTERAR data de nascimento-------------
                    System.out.println("Digite o NOME da PESSOA que deseja ALTERAR a data de nascimento");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o novo dia");
                    int dia = scanner.nextInt();
                    System.out.println("Digite o novo mes");
                    int mes = scanner.nextInt();
                    agenda.alterarDataAniversario(nome, dia, mes);
                }

                    break;
                    
                case 4: {// -----------------PESQUISAR aniversariantes por DIA --------------------
                    System.out.println("Digite o dia a ser pesquisado? ");
                    int dia = scanner.nextInt();
                    agenda.consultarPorDia(dia);
                }

                    break;
                   
                case 5: { // -----------------PESQUISAR aniversariantes por MES --------------------
                    System.out.println("Digite o mes");
                    int mes = scanner.nextInt();
                    agenda.consultarPorMes(mes);

                }
                    break;
                case 6:// AINDA NAO FEITO
                       // consultarPorInicial(scanner);
                       // break;
                case 7:
                    // mostrarOrdenadoPorNome();
                    break;
                case 8:
                    // mostrarOrdenadoPorMes();
                    break;
                case 9:
                    agenda.imprimir();
                    break;

                case 10:{
                    System.out.println("Saindo do programa. Até mais!");

                }
                    
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 10);

    }

    private static void menuCadastro(Agenda agenda) {

        System.out.println("digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("digite  a idade: ");
        int idade = scanner.nextInt();
        System.out.println("digite o ano de nascimento ");
        int ano = scanner.nextInt();
        System.out.println("digite o mes ");
        int mes = scanner.nextInt();
        System.out.println("digite o dia ");
        int dia = scanner.nextInt();
        agenda.cadastrarPessoa(nome,  ano, mes, dia);
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
        System.out.println("9. Imprimir");
        System.out.println("10. Sair");
    }

}
