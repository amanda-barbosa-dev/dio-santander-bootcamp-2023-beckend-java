import application.IphoneImpl;
import utils.ConsoleColors;

public class Usuario {
    public static void main(String[] args) {
        IphoneImpl iphoneUsuario = new IphoneImpl();

        //Utilizando a funcionalidade de MusicReproducer;
        System.out.println(ConsoleColors.CYAN_UNDERLINED + "\nUtilizando a funcionalidade de MusicReproducer:"+ ConsoleColors.RESET);
        iphoneUsuario.selectMusic();
        iphoneUsuario.playMusic();
        iphoneUsuario.stopMusic();
        iphoneUsuario.skipMusic();
        iphoneUsuario.increaseVolume();
        iphoneUsuario.decreaseVolume();

        //Utilizando a funcionalidade de MobilePhone;
        System.out.println(ConsoleColors.CYAN_UNDERLINED + "\nUtilizando a funcionalidade de MobilePhone:" + ConsoleColors.RESET);
        iphoneUsuario.makeCall();
        iphoneUsuario.answerCall();
        iphoneUsuario.declineCall();
        if (iphoneUsuario.availableMobileNetwork())
            System.out.println("Mobile network available!");
        iphoneUsuario.leaveVoiceMail();
        iphoneUsuario.retrieveVoiceMail();

        //Utilizando a funcionalidade de InternetCommunicator;
        System.out.println(ConsoleColors.CYAN_UNDERLINED + "\nUtilizando a funcionalidade de InternetCommunicator:" + ConsoleColors.RESET);
        if (iphoneUsuario.availableInternetConnection())
            System.out.println("Internet connection available!");
        iphoneUsuario.accessWebsite();
        iphoneUsuario.reloadWebsite();
        iphoneUsuario.openNewTab();
        iphoneUsuario.closeTab();
    }
}