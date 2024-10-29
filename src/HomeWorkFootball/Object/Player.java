package HomeWorkFootball.Object;

import java.util.Random;

public class Player {
    private static final int MIN_STAMINA = 0;
    private static final int MAX_STAMINA = 100;
    private static final int MAX_PLAYER_IN_GAME = 6;

    private static int playerCount = 0;

    private int playerStamina;

    private String name;

    public Player(String name) {
        if (playerCount < MAX_PLAYER_IN_GAME) {
            this.name = name;
            Random random = new Random();
            playerCount++;
            playerStamina = random.nextInt(90, MAX_STAMINA);
        }

    }

    public static void getPlayerCount() {
        System.out.println("На поле " + playerCount + " игроков");
    }

    public int getPlayerStamina() {
        return playerStamina;

    }

    public void getInfo() {
        if (playerCount < MAX_PLAYER_IN_GAME) {
            System.out.println("Команды не полные. На поле " + (MAX_PLAYER_IN_GAME - playerCount) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }

    }

    public void run() {
        playerStamina--;

        System.out.println("Бежит игрок " + name + ". Выносливости  " + name
                + ": осталось " + playerStamina + " единиц");

        if (playerStamina == MIN_STAMINA) {
            playerCount--;
            System.out.println("Игрок " + name + " покидает поле.");
        }
    }

    public static boolean getMethods(Player[] players, boolean gameIsRunning) {
        for (Player player : players) {
            if (player.name == (null) || player.getPlayerStamina() <= MIN_STAMINA) {
                continue;
            } else {

                player.getInfo();
                player.run();
                System.out.println();

                if (playerCount <= 1) {
                    player.gameEnd();
                    gameIsRunning =false;
                    return gameIsRunning;
                }
            }
        }
        return gameIsRunning;
    }

    public void gameEnd() {
        System.out.println(" Игра окончена!");
    }
}
