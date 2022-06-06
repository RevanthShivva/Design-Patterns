package com.company.Strategy;

public class Game {



    public GameMode gameMode;
    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }
      public void startGame(){
          System.out.println("Starting the game...");
      }
      public void selectLevel(){
          System.out.println("Please select the level...");
      }
      public void modeOfPlay(){
        gameMode.mode();
      }

      public void endGame(){
          System.out.println("Game has been ended.");
      }
      public void playGame(){
        startGame();
        selectLevel();
        modeOfPlay();
        endGame();
      }
}
