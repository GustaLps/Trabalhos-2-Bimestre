package valorant;

// Classe Agente (superclasse abstrata)
abstract class Agente {
    private String nome;
    private int vida;
    private int movimento;

    public Agente(String nome, int vida, int movimento) {
        this.nome = nome;
        this.vida = vida;
        this.movimento = movimento;
    }

    public abstract void usarArma();
    public abstract void usarHabilidade();
}

// Subclasses de Agente
class Jett extends Agente {
    public Jett(String nome, int vida, int movimento) {
        super(nome, vida, movimento);
    }

    @Override
    public void usarArma() {
        System.out.println("Jett está usando sua arma.");
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Jett está usando sua habilidade única.");
    }
}

class Phoenix extends Agente {
    public Phoenix(String nome, int vida, int movimento) {
        super(nome, vida, movimento);
    }

    @Override
    public void usarArma() {
        System.out.println("Phoenix está usando sua arma.");
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Phoenix está usando sua habilidade única.");
    }
}
