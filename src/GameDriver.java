/**
 * The main class that drives all the internal functionalities of the game.
 */
public class GameDriver {
    public static void main(String[] args) {
        Map map = new Map();
        map.loadFromFile("testmap.txt");
    }
}
