public abstract class Eventos {

    private String nomeDoEvento;
    private String testeDePersonagem;
    private String endGame;
    private String tipoDeBossNovo;
    private String teleportarPraRegiaoNova;

    public Eventos(String nomeDoEvento, String testeDePersonagem, String endGame, String tipoDeBossNovo, String teleportarPraRegiaoNova) {
        this.nomeDoEvento = nomeDoEvento;
        this.testeDePersonagem = testeDePersonagem;
        this.endGame = endGame;
        this.tipoDeBossNovo = tipoDeBossNovo;
        this.teleportarPraRegiaoNova = teleportarPraRegiaoNova;
    }

    @Override
    public String toString() {
        return "Eventos{" +
                "nomeDoEvento='" + nomeDoEvento + '\'' +
                ", testeDePersonagem='" + testeDePersonagem + '\'' +
                ", endGame='" + endGame + '\'' +
                ", tipoDeBossNovo='" + tipoDeBossNovo + '\'' +
                ", teleportarPraRegiaoNova='" + teleportarPraRegiaoNova + '\'' +
                '}';
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public void setNomeDoEvento(String nomeDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
    }

    public String getTesteDePersonagem() {
        return testeDePersonagem;
    }

    public void setTesteDePersonagem(String testeDePersonagem) {
        this.testeDePersonagem = testeDePersonagem;
    }

    public String getEndGame() {
        return endGame;
    }

    public void setEndGame(String endGame) {
        this.endGame = endGame;
    }

    public String getTipoDeBossNovo() {
        return tipoDeBossNovo;
    }

    public void setTipoDeBossNovo(String tipoDeBossNovo) {
        this.tipoDeBossNovo = tipoDeBossNovo;
    }

    public String getTeleportarPraRegiaoNova() {
        return teleportarPraRegiaoNova;
    }

    public void setTeleportarPraRegiaoNova(String teleportarPraRegiaoNova) {
        this.teleportarPraRegiaoNova = teleportarPraRegiaoNova;
    }
}
