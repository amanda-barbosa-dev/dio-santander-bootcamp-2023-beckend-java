package funcionalities;

public interface InternetCommunicator {
    boolean availableInternetConnection();

    void accessWebsite();

    void reloadWebsite();

    void openNewTab();

    void closeTab();
}
