package PacoteVeiculo;

public class Aviao extends Veiculos{
    private int numMotores;
    private float altitudeMax;

    public Aviao() {
    }

    public Aviao(int ano, int preco, int numPassageiros, float velociMax, int numMotores, float altitudeMax) {
        super(ano, preco, numPassageiros, velociMax);
        this.numMotores = numMotores;
        this.altitudeMax = altitudeMax;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    public float getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    public void decolar() {
    }

    public void subirAltitude() {
    }
}
