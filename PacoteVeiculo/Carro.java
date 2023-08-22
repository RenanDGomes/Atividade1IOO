package PacoteVeiculo;

public class Carro extends Veiculos {
    private String tracao;
    private int numPortas;

    public Carro() {
    }


    public Carro(int ano, int preco, int numPassageiros, float velociMax, String tracao, int numPortas) {
        super(ano, preco, numPassageiros, velociMax);
        this.tracao = tracao;
        this.numPortas = numPortas;
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void acelerar() {
    }

    public void frear() {
    }
}
