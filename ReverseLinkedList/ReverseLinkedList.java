/* 
Write a method for reversing a linked list. ↴ Do it in place. ↴

Your method will have one input: the head of the list.

Your method should return the new head of the list.

Here's a sample linked list node class:

  public class LinkedListNode {

    public int value;
    public LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
    }
}

Things to watch for: We can do this in O(1)O(1) space. So don't make a new list; use the existing list nodes!

We can do this is in O(n)O(n) time.

Careful—even the right approach will fail if done in the wrong order.

Try drawing a picture of a small linked list and running your method by hand. Does it actually work?

The most obvious edge cases are:

the list has 0 elements
the list has 1 element
*/ 

public static LinkedListNode reverse(LinkedListNode headOfList) {
    LinkedListNode currentNode = headOfList;
    LinkedListNode previousNode = null;
    LinkedListNode nextNode = null;

    // until we have 'fallen off' the end of the list
    while (currentNode != null) {

        // copy a pointer to the next element
        // before we overwrite currentNode.next
        nextNode = currentNode.next;

        // reverse the 'next' pointer
        currentNode.next = previousNode;

        // step forward in the list
        previousNode = currentNode;
        currentNode = nextNode;
    }

    return previousNode;
}