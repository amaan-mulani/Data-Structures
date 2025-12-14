package Tree;

public class TreeClass
{
    Node root;

    void insert(Node r, Node n)//r is root/parent  n is new node
    {
        if (root == null)//first node
            root = n;
        else {
            if (n.data < r.data)//left
            {
                if (r.left == null)
                    r.left = n;
                else
                    insert(r.left, n);//go to left and explore
            } else {
                if (r.right == null)
                    r.right = n;
                else
                    insert(r.right, n);//go to right and explore
            }

        }
    }
    void preorder(Node r) {
        if (r != null)//PLR
        {
            System.out.print(r.data + ",");//P
            preorder(r.left);
            preorder(r.right);//R
        }
    }
    void inorder(Node r) {
        if (r != null)//LPR
        {
            inorder(r.left);//L
            System.out.print(r.data + ",");//P
            inorder(r.right);//R
        }
    }
    void postorder(Node r) {
        if (r != null)//LRP
        {

            postorder(r.right);
            postorder(r.left);
            System.out.print(r.data + ",");//P
        }
    }

    int count_node(Node r)
    {

        if(r.left==null && r.right==null)
        {
            return 1;
        }

        else
        {
            return count_node(r.left)+count_node(r.right);
        }
    }

    int tree_value(Node r)
    {
        if(r==null)
        {
            return 0;
        }

        else
        {
            return r.data+tree_value(r.left)+tree_value(r.right);
        }
    }
    int depth(Node r)
    {
        {

            if(r==null)
            {
                return 0;
            }

            else
            {

                int length_left =depth(r.left);
                int length_right=depth(r.right);
                return 1+Math.max(length_right,length_left);
            }
        }
    }


    public static void main(String[] args) {
        TreeClass t = new TreeClass();
        t.insert(t.root, new Node(10));
        t.insert(t.root, new Node(20));
        t.insert(t.root, new Node(5));
        t.insert(t.root, new Node(15));
        t.insert(t.root, new Node(30));
        System.out.print("\nInorder:");
        t.inorder(t.root);//5,10,15,20,30
        System.out.print("\nTotal nodes: "+t.count_node(t.root));
        System.out.print("\nTotal value: "+t.tree_value(t.root));
        System.out.print("\nDepth: "+t.depth(t.root));


    }
}