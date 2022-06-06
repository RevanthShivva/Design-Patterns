package com.company.Strategy;

public class Main {
    public static void main(String[] args) {
          GameMode gameMode1 = new FirstPersonPerspective();
          GameMode gameMode2 = new ThirdPersonPerspective();

          Game game = new Game();
          game.setGameMode(gameMode1);
          game.playGame();
          System.out.println("-------------------------------------------");
          game.setGameMode(gameMode2);
          game.playGame();
    }
}
