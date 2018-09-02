/* Delete a node from a singly-linked list, given only a variable pointing to that node. 
  public class LinkedListNode {

    public int value;
    public LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
    }
}

LinkedListNode a = new LinkedListNode(1);
LinkedListNode b = new LinkedListNode(2);
LinkedListNode c = new LinkedListNode(3);

a.next = b;
b.next = c;

deleteNode(b)
*/

/* So we could remove the pointer to the node we want to delete, however, if we reference this node somewhere else
This solution will point to a "ghost" node
*/

  public static void deleteNode(LinkedListNode nodeToDelete) {

    // get the input node's next node, the one we want to skip to
    LinkedListNode nextNode = nodeToDelete.next;

    if (nextNode != null) {

        // replace the input node's value and pointer with the next
        // node's value and pointer. the previous node now effectively
        // skips over the input node
        nodeToDelete.value = nextNode.value;
        nodeToDelete.next  = nextNode.next;

    } else {

        // eep, we're trying to delete the last node!
        throw new IllegalArgumentException("Can't delete the last node with this technique!");
    }
}