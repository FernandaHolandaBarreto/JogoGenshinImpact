package personagem;

import java.util.ArrayList;

public class ColecaoPersonagens {


        private ArrayList<Personagem> personagens;

        public ColecaoPersonagens() {
            personagens = new ArrayList<>();
        }

        public void adicionarPersonagem(Personagem personagem) {
            personagens.add(personagem);

            IO.println(" " + personagem.getNomeDoPersonagem()
                    + " foi adicionado à sua coleção!");
        }

        public void mostrarColecao() {

            IO.println("\n===== SEUS PERSONAGENS =====");

            if (personagens.isEmpty()) {
                IO.println("Você ainda não possui personagens.");
            } else {
                for (Personagem personagem : personagens) {
                    IO.println(personagem.getNomeDoPersonagem());
                }
            }
        }
    }


