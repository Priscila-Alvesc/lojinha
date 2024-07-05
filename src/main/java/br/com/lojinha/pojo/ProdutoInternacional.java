package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {

    private double taxaDeImportacao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    //Polimorfismo-> extende uma classe para classe que deseja herdar (extends), copia o metodo da classe pai para a classe herdeira, e na classe pai a declaração do
    // atributo deve ser tipo 'protector na classe pai
    public void setValor(double novaValor){
        if (novaValor > -100){
            this.valor = novaValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100");

        }
    }

    public double getTaxaDeImportacao() {
        return taxaDeImportacao;
    }

    public void setTaxaDeImportacao(double taxaDeImportacao) {
        this.taxaDeImportacao = taxaDeImportacao;
    }

    @Override
    public String getDadosFavoritos() {
        return this.getNome() +", " + this.getMarca() + " e " + this.getValor() ;
    }
}
