package Exercicio_1_2;

import java.io.*;

//1.2 Três tipos de método Construtor;
public class Cliente implements Serializable {
    private String cpf;
    private String nome;
    private String fone;

    public Cliente(String cpf, String nome, String fone) {
        this.cpf = cpf;
        this.nome = nome;
        this.fone = fone;
    }

    public Cliente() {
    }

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    //1.1  Métodos get e set
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    //1.3 Método toString para retornar os dados de todos os atributos.
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", fone='" + fone + '\'' +
                '}';
    }

//1.4 - Serializable

    /**
     * Tem como objetivo gravar um objeto na memória
     * @FileOutputStream --> é responsável por criar o arquivo fisicamente no disco. Onde esta presente o nome indica o caminho (pasta a ser gravado)
     * @ObjectOutputStream -> Escreve os objetos no FileOutputStream
     * @return
     */
    public String gravar() {
        String mensagem = "Objeto gravado com sucesso!";
        try {
            FileOutputStream fos = new FileOutputStream(nome + ".ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this); // conteudo do objeto atual
            oos.flush(); // limpar
            oos.close();//fechar
        } catch (IOException erro) {
            mensagem = "Falha" + erro;
        }
        return mensagem;
    }

    /**
     * Tem como objetivo ler um arquivo e transformar em um objeto
     * FileInputStream ->Responsável por carregar o arquivo
     *  ObjectInputStream -> Responsável por ler o objeto referente ao arquivo
     * @return
     */
    public Cliente ler() {
        Cliente c1 = null;
        try {
            FileInputStream fin = new FileInputStream(nome + ".txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            c1 = (Cliente)ois.readObject(); // Instânciando o objeto
            ois.close();
        }
        catch (Exception erro) {}
        return c1;
    }
}
