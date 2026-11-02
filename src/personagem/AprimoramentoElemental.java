package personagem;

public class AprimoramentoElemental implements Habilidades {

    private String nomeDoAprimoramento;


    @Override
    public void Habilidades(String atacar) {
        IO.println("Clicando no Aprimoramento: " + atacar);
    }

    @Override
    public String toString() {
        return "Personagem.AprimoramentoElemental{" +
                "nomeDoAprimoramento='" + nomeDoAprimoramento + '\'' +
                '}';
    }

    public String getNomeDoAprimoramento() {
        return nomeDoAprimoramento;
    }

    public void setNomeDoAprimoramento(String nomeDoAprimoramento) {
        this.nomeDoAprimoramento = nomeDoAprimoramento;
    }
}
