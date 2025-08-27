package game;

import gamecomponents.AudioSystem;
import gamecomponents.GameConfigManager;
import gamecomponents.DifficultyManager;
import gamecomponents.Renderer;

/**
 * Main demonstration class for the Singleton Design Pattern.
 * <p>
 * This class examples of how the Singleton pattern works
 * GameConfigManager is the Singleton class
 * Multiple Components of the game access the same instance of the Game Configuration
 * Instead of creating an instance everytime its accessed
 * </p>
 *
 * @author Sidarth Prabhu
 * @version 1.0.0
 * @since 1.0.0
 */

public class App {

    /**
     * Main entry point for the Singleton Pattern demonstration.
     * @param args command line arguments (not used)
     */
    public static void main(final String[] args) {
        final Renderer renderer = new Renderer();
        final AudioSystem audioSystem = new AudioSystem();
        final DifficultyManager difficultyManager = new DifficultyManager();

        renderer.getQuality();
        renderer.getRes();
        difficultyManager.getDifficulty();
        audioSystem.getVol();

        final GameConfigManager config = GameConfigManager.getInstance();
        config.setGameDifficulty("Expert");
        config.setVolumeLevel("Low");
        config.setGraphicsQuality("Realistic");
        config.setScreenWidth("1080");

        System.out.println("\nAfter changing config\n");
        renderer.getQuality();
        renderer.getRes();
        difficultyManager.getDifficulty();
        audioSystem.getVol();
    }
}
