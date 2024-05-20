package valorant;

// Classe Habilidade (superclasse abstrata)
abstract class Habilidade {
    public String nome;
    private String descricao;

    public Habilidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public abstract void usarHabilidade();
}

// Subclasses de Habilidade
class HabilidadeOfensiva extends Habilidade {
    public HabilidadeOfensiva(String nome, String descricao) {
        super(nome, descricao);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Usando habilidade ofensiva: " + super.nome);
    }
}

class HabilidadeDefensiva extends Habilidade {
    public HabilidadeDefensiva(String nome, String descricao) {
        super(nome, descricao);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Usando habilidade defensiva: " + super.nome);
    }
}

class HabilidadeSuporte extends Habilidade {
    public HabilidadeSuporte(String nome, String descricao) {
        super(nome, descricao);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Usando habilidade de suporte: " + super.nome);
    }
}

