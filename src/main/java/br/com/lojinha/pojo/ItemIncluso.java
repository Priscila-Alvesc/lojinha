package br.com.lojinha.pojo;

public class ItemIncluso {
    private String nome;
    private int qtd;

    //construtor para lista de itens adicionais
    public ItemIncluso( String nome, int qtd){
        this.nome = nome;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
