package valorant;

// Classe Mapa
class Mapa {
    private String nome;
    private String descricao;

    public Mapa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void mostrarDetalhes() {
        System.out.println("Mapa: " + nome);
        System.out.println("Descrição: " + descricao);
    }
}

// Subclasses de Mapa
class Bind extends Mapa {
    public Bind(String nome, String descricao) {
        super(nome, descricao);
    }
}

class Haven extends Mapa {
    public Haven(String nome, String descricao) {
        super(nome, descricao);
    }
}

class Split extends Mapa {
    public Split(String nome, String descricao) {
        super(nome, descricao);
    }
}
