package HomeWorkFootball;

import HomeWorkFootball.Object.Game;
import HomeWorkFootball.Object.Player;


public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        while (Game.players.size() < 6) {
            game.addPlayer();
            System.out.println("В списке игроков " + Game.players.size() + " элементов.");
        }

        System.out.println();

        while (!Game.players.isEmpty()) {
            m1:
            for (Player player : Game.players) {
                System.out.println(player + " " + player.getPlayerStamina());
                if (game.checkPlayerName(player)) {
                    System.out.println("Игрок " + player + " играет в поле");
                    player.run();
                    System.out.println("В списке игроков " + Game.players.size() + " элементов.");
                    game.getInfo();
                    System.out.println(Game.players.toString());
                } else {
                    System.out.println("Игрок " + player + " отсутсвует на поле");
                }

                if (player.getPlayerStamina() <= 0) {
                    game.addPlayer();
                    break m1;
                }
                System.out.println();
            }
        }
        game.gameEnd();
    }
}
