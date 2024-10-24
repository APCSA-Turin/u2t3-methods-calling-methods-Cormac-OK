public class Game {
    String gameName;
    int players;
    int score;

    // constructor
    public Game(String name, int numOfPlayers){
        gameName = name;
        players = numOfPlayers;
        score = 0;
    }

    // ---v--- functions ---v---
    public void addPlayer(){
        players ++;
    }

    public void increaseScore(int increase){
        score += increase;
    }

    // new method to reset game score to zero
    public void resetScore(){
        score = 0;
    }

    // new method to rename game
    public void renameGame(String newName){
        gameName = newName;
    }

    public double averageScorePerPlayer(){
        return (double)score/players;
    }

    public boolean isGameOver(){
        return score > 9;
    }

    //---v---getters ---v---
    public String getGameName() {
        return gameName;
    }

    public int getPlayers() {
        return players;
    }

    public int getScore() {
        return score;
    }

}
