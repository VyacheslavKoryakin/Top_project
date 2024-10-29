package HomeWorkFootball;

import HomeWorkFootball.Object.Player;

public class Main {
    public static void main(String[] args) {

        boolean gameIsRunning = true;

        Player player1 = new Player(" player1");
        Player.getPlayerCount();

        Player player2 = new Player(" player2");
        Player.getPlayerCount();

        Player player3 = new Player(" player3");
        Player.getPlayerCount();

        Player player4 = new Player(" player4");
        Player.getPlayerCount();

        Player player5 = new Player(" player5");
        Player.getPlayerCount();

        Player player6 = new Player(" player6");
        Player.getPlayerCount();

        Player player7 = new Player(" player7");
        Player.getPlayerCount();

        Player player8 = new Player(" player8");
        Player.getPlayerCount();

        System.out.println();
        Player[] players = {player1, player2, player3, player4, player5, player6, player7, player8};
        while (gameIsRunning) {


            Player.getMethods(players, gameIsRunning);

            gameIsRunning = Player.getMethods(players, gameIsRunning);
        }
    }
}
