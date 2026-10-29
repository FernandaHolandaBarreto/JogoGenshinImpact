import java.util.Random;

public class BannerPadrão {

    



        private int pity = 0;
        private final int limitePity = 90;

        private Random random = new Random();
        private Personagem[] personagens;

        public void SistemaBannerPadrao(Personagem[] personagens) {
            this.personagens = personagens;
        }

        public void invocar() {

            pity++;

            double chance;

            if (pity < 74) {
                chance = 0.6;
            } else {
                chance = Math.min(100, 0.6 + (pity - 73) * 6);
            }

            if (pity >= limitePity) {
                chance = 100;
            }

            if (random.nextDouble() * 100 < chance) {

                Personagem sorteado = personagens[
                        random.nextInt(personagens.length)
                        ];

                IO.println("Você conseguiu um 5 estrelas!");
                IO.println("Personagem: "
                        + sorteado.getNomeDoPersonagem());

                pity = 0;

            } else {
                IO.println("Nenhum 5 estrelas desta vez.");
            }

            IO.println("Pity do banner padrão: "
                    + pity + "/" + limitePity);
        }
    }


