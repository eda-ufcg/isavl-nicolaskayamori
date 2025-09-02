import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class RoteiroTest {
    	
    @Test
    public void testIsAVL() {
    	BST bst = new BST();
    	assertTrue(bst.isAVL());
    	int[] values = new int[]{41,20,11,29,
    		32,65,50,91,72,99};
    	for (int i : values)
    		bst.add(i);
    	assertTrue(bst.isAVL());

    	bst = new BST();
    	bst.add(1);
    	assertTrue(bst.isAVL());
    	bst.add(2);
    	assertTrue(bst.isAVL());
    	bst.add(3);
    	assertFalse(bst.isAVL());

		bst = new BST();
    	bst.add(1);
    	assertTrue(bst.isAVL());
    	bst.add(3);
    	assertTrue(bst.isAVL());
    	bst.add(2);
    	assertFalse(bst.isAVL());    	

    	bst = new BST();
    	bst.recursiveAdd(10);
    	assertTrue(bst.isAVL());
    	bst.recursiveAdd(5);
    	assertTrue(bst.isAVL());
    	bst.recursiveAdd(1);
    	assertFalse(bst.isAVL());

    	bst = new BST();
    	bst.recursiveAdd(10);
    	assertTrue(bst.isAVL());
    	bst.recursiveAdd(5);
    	assertTrue(bst.isAVL());
    	bst.recursiveAdd(6);
    	assertFalse(bst.isAVL());

        bst = new BST();
    	values = new int[]{90,13,4,8,37,16,24,44,
    		42,88,51,72,81,84,92};
    	for (int i : values)
    		bst.recursiveAdd(i);
		assertFalse(bst.isAVL());

        bst = new BST();
		values = new int[]{23, 12, 40, 9, 25, 60, 50};
    	for (int i : values)
    		bst.recursiveAdd(i);
		assertTrue(bst.isAVL());

		bst = new BST();
		values = new int[]{10, 11, 12};
    	for (int i : values)
    		bst.recursiveAdd(i);
    }

}
