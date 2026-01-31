import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import com.example.ListManager;
class ListManagerTest {

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 10);
        ListManager.addElement(list, 20);
        assertEquals(2, list.size());
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));
        ListManager.removeElement(list, 20);
        assertEquals(2, list.size());
        assertFalse(list.contains(20));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, ListManager.getSize(list));
        ListManager.addElement(list, 5);
        assertEquals(1, ListManager.getSize(list));
    }
}
