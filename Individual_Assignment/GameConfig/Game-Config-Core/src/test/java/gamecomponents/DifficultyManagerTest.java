package gamecomponents;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class DifficultyManagerTest {

    @Test
    void getDifficulty() {
        GameConfigManager config = GameConfigManager.getInstance();
        config.setGameDifficulty("Hard");
        DifficultyManager difficultyManager = new DifficultyManager();
        assertEquals(config.getGameDifficulty(), difficultyManager.getDifficulty());
    }
}