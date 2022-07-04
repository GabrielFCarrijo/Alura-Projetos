package Pilha_Entendendo_Exceptions;

public class Conexao implements AutoCloseable{

    public Conexao(){
        System.out.println("Abrindo COnexão");
        throw new IllegalStateException();
    }

    public void leDados(){
        System.out.println("Recebendo Dados");
        throw new IllegalStateException();
    }

    @Override
    public void close() {
        System.out.println("Fechando Conexão");
    }
}
