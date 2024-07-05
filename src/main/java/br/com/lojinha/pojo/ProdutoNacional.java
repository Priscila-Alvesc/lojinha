package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

//Herança - utiliza extends <Classe que desejo herdar>
//quando herdo de uma classe que possui um construtor nela, obrigatóriamente preciso ter este construtor na classe que estou criando;

// Interface -> na declaração da classe, usa o implements <Nome da classe do tipo interface>
//deve-se implementar o metodo da classe interface retornando os elementos desejados; utiliza-se interface para padronizar o código

public class ProdutoNacional extends Produto implements Favorito {
    private double impostoNacional;

    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getImpostoNacional() {
        return this.impostoNacional;
    }

    public void setImpostoNacional(double impostoNacional) {
        this.impostoNacional = impostoNacional;
    }

    @Override
    public String getDadosFavoritos() {
        //
        return this.getNome() +", " + this.getMarca() +", " + this.getValor() ;
    }
}
