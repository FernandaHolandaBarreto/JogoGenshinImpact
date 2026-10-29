import java.util.Random;

public class SistemaDePity {

    private int pity = 0;
    private int pity4 = 0;
    private boolean garantido = false;

    private final Random random = new Random();

    private final String[] recompensas4 = {
            "Personagem 4 estrelas: Fischl",
            "Personagem 4 estrelas: Xingqiu",
            "Personagem 4 estrelas: Bennett",
            "Personagem 4 estrelas: Xiangling",
            "Arma 4 estrelas: Espada de Favonius",
            "Arma 4 estrelas: Arco de Favonius",
            "Arma 4 estrelas: Espada Sacrificial",
            "Arma 4 estrelas: Lança de Favonius"
    };

    private final String[] recompensas3 = {
            "Arma 3 estrelas: Espada do Viajante",
            "Arma 3 estrelas: Arco do Corvo",
            "Arma 3 estrelas: Histórias Extraordinárias",
            "Arma 3 estrelas: Grande Espada de Ferro Branco"
    };

    public void invocar(Personagem limitado, Personagem[] padrao) {

        // Cada chamada é UM desejo.
        pity++;
        pity4++;

        // Soft pity começa no 75.
        double chance5 = pity < 75
                ? 0.6
                : Math.min(100, 0.6 + (pity - 74) * 6);

        IO.println("\n===== RESULTADO DO GIRO =====");

        // ---------- 5 ESTRELAS ----------
        if (pity >= 90 || random.nextDouble() * 100 < chance5) {

            Personagem sorteado;
            int pityObtido = pity; // Guarda em qual pity veio.

            if (garantido || random.nextInt(100) < 50) {

                sorteado = limitado;
                garantido = false;

                IO.println("PARABÉNS! Você ganhou o personagem limitado!");

            } else {

                sorteado = padrao[random.nextInt(padrao.length)];
                garantido = true;

                IO.println("Você perdeu o 50/50!");
                IO.println("O próximo 5 estrelas será o limitado.");
            }

            IO.println("Você ganhou: " + sorteado.getNomeDoPersonagem());
            IO.println("Veio no pity " + pityObtido + ".");

            // Reinicia o pity após qualquer 5 estrelas.
            pity = 0;
            pity4 = 0;
        }

        // ---------- 4 ESTRELAS ----------
        else if (pity4 >= 10 || random.nextDouble() * 100 < 5.1) {

            String recompensa = recompensas4[
                    random.nextInt(recompensas4.length)];

            IO.println("4 estrelas " + recompensa);

            // Reinicia apenas o pity de 4 estrelas.
            pity4 = 0;
        }

        // ---------- 3 ESTRELAS ----------
        else {

            String recompensa = recompensas3[
                    random.nextInt(recompensas3.length)];

            IO.println("🔹 " + recompensa);
        }

        // Mostra o progresso atual (igual ao Genshin).
        IO.println("------------------------------");
        IO.println("Pity 5 estrelas: " + pity + "/90");
        IO.println("Pity 4 estrelas: " + pity4 + "/10");
        IO.println("Garantido: " + (garantido ? "SIM" : "NÃO"));
    }
}