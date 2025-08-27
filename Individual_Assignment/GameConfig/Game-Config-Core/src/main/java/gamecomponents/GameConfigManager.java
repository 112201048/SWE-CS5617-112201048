package gamecomponents;

/**
 * Game Configuration.
 * <p>
 *     Only one instance of this class can be created. That is, the first call to the method
 *     getInstance() creates an instance and all the subsequent calls return the same instance.
 * </p>
 * <p>
 * <strong>Design Pattern Role:</strong> Singleton Class
 * </p>
 * <p>
 * <strong>Key Config Variables:</strong>
 * <ul>
 *   <li>gameDifficulty</li>
 *   <li>screenWidth</li>
 *   <li>screenHeight</li>
 *   <li>graphicsQuality</li>
 *   <li>volumeLevel</li>
 * </ul>
 * </p>
 * @author Sidarth Prabhu
 * @version 1.0.0
 * @since 1.0.0
 */


public class GameConfigManager {
    /**
     * This is the only instance which will be created.
     */
    private static GameConfigManager instance;

    /**
     * Game Difficulty.
     */
    private String gameDifficulty;

    /**
     * Screen Width.
     */
    private String screenWidth;

    /**
     * Screen Height.
     */
    private String screenHeight;

    /**
     * Graphics Quality Level.
     */
    private String graphicsQuality;

    /**
     * Volume Level.
     */
    private String volumeLevel;

    private GameConfigManager() {
        screenHeight = "1080";
        screenWidth = "1920";
        graphicsQuality = "Ultra";
        gameDifficulty = "Beginner";
        volumeLevel = "High";
    }

    /**
     * Method to get the singleton instance.
     * @return Returns the instance of the Game Configuration.
     */
    public static GameConfigManager getInstance() {
        if (instance == null) {
            instance = new GameConfigManager();
        }
        return instance;
    }

    public String getGraphicsQuality() {
        return graphicsQuality;
    }

    public String getVolumeLevel() {
        return volumeLevel;
    }

    public String getScreenHeight() {
        return screenHeight;
    }

    public String getScreenWidth() {
        return screenWidth;
    }

    public String getGameDifficulty() {
        return gameDifficulty;
    }

    public void setGameDifficulty(final String difficulty) {
        this.gameDifficulty = difficulty;
    }

    public void setGraphicsQuality(final String quality) {
        this.graphicsQuality = quality;
    }

    public void setScreenHeight(final String height) {
        this.screenHeight = height;
    }

    public void setScreenWidth(final String width) {
        this.screenWidth = width;
    }

    public void setVolumeLevel(final String volume) {
        this.volumeLevel = volume;
    }
}
