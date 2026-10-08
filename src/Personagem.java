public class Personagem {

    private String nomeDoPersonagem;
    private String raridade;
    private String contelacoes;
    private String sobre;

    //Composição(relação Forte)
    private AprimoramentoElemental aprimoramentoElemental;
    private Ultimate ultimate;

    public Personagem(String nomeDoPersonagem, String raridade, String contelacoes, String sobre) {
        this.nomeDoPersonagem = nomeDoPersonagem;
        this.raridade = raridade;
        this.contelacoes = contelacoes;
        this.sobre = sobre;
        aprimoramentoElemental = new AprimoramentoElemental();
        ultimate = new Ultimate();
    }


    public String getNomeDoPersonagem() {
        return nomeDoPersonagem;
    }

    public void setNomeDoPersonagem(String nomeDoPersonagem) {
        this.nomeDoPersonagem = nomeDoPersonagem;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public String getContelacoes() {
        return contelacoes;
    }

    public void setContelacoes(String contelacoes) {
        this.contelacoes = contelacoes;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
}

