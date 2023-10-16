package controller;

import model.ContaBancaria;
import java.util.Scanner;

public class ContaBancariaController {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void solicitaDadosCliente() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scan.next();
        System.out.println("Por favor, digite o número da Conta!");
        numero = scan.nextInt();
        scan.nextLine();
        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite o Saldo!");
        saldo = scan.nextDouble();
    }

            public void criaContaBancaria () {
            ContaBancaria contaBancaria = new ContaBancaria(numero, agencia, nomeCliente, saldo);
            System.out.println(contaBancaria.toString());
        }








}
