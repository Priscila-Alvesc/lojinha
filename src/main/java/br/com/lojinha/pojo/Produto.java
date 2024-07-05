package br.com.lojinha.pojo;
//uma classe pertence a um packge main, onde sera um pojo e deve ter um tipo:

// public ou private + <nome da Classe> {
        //public class Produto {
//<atributo public ou private> +<declaração Da tipo variavel> + <nome da Variavel>
        //public String nome;
        //public String marca;
//}

import br.com.lojinha.enums.Tamanho;

import java.util.List;

//classe - > <modificador> <Static ou não> Class <Nome da classe> {
// Atributo da classe -> <modificador> <Tipo> <nome>;
// }
public class Produto {
    private String nome;
    private String marca;
    protected double  valor;
    private Tamanho tamanho;
    private List<ItemIncluso> itensInclusos;


    //construtores -> <modificador> <nome da classe> (){}
       public Produto(String marcaInicial, Tamanho tamanhoInicial){
        //definir comandos que serão iniciados durante a instanciação
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }


    //metodo para capturar valor  que esta dentro do atributo double valor
    //modificador> <static ou não> <tipo do retorno> <nome do metodo>(<paramentro do metodo>){}
    public double getValor(){
        return this.valor;
    }

    //metodo para preencher o campo valor dentro do metodo de captura valor
    public void setValor(double novaValor){
        if (novaValor > 0){
        this.valor = novaValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");

        }
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public List<ItemIncluso> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> itensInclusos) {
        this.itensInclusos = itensInclusos;
    }
}


