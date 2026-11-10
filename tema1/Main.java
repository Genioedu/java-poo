class Pessoa {
    String nome;
    int idade;

    void mostrar() {
        System.out.println("Pessoa: " + nome + ", Idade: " + idade);
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Genildo";
        p1.idade = 53;
        p1.mostrar();

        Pessoa p2 = new Pessoa();
        p2.nome = "Maria";
        p2.idade = 30;
        p2.mostrar();
    }
}