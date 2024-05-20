package valorant;

// Classe Inimigo (superclasse abstrata)
abstract class Inimigo {
    private String nome;
    private int vida;

    public Inimigo(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void atacar();
    public abstract void mover();
}

// Subclasses de Inimigo
class AgenteInimigo extends Inimigo {
    public AgenteInimigo(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar() {
        System.out.println("Agente inimigo está atacando.");
    }

    @Override
    public void mover() {
        System.out.println("Agente inimigo está se movendo.");
    }
}

