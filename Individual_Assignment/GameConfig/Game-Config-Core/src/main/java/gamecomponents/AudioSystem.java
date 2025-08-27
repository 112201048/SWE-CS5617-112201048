package gamecomponents;

/**
 * Audio Manager : One of the Game Components.
 * <p>
 * <strong>Key Features:</strong>
 * <ul>
 *   <li>One of the components which accesses the Singleton Instance of the Configuration</li>
 *   <li>Checks the volume value from the config</li>
 *   <li>Can set the volume level</li>
 * </ul>
 * </p>
 * @author Sidarth Prabhu
 * @version 1.0.0
 * @since 1.0.0
 */

public class AudioSystem {
    /**
     * Method to get the volume from the singleton instance.
     * @return Returns the volume level of the game.
     */
    public String getVol() {
        final GameConfigManager config = GameConfigManager.getInstance();
        System.out.println("Volume : " + config.getVolumeLevel());
        return config.getVolumeLevel();
    }
}
