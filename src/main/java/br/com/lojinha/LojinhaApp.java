package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;


import java.util.ArrayList;
import java.util.List;


public class LojinhaApp {

    public static void main(String[] args) {
        //Deve-se criar uma variavel do tipo da minha POJO onde:
        // <classe Pojo> < nome da minha variável do main> = new <classe Pojo> ();
                //Produto meuProduto = new Produto();
        //<variavel do main>.atributo da classe = < valor do campo>;
                //meuProduto.nome = "Play station 4";

        Produto meuProduto = new Produto("Apple" , Tamanho.PEQUENO);

        meuProduto.setNome("Priscila");
        meuProduto.setValor(30);


        List<ItemIncluso> itensInclusos = new ArrayList<>();

            ItemIncluso primeiroItemAdiconal = new ItemIncluso( "controle" , 2);
            itensInclusos.add(primeiroItemAdiconal);

            ItemIncluso segundoItemAdiconal = new ItemIncluso("jogo" , 3);
            itensInclusos.add(segundoItemAdiconal);

            ItemIncluso terceiroItemAdiconal = new ItemIncluso("cabo", 1);
            itensInclusos.add(terceiroItemAdiconal);

        ItemIncluso quartoItemAdiconal = new ItemIncluso("Lapis", 1);
        itensInclusos.add(quartoItemAdiconal);

            meuProduto.setItensInclusos(itensInclusos);


        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());
        System.out.println("Apresentar itens da lista de produtos:");
        for(ItemIncluso itemAtual : meuProduto.getItensInclusos()){
            System.out.println("Produto: " + itemAtual.getNome());
            System.out.println("Quantidade: " +itemAtual.getQtd());
        }
        System.out.println("Acabaram os itens da lista de produtos;");

        //Trabalhando com classe produto nascional + herança da classe produto
        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony Internacional", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.554);

        System.out.println("Dados Produto Nascional e impostos: ");
        System.out.println(meuProdutoNacional.getMarca());
        System.out.println(meuProdutoNacional.getTamanho());
        System.out.println(meuProdutoNacional.getImpostoNacional());

        //Trabalhando com classe produto internacional + herança da classe produto
        ProdutoInternacional minhaTaxaImportacao = new ProdutoInternacional("Apple Brasileira", Tamanho.GRANDE);
        minhaTaxaImportacao.setTaxaDeImportacao(2.5);

        //declarando um produto com herança e polimorfismo
        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("JBL", Tamanho.PEQUENO);
        meuProdutoInternacional.setValor(-99.99);


        System.out.println("Dados da taxa de importação para produtos internacionais:");
        System.out.println(minhaTaxaImportacao.getNome());
        System.out.println(minhaTaxaImportacao.getTamanho());
       //System.out.println(minhaTaxaImportacao.n());
        System.out.println(minhaTaxaImportacao.getTaxaDeImportacao());
        System.out.println(meuProdutoInternacional.getMarca());
        System.out.println(meuProdutoInternacional.getValor());


    }

}
