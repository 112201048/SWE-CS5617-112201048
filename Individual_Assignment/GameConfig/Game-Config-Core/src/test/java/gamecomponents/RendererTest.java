package gamecomponents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RendererTest {

    @Test
    void getRes() {
        GameConfigManager config = GameConfigManager.getInstance();
        config.setScreenHeight("768");
        config.setScreenWidth("1366");
        Renderer renderer = new Renderer();
        assertEquals(config.getScreenWidth()+"X"+config.getScreenHeight(), renderer.getRes());
    }

    @Test
    void getQuality() {
        GameConfigManager config = GameConfigManager.getInstance();
        config.setGraphicsQuality("50");
        Renderer renderer = new Renderer();
        assertEquals(config.getGraphicsQuality(), renderer.getQuality());
    }
}