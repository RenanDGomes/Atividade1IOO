package PacoteVeiculo;

public class Barco extends Veiculos{
    private boolean motorizado;
    private boolean ancora;

    public Barco() {
    }

    public Barco(int ano, int preco, int numPassageiros, float velociMax, boolean motorizado, boolean ancora) {
        super(ano, preco, numPassageiros, velociMax);
        this.motorizado = motorizado;
        this.ancora = ancora;
    }

    public boolean isMotorizado() {
        return motorizado;
    }

    public void setMotorizado(boolean motorizado) {
        motorizado = motorizado;
    }

    public boolean isAncora() {
        return ancora;
    }

    public void setAncora(boolean ancora) {
        this.ancora = ancora;
    }
}
