public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String n, int idade) {
        super();
        this.nome=n;
        this.idade=idade;
    }


    public void imprimir(){

        System.out.println("Nome:"+this.nome);
        System.out.println("Nome:"+this.idade);

         
    }
}
