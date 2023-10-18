package controller;

import exceptions.ParametroInvalidoException;
import model.Contador;
import utils.ConsoleColors;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ContadorController {

    List<Integer> parametros = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);



    public Contador getParametrosContador() throws InputMismatchException{
        System.out.println(ConsoleColors.CYAN_UNDERLINED + "# Bem-vindos ao Contador de Iterações da DIO #");

        int quantidadeParametros = 1;
        do {
            System.out.printf(ConsoleColors.PURPLE + "Digite o %dº parametro:\n",quantidadeParametros);
            parametros.add(scanner.nextInt());
            quantidadeParametros++;
        }while (quantidadeParametros <=2);
        return new Contador(parametros);
    }


    public void contar (Contador contador) throws ParametroInvalidoException {
        if (contador.getParametro(0) > contador.getParametro(1)){
            throw new ParametroInvalidoException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = contador.getParametro(1) - contador.getParametro(0);
            for (int i = 0; i < contagem; i++){
                System.out.printf(ConsoleColors.BLUE + "Imprimindo o número %d\n", i+1);
            }
        }
    }

}

