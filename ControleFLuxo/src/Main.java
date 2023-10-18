import controller.ContadorController;
import exceptions.ParametroInvalidoException;

import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        ContadorController controller = new ContadorController();

        try {
            controller.contar(controller.getParametrosContador());
        } catch (InputMismatchException e) {
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
            e.printStackTrace();


        }
        catch (ParametroInvalidoException e) {
            e.printStackTrace();
        }
    }
}