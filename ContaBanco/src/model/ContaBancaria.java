package model;

public class ContaBancaria {
    private final int numero;
    private final String agencia;
    private final String nomeCliente;
    private final double saldo;

    public ContaBancaria(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente +
                "!\nObrigado por criar uma conta em nosso banco!\nSua agência é " + agencia + ", sua conta é "+ numero +
                " e seu saldo de R$" + saldo + " já está disponível para saque.";
    }
}
