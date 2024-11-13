package HomeWorkFootball.Object;

import java.util.Random;


public class Player {
    private static final int MIN_STAMINA = 0;
    private static final int MAX_STAMINA = 10;

    private int playerStamina;
    private String name;

    public Player(String name) {
        if (Game.isFieldFull()) {
            this.name = name;
            Random random = new Random();
            playerStamina = random.nextInt(8, MAX_STAMINA);
        }
    }

    public int getPlayerStamina() {
        return playerStamina;
    }

    public void run() {
        playerStamina--;
        System.out.println("Бежит игрок " + name + ". Выносливости  " + name
                + ": осталось " + playerStamina + " единиц");

        if (playerStamina == MIN_STAMINA) {
            Game.removePlayer(this);
            System.out.println("Игрок " + name + " покидает поле.");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }

}