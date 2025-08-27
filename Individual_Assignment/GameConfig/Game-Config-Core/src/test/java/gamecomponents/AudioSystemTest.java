package gamecomponents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudioSystemTest {

    @Test
    void getVol() {
        GameConfigManager config = GameConfigManager.getInstance();
        config.setVolumeLevel("80");
        AudioSystem audioSystem = new AudioSystem();
        assertEquals(config.getVolumeLevel(), audioSystem.getVol());
    }
}