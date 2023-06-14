package ex9;
import org.example.ex8.*;
import org.example.ex9.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class VideoGameTest {

    public GameStore gameStore;

    @BeforeEach
    public void setUp(){
        gameStore = new GameStore();
        VideoGame game1 = new VideoGame("Skyrim", "Beteshda", 10.0, 50.0);
        VideoGame game2 = new VideoGame("GTA V", "Rockstar", 15.0, 70.0);
    }

    @Test
    public void testAddGameToStock(){
        VideoGame game1 = new VideoGame("Skyrim", "Beteshda", 10.0, 50.0);
        gameStore.addGameToStock(game1);
        assertEquals(1, gameStore.getStock().size());
    }

    @Test
    public void testSellGame(){
        VideoGame game1 = new VideoGame("Skyrim", "Beteshda", 10.0, 50.0);
        VideoGame game2 = new VideoGame("GTA V", "Rockstar", 15.0, 70.0);
        gameStore.addGameToStock(game1);
        gameStore.addGameToStock(game2);
        assertEquals(2, gameStore.getStock().size());
        assertEquals(0, gameStore.getSales().size());
        gameStore.sellGame(0);
        assertEquals(1, gameStore.getStock().size());
        assertEquals(1, gameStore.getSales().size());
        //assertTrue(gameStore.getStock().contains()));
        //assertFalse(gameStore.getStock().contains("game1"));
    }

    @Test
    public void testCalculateProfit(){
        VideoGame game1 = new VideoGame("Skyrim", "Beteshda", 10.0, 50.0);
        VideoGame game2 = new VideoGame("GTA V", "Rockstar", 15.0, 70.0);
        gameStore.addGameToStock(game1);
        gameStore.addGameToStock(game2);
        gameStore.sellGame(0);
        gameStore.sellGame(0);
        assertEquals(95.0, gameStore.calculateProfit());
    }

}
