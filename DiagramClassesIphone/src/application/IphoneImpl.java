package application;

import funcionalities.InternetCommunicator;
import funcionalities.MobilePhone;
import funcionalities.MusicReproducer;

public class IphoneImpl implements MusicReproducer, MobilePhone, InternetCommunicator {

    //MusicReproducer methods implementation
    @Override
    public void selectMusic() {
        System.out.println("Song selected!");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing song!");
    }

    @Override
    public void stopMusic() {
        System.out.println("Song stopped!");
    }

    @Override
    public void skipMusic() {
        System.out.println("Skipped to the next song!");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Volume increased!");

    }

    @Override
    public void decreaseVolume() {
        System.out.println("Volume decreased!");
    }

    //MobilePhone methods Implementation
    @Override
    public void makeCall() {
        System.out.println("Making a call!");
    }

    @Override
    public void answerCall() {
        System.out.println("Answering a call!");
    }
    @Override
    public void declineCall() {
        System.out.println("Declining a call!");
    }

    @Override
    public boolean availableMobileNetwork() {
        return true;
    }

    @Override
    public void leaveVoiceMail() {
        System.out.println("Leaving Voice Mail!");
    }

    @Override
    public void retrieveVoiceMail() {
        System.out.println("Listening Voice Mail!");

    }
    //InternetCommunicator method implementations
    @Override
    public boolean availableInternetConnection() {
        return true;
    }

    @Override
    public void accessWebsite() {
        System.out.println("Accessing website!");
    }
    @Override
    public void reloadWebsite() {
        System.out.println("Realoading Website!");
    }

    @Override
    public void openNewTab() {
        System.out.println("New tab opened!");
    }

    @Override
    public void closeTab() {
        System.out.println("Tab closed!");
    }
}

