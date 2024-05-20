package Sobreescrita;

class TesteSobreescritaMetodos {
    public static void main(String[] args) {
        Somavel animal = new Animal();
        Somavel rex = new Cachorro();
        Somavel garfield = new Gato();
        Somavel polly = new Passaro();

        animal.fazerSom();    // Saída: Som genérico de animal
        rex.fazerSom();       // Saída: Au au!
        garfield.fazerSom();  // Saída: Miau!
        polly.fazerSom();     // Saída: Piu piu!
    }
}
