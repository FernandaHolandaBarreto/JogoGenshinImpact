public class Missões {

    private String tipoDeMissão;

    public Missões(String tipoDeMissão) {
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
