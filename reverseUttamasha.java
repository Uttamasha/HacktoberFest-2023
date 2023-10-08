class Solution
{
    public static Node reverse(Node node, int k)
    {
        Node current = node;
        Node prev = null;
        Node next = null;
        int count = 0;
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null) {
            node.next = reverse(next, k);
        }
        return prev;
        //Your code here
    }
}
