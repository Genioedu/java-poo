class Conta {
    private double saldo;

    void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    double getSaldo() { return saldo; }
}

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(100);
        System.out.println("Saldo: " + c.getSaldo());
    }
}
