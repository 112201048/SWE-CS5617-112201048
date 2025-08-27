package gamecomponents;

/**
 * Difficulty Manager : One of the Game Components.
 * <p>
 * <strong>Key Features:</strong>
 * <ul>
 *   <li>One of the components which accesses the Singleton Instance of the Configuration</li>
 *   <li>Checks the Difficulty level from the config</li>
 *   <li>Can set the difficulty level</li>
 * </ul>
 * </p>
 * @author Sidarth Prabhu
 * @version 1.0.0
 * @since 1.0.0
 */

public class DifficultyManager {
    /**
     * Method to get the difficulty from the singleton instance.
     * @return Returns the Difficulty from the Game Configuration.
     */
    public String getDifficulty() {
        final GameConfigManager config = GameConfigManager.getInstance();
        System.out.println("Current Difficulty : " + config.getGameDifficulty());
        return config.getGameDifficulty();
    }
}
