public class Mapa {

    private String teleportes;
    private String estatuaDoSet;
    private String regiaos;
    private String resina;
    private String pontosDeMarcacao;

    public Mapa(String teleportes, String estatuaDoSet, String regiaos, String resina, String pontosDeMarcacao) {
        this.teleportes = teleportes;
        this.estatuaDoSet = estatuaDoSet;
        this.regiaos = regiaos;
        this.resina = resina;
        this.pontosDeMarcacao = pontosDeMarcacao;
    }

    @Override
    public String toString() {
        return "Mapa{" +
                "teleportes='" + teleportes + '\'' +
                ", estatuaDoSet='" + estatuaDoSet + '\'' +
                ", regiaos='" + regiaos + '\'' +
                ", resina='" + resina + '\'' +
                ", pontosDeMarcacao='" + pontosDeMarcacao + '\'' +
                '}';
    }

    public String getTeleportes() {
        return teleportes;
    }

    public void setTeleportes(String teleportes) {
        this.teleportes = teleportes;
    }

    public String getEstatuaDoSet() {
        return estatuaDoSet;
    }

    public void setEstatuaDoSet(String estatuaDoSet) {
        this.estatuaDoSet = estatuaDoSet;
    }

    public String getRegiaos() {
        return regiaos;
    }

    public void setRegiaos(String regiaos) {
        this.regiaos = regiaos;
    }

    public String getResina() {
        return resina;
    }

    public void setResina(String resina) {
        this.resina = resina;
    }

    public String getPontosDeMarcacao() {
        return pontosDeMarcacao;
    }

    public void setPontosDeMarcacao(String pontosDeMarcacao) {
        this.pontosDeMarcacao = pontosDeMarcacao;
    }
}
