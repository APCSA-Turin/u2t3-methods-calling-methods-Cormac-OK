public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game("Dodge Ball", 5);
        game.increaseScore(5);

        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());

        System.out.println("----- CHANGING GAME -----");
        game.resetScore();
        game.renameGame("Soccer");
        
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
    }
}
