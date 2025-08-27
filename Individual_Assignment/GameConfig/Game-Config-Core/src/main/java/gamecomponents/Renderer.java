package gamecomponents;

/**
 * Renderer : One of the Game Components.
 * <p>
 * <strong>Key Features:</strong>
 * <ul>
 *   <li>One of the components which accesses the Singleton Instance of the Configuration</li>
 *   <li>Checks the Resolution and Quality from the config</li>
 *   <li>Can set the Resolution and Quality level</li>
 * </ul>
 * </p>
 * @author Sidarth Prabhu
 * @version 1.0.0
 * @since 1.0.0
 */

public class Renderer {
    /**
     * Method to get the Screen Resolution from the singleton instance.
     * @return Returns the Screen Res from the Game Configuration.
     */
    public String getRes() {
        final GameConfigManager config = GameConfigManager.getInstance();
        System.out.println("Screen Res : " + config.getScreenWidth() + "X" + config.getScreenHeight());
        return config.getScreenWidth() + "X" + config.getScreenHeight();
    }

    /**
     * Method to get the quality from the singleton instance.
     * @return Returns the Graphics Quality from the Game Configuration.
     */
    public String getQuality() {
        final GameConfigManager config = GameConfigManager.getInstance();
        System.out.println("Graphics Quality : " + config.getGraphicsQuality());
        return config.getGraphicsQuality();
    }
}
