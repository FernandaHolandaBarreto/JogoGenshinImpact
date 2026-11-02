package jogador;

public class Jogador {



        private String nome;
        private String viajante;
        private int gemas;
        private int desejos;

        public Jogador(String nome, String viajante) {
            this.nome = nome;
            this.viajante = viajante;
            this.gemas = 0;
            this.desejos = 0;
        }

        public String getNome() {
            return nome;
        }

        public String getViajante() {
            return viajante;
        }

        public int getGemas() {
            return gemas;
        }

        public int getDesejos() {
            return desejos;
        }

        public void adicionarGemas(int quantidade) {
            if (quantidade > 0) {
                gemas += quantidade;
            }
        }

        public void adicionarDesejos(int quantidade) {
            if (quantidade > 0) {
                desejos += quantidade;
            }
        }
    }


