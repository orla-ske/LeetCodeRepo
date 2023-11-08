/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        dfs(head); 
        return head;
    }

    private Node dfs(Node node){
        Node prev = null; 
        while(node != null){
            prev = node; 
            if(node.child != null){
                Node tail = dfs(node.child); 
                tail.next = node.next;
                if(node.next != null){
                    node.next.prev = tail;
                }

                node.next = node.child; 
                node.child.prev = node; 
                node.child = null; 

                node = tail.next; 
                prev = tail;
            }else{
                node = node.next;
            }
        }
        return prev;
    }
}