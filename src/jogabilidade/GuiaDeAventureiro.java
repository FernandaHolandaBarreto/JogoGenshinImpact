package jogabilidade;

public class GuiaDeAventureiro {

    private String experiencia;
    private String comissoes;
    private String dominio;
    private String inimigos;

    public GuiaDeAventureiro(String experiencia, String comissoes, String dominio, String inimigos) {
        this.experiencia = experiencia;
        this.comissoes = comissoes;
        this.dominio = dominio;
        this.inimigos = inimigos;
    }

    @Override
    public String toString() {
        return "Jogabilidade.GuiaDeAventureiro{" +
                "experiencia='" + experiencia + '\'' +
                ", comissoes='" + comissoes + '\'' +
                ", dominio='" + dominio + '\'' +
                ", inimigos='" + inimigos + '\'' +
                '}';
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getComissoes() {
        return comissoes;
    }

    public void setComissoes(String comissoes) {
        this.comissoes = comissoes;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getInimigos() {
        return inimigos;
    }

    public void setInimigos(String inimigos) {
        this.inimigos = inimigos;
    }
}
