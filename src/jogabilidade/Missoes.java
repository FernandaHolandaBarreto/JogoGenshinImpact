package jogabilidade;

public class Missoes {

    private String tipoDeMissão;

    public Missoes(String tipoDeMissão) {
        this.tipoDeMissão = tipoDeMissão;
    }

    @Override
    public String toString() {
        return "Missões{" +
                "tipoDeMissão='" + tipoDeMissão + '\'' +
                '}';
    }

    public String getTipoDeMissão() {
        return tipoDeMissão;
    }

    public void setTipoDeMissão(String tipoDeMissão) {
        this.tipoDeMissão = tipoDeMissão;
    }
}
