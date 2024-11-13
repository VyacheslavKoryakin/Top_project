package HomeWorkFootball.Object;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static final int MAX_PLAYER_IN_GAME = 6;
    static Player player;
    private static int playerCount = 0;
    private static String[] name = {"Rooney", "Ronaldo", "Messi", "Zidane", "Nedved", "Torres", "Carlos", "Arshavin"};
    private static int nameIndex = 0;


    public static List<Player> players = new ArrayList<>();


    public static String[] getName() {
        return name;
    }

    public void addPlayer() {
        if (players.size() < MAX_PLAYER_IN_GAME) {

            if (players.size() < name.length && nameIndex < name.length) {
                player = new Player(name[nameIndex]);
                players.add(player);


                System.out.println("введен игрок " + name[nameIndex] + ": " + players.get(playerCount).toString());
                playerCount++;
                System.out.println("На поле " + playerCount + " игроков");
                nameIndex++;
            }

        } else {
            System.out.println("Мест на поле больше нет");
        }

    }

    public static int getNameIndex() {
        return nameIndex;
    }

    @Override
    public String toString() {
        return "Game{" +
                "players=" + players +
                '}';
    }

    public static void removePlayer(Player player) {

        playerCount--;
        players.remove(player);
    }

    public void getInfo() {
        if (playerCount < MAX_PLAYER_IN_GAME) {
            System.out.println("Команды не полные. На поле " + (MAX_PLAYER_IN_GAME - playerCount) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
    public static boolean isFieldFull() {
        return playerCount < MAX_PLAYER_IN_GAME;
    }
    public boolean checkPlayerName(Player player){
        return players.contains(player);

    }
    public void gameEnd() {
        System.out.println(" Игра окончена!");
    }
}



