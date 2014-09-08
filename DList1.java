/* DList1.java */


public class DList1 {


  public DListNode1 head;
  public DListNode1 tail;
  public long size;

  /* DList1 invariants:
   *  1)  head.prev == null.
   *  2)  tail.next == null.
   *  3)  For any DListNode1 x in a DList, if x.next == y and x.next != null,
   *      then y.prev == x.
   *  4)  For any DListNode1 x in a DList, if x.prev == y and x.prev != null,
   *      then y.next == x.
   *  5)  The tail can be accessed from the head by a sequence of "next"
   *      references.
   *  6)  size is the number of DListNode1s that can be accessed from the
   *      head by a sequence of "next" references.
   */

  /**
   *  DList1() constructor for an empty DList1.
   */
  public DList1() {
    head = null;
    tail = null;
    size = 0;
  }

public void insertFront(short red, short green, short blue, int run) {
   if (head != null) {
    DListNode1 s = new DListNode1();
    s.red = red;
    s.green = green;
    s.blue = blue;
    s.next = head;
    head = s;
    head.next.prev = head;
    size++;
   }
   else {
    head = new DListNode1();
    head.red = red;
    head.green = green;
    head.blue = blue;
    tail = head;
    size++;
    }
}

public void insertBack(short red, short green, short blue, int run) {
        if (head != null) {
         DListNode1 s = new DListNode1();
         s.red = red;
         s.blue = blue;
         s.green = green;
         s.run = run;
         s.prev = tail;
         tail.next = s;
         tail = s;
         tail.next = null;
         size++;
        }
        else {
         head = new DListNode1();
         head.run = run;
         head.red = red;
         head.blue = blue;
         head.green = green;
         tail = head;
         size++;
        }
    }

}