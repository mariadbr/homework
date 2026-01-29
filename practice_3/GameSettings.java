package practice_3;

public class GameSettings {
    static int maxPlayers = 11;
    final String gameName;
    int currentPlayers;

    GameSettings(String newGameName, int newCurrentPlayers) {
        this.gameName = newGameName;
        this.currentPlayers = newCurrentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        }
    }

    void printGameStatus() {
        System.out.println("Название игры: " + this.gameName + ", текущее количество игроков: " + this.currentPlayers + ", максимальное количество: " + GameSettings.maxPlayers);
    }
}
