package view;


import controller.ContaBancariaController;

import java.util.Scanner;


public class Terminal {

    public void iniciaTerminal() {
        System.out.println();
        ContaBancariaController controller = new ContaBancariaController();
        controller.solicitaDadosCliente();
        controller.criaContaBancaria();
    }
}
