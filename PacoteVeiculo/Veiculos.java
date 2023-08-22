package PacoteVeiculo;

public class Veiculos {
    private int ano;
    private int preco;
    private int numPassageiros;
    private float velociMax;

    public Veiculos() {
    }

    public Veiculos(int ano, int preco, int numPassageiros, float velociMax) {
        this.ano = ano;
        this.preco = preco;
        this.numPassageiros = numPassageiros;
        this.velociMax = velociMax;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public float getVelociMax() {
        return velociMax;
    }

    public void setVelociMax(float velociMax) {
        this.velociMax = velociMax;
    }
}
