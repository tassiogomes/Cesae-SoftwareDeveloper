package ex8;
import org.example.ex8.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    public ShoppingCart shoppingCart;

    @BeforeEach
    public void setUp(){
        shoppingCart = new ShoppingCart("123");
    }

    @Test
    public void testAddItem(){
        shoppingCart.addItem("item1");
        shoppingCart.addItem("item2");
        assertEquals(2, shoppingCart.getItemCount());
    }

    @Test
    public void testeRemoveItem(){
        shoppingCart.addItem("item1");
        shoppingCart.addItem("item2");
        shoppingCart.removeItem("item1");
        assertEquals(1, shoppingCart.getItemCount());
    }

    @Test
    public void testContainsItem(){
        shoppingCart.addItem("item1");
        shoppingCart.addItem("item2");
        assertTrue(shoppingCart.containsItem("item1"));
        assertFalse(shoppingCart.containsItem("item3"));
    }

    @Test
    public void testClearCart(){
        shoppingCart.addItem("item1");
        shoppingCart.clearCart();
        assertEquals(0,shoppingCart.getItemCount());
    }

}

