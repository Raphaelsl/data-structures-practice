import com.example.datastructures.linkedlists.SinglyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedlistTest {
    @Test
    public void testAppendInEmptyList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.append(10);

       System.out.println(list);
//
//        assertEquals(1, list.size());
//        assertEquals(List.of(10), list.toList());
    }

}
