package valorant;
public class Main {
    public static void main(String[] args) {
        // Criando agentes
        Agente jett = new Jett("Jett", 100, 10);
        Agente phoenix = new Phoenix("Phoenix", 120, 8);

        // Usando habilidades dos agentes
        jett.usarArma();
        jett.usarHabilidade();

        phoenix.usarArma();
        phoenix.usarHabilidade();

        // Criando itens
        Item rifle = new Arma("Rifle", "Arma de fogo");
        Item escudo = new Acessorio("Escudo", "Proteção");

        // Usando itens
        rifle.usarItem();
        escudo.usarItem();

        // Criando habilidades
        HabilidadeOfensiva bolaFogo = new HabilidadeOfensiva("Bola de Fogo", "Lança uma bola de fogo.");
        HabilidadeDefensiva escudoProtetor = new HabilidadeDefensiva("Escudo Protetor", "Cria um escudo para proteção.");

        // Usando habilidades
        bolaFogo.usarHabilidade();
        escudoProtetor.usarHabilidade();

        // Criando mapas
        Mapa bind = new Bind("Bind", "Mapa com áreas apertadas e pontos de controle.");
        Mapa haven = new Haven("Haven", "Mapa com múltiplos pontos de controle.");

        // Mostrando detalhes dos mapas
        bind.mostrarDetalhes();
        haven.mostrarDetalhes();
    }
}
