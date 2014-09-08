/* DListNode1.java */

/**
 *  A DListNode is a node in a DList (doubly-linked list).
 */

public class DListNode1 {
    
  public short red;
  public short green;
  public short blue;
  public int run;
  public DListNode1 prev;
  public DListNode1 next;

  /**
   *  DListNode1() constructor.
   */
DListNode1() {
    red = 0;
    green = 0;
    blue = 0;
    run = 0;
    prev = null;
    next = null;
  }
  public DListNode1 gotot (int tot, DListNode1 node) {
    for (int f = 0; f < tot; f++)
        {node = node.next;}
    return node;
}

}