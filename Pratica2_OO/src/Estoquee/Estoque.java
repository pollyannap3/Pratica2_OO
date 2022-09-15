package Estoquee;

public class Estoque {
	
	private String nome; 
    private int qtdAtual;
    private int qtaMinima;

    public Estoque(){

    }

    public Estoque(String nome, int qtdAtual, int qtaMinima) {
        super();
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtaMinima = qtaMinima;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtaMinima(int qtaMinima) {
        this.qtaMinima = qtaMinima;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public int getQtaMinima() {
        return qtaMinima;
    } 


    
    public void darBaixa(int qtde){
        if(qtde<=this.qtdAtual)
            this.qtdAtual -= qtde;
            else
                System.out.println("Impossivel prosseguir com operação, estoque negativo");
    }

    public boolean precisaRepor(){
        if (this.qtdAtual<=this.qtaMinima)
            return true;
                else   
                    return false;
    }

    public String mostra(){
        return "Item: "+getNome()+" | Quantidade em estoque: "+getQtdAtual()+" | Estoque minimo: "+getQtaMinima();
    }

    
    
}
