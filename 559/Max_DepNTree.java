
import java.util.*;
// Definition for a Node.
class Node {
    public int val;

    public List<Node> children;

    public Node() {}
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Max_DepNTree {
    public int maxDepth(Node root) {
        if(root == null)
            return 0;
        int max = 0;
        for (int i=0;i<root.children.size();i++) {
            if (maxDepth(root.children.get(i)) + 1 > max){
                max = maxDepth(root.children.get(i)) + 1;
            }
        }
    }
    public static void main(String[] args) {
        List<Node> ls2 = new ArrayList<Node>();
        Node s1 = new Node(5);
        Node s2 = new Node(6);
        ls2.add(s1);
        ls2.add(s2);
        Node l1 = new Node(3,ls2);
        Node l2 = new Node(2);
        Node l3 = new Node(4);
        List<Node> ls1 = new ArrayList<Node>();
        ls1.add(l1);
        ls1.add(l2);
        ls1.add(l3);
        Node root = new Node(1,ls1);    
    }
}