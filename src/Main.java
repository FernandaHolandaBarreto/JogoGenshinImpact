
public class Main {

    public static void main(String[] args) {

        // INÍCIO DA JORNADA
        IO.println("================================");
        IO.println("   AVENTURA DA VIAJANTE");
        IO.println("================================");
        IO.println("Iniciando sua jornada...\n");

        // Escolha do personagem
        IO.println("Escolha seu personagem:");
        IO.println("1 - Lumine");
        IO.println("2 - Aether");

        String escolhaPersonagem;

        do {
            escolhaPersonagem = IO.readln("Digite sua escolha: ");

            if (!escolhaPersonagem.equals("1")
                    && !escolhaPersonagem.equals("2")) {
                IO.println("Opção inválida! Escolha 1 ou 2.");
            }

        } while (!escolhaPersonagem.equals("1")
                && !escolhaPersonagem.equals("2"));

        String viajante;

        if (escolhaPersonagem.equals("1")) {
            viajante = "Lumine";
        } else {
            viajante = "Aether";
        }

        IO.println("\nVocê escolheu " + viajante + "!");

        // Escolha do nome do jogador
        String nomeJogador = IO.readln("Digite seu nome: ");

        IO.println("\nBem-vindo(a), " + nomeJogador + "!");
        IO.println("Você escolheu viajar com " + viajante + ".");
        IO.println("\nVocê está dentro do jogo!");
        IO.println("Que sua jornada comece!\n");





        SistemaDePity sistema = new SistemaDePity();

        // Personagens do banner padrão
        Personagem[] personagensPadrao = {
                new Personagem("Mona", "5 estrelas", "C0", "Hydro padrão"),
                new Personagem("Jean", "5 estrelas", "C0", "Anemo padrão"),
                new Personagem("Diluc", "5 estrelas", "C0", "Pyro padrão"),
                new Personagem("Qiqi", "5 estrelas", "C0", "Cryo padrão"),
                new Personagem("Dehya", "5 estrelas", "C0", "Pyro padrão"),
                new Personagem("Mizuki", "5 estrelas", "C0", "Anemo padrão"),
                new Personagem("Keqing", "5 estrelas", "C0", "Electro padrão")
        };

        // Personagens dos banners limitados
        Personagem skirk = new Personagem(
                "Skirk", "5 estrelas", "C0", "Cryo limitada"
        );

        Personagem escoffier = new Personagem(
                "Escoffier", "5 estrelas", "C0", "Cryo limitada"
        );

        String escolha;

        do {
            IO.println("\n===== BANNERS LIMITADOS =====");
            IO.println("1 - Banner limitado: Skirk");
            IO.println("2 - Banner limitado: Escoffier");
            IO.println("0 - Sair");

            escolha = IO.readln("Escolha o banner: ");

            Personagem limitado = null;

            if (escolha.equals("1")) {
                limitado = skirk;

            } else if (escolha.equals("2")) {
                limitado = escoffier;

            } else if (escolha.equals("0")) {
                IO.println("Saindo do jogo...");

            } else {
                IO.println("Opção inválida!");
            }

            if (limitado != null) {

                String giros;

                do {
                    IO.println("\n===== DESEJOS =====");
                    IO.println("Banner escolhido: " + limitado.getNome());
                    IO.println("1 - Fazer 1 giro");
                    IO.println("2 - Fazer 10 giros");
                    IO.println("0 - Voltar aos banners");

                    giros = IO.readln("Escolha: ");

                    if (giros.equals("1")) {

                        sistema.invocar(limitado, personagensPadrao);

                    } else if (giros.equals("2")) {

                        for (int i = 1; i <= 10; i++) {
                            IO.println("\n--- Giro " + i + " de 10 ---");

                            sistema.invocar(
                                    limitado,
                                    personagensPadrao
                            );
                        }

                    } else if (!giros.equals("0")) {
                        IO.println("Opção inválida!");
                    }

                } while (!giros.equals("0"));
            }

        } while (!escolha.equals("0"));

        IO.println("Jogo encerrado!");
    }
}
