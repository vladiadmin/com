/* Description: The code is taken from "Algorightms foundation" book on page 21 / junit
Created 27-Dec-2021 */

package queues;

import  com.wrox.algorithms.lists.LinkedList;
import  com.wrox.algorithms.lists.List;
import junit.framework.TestCase;

public class RandomListQueueTest extends TestCase {
    private static final String VALUE_A = "A";
    private static final String VALUE_B = "B";
    private static final String VALUE_C = "C";
    private Queue _queue;
}

protected void setUp() throws Exception {
    super.setUp ();
    _queue = new RandomListQueue ();
}

protected void tearDown () throws Exception {
    super.tearDown();
    _queue = null;
}

public void testAccessAnEmptyQueue () {
    assertEuals(0, _queue.size());
    assertTrue(_queue.isEmpty());
    try {
        _queue.dequeue();
        fail();
    } catch (EmptyQueueException e) {
        // expected
    }
}

public void testClear() {
    _queue.enqueue (VALUE_A);
    _queue.enqueue (VALUE_B);
    _queue.enqueue (VALUE_C);

    assertEquals(3, _queue.size());
    assertFalse(_queue.isEmpty());

    _queue.clear();

    assertEquals (0, _queue.size());
    assertTrue (_queue.isEmpty());
}