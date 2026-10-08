void main() {

    IO.println("======Primeira Personagem======");

    Personagem personagem1 = new Personagem("Skirk","5 estrelas"
            ,"Sem Constelações","Skirk é uma espadachim e guerreira misteriosa do jogo Genshin Impact, conhecida por ser a mestra de Tartaglia (Childe) e discípula de Surtalogi (o Cavaleiro Abominável, um dos Cinco Pecadores de Khaenri'ah)");

    IO.println(personagem1.getNomeDoPersonagem());
    IO.println(personagem1.getRaridade());
    IO.println(personagem1.getContelacoes());
    IO.println(personagem1.getSobre());


    IO.println("======Segunda Personagem======");

    Personagem personagem2 = new Personagem("Columbina","5 estrelas","¨C6",
            "Columbina Hyposelenia (também conhecida como Damselette ou A Dama da Lua) é uma personagem jogável de 5 estrelas, do elemento Hydro e que usa Catalisador em Genshin Impact");
    IO.println(personagem2.getNomeDoPersonagem());
    IO.println(personagem2.getRaridade());
    IO.println(personagem2.getContelacoes());
    IO.println(personagem2.getSobre());

    }
