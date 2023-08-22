package PacoteVeiculo;

public class Moto extends Veiculos{
    private boolean carenagem;
    private int cilindradas;

    public Moto() {
    }

    public Moto(int ano, int preco, int numPassageiros, float velociMax, boolean carenagem, int cilindradas) {
        super(ano, preco, numPassageiros, velociMax);
        this.carenagem = carenagem;
        this.cilindradas = cilindradas;
    }

    public boolean isCarenagem() {
        return carenagem;
    }

    public void setCarenagem(boolean carenagem) {
        this.carenagem = carenagem;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void fazerCurva() {
    }

    public void acelerar() {
    }
}
