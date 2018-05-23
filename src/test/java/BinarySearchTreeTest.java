import com.example.bstclosestvalue.BinarySearchTree;
import com.example.bstclosestvalue.Node;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author greta
 */
public class BinarySearchTreeTest {
    
    @Test
    public void testFindClosestNode() {
        int[] arr = {-10, -2, 5, 9, 16};
        BinarySearchTree tree_1 = new BinarySearchTree(arr);
        
        Node closest = tree_1.findClosestNode(tree_1, 10);
        assertEquals(9, closest.getData());
        
        closest = tree_1.findClosestNode(tree_1, 0);
        assertEquals(-2, closest.getData());
        
        closest = tree_1.findClosestNode(tree_1, -2);
        assertEquals(-2, closest.getData());
        
        closest = tree_1.findClosestNode(tree_1, -5);
        assertEquals(-2, closest.getData());
        
        int[] arr_2 = {1, 100};
        BinarySearchTree tree_2 = new BinarySearchTree(arr_2);
        
        closest = tree_2.findClosestNode(tree_2, 50);
        assertEquals(1, closest.getData());
        
        closest = tree_2.findClosestNode(tree_2, -2);
        assertEquals(1, closest.getData());
        
        
        closest = tree_2.findClosestNode(tree_2, 101);
        assertEquals(100, closest.getData());
        
    }
}
