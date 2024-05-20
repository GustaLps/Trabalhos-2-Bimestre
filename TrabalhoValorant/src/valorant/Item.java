package valorant;

// Classe Item
class Item {
    private String nome;
    private String tipo;

    public Item(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void usarItem() {
        System.out.println("Usando o item " + nome);
    }
}

// Subclasses de Item
class Arma extends Item {
    public Arma(String nome, String tipo) {
        super(nome, tipo);
    }
}

class Acessorio extends Item {
    public Acessorio(String nome, String tipo) {
        super(nome, tipo);
    }
}

class Utilitario extends Item {
    public Utilitario(String nome, String tipo) {
        super(nome, tipo);
    }
}

