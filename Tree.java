import java.util.Stack;

public class Tree
{
    private Node root;

    public Tree()
    {
        root = null;
    }

    public Boolean isEmpty()
    {
        return (root == null);
    }

    public void insert(Integer data)
    {
        root = insert(root, data);
        System.out.println("\t\t\t\t" + data + ": I N S E R T I O N  S U C C E S S F U L!");
    }

    public Node insert(Node node, Integer data)
    {
        if(node == null)
        {
            node = new Node(data);
        }
        else
        {
            if(data <= node.getAttr())
            {
                node.left = insert(node.left, data);
            }
            else
            {
                node.right = insert(node.right, data);
            }
        }

        return node;
    }

    public Boolean search(Integer value)
    {
        return search(root, value);
    }

    private Boolean search(Node node, Integer value)
    {
        Boolean found = false;

        while(node != null && !found)
        {
            if(node.getAttr() < value)
            {
                node = node.getRightChild();
            }
            else
            {
                if(node.getAttr() == value)
                {
                    found = true;
                    break;
                }
                else
                {
                    node = node.getRightChild();
                }
            }
        }

        return found;
    }

    public void delete(Integer culprit)
    {
        if (!isEmpty())
        {
            if(search(culprit))
            {
                root = delete(root, culprit);
                System.out.println(culprit + "\t\t\t\t: D E L E T E D");
            }
        }
    }

    private Node delete(Node node, Integer X)
    {
        Node uno;
        Node tres;
        Node sinco;

        if(root.getAttr() == X)
        {
            Node l, r;
            l = root.getLeftChild();
            r = root.getRightChild();

            if(l == null && r == null)
            {
                return null;
            }
            else if(l == null)
            {
                uno = r;
                return uno;
            }
            else if(r == null)
            {
                uno = l;
                return uno;
            }
            else
            {
                uno = tres = r;

                while(uno.getLeftChild() != null)
                {
                    uno = uno.getLeftChild();
                }
                uno.left = l;
                return tres;
            }
        }

        if(X < root.getAttr())
        {
            sinco = delete(root.getRightChild(), X);
            root.left = sinco;
        }
        else
        {
            sinco = delete(root.getRightChild(), X);
            root.right = sinco;
        }

        return root;
    }

    public int countNodes()
    {
        return countNodes(root);
    }

    private int countNodes(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        else
        {
            int track = 1;

            track += countNodes(node.getLeftChild());
            track += countNodes(node.getRightChild());
            return track;
        }
    }

    public void inOrder()
    {
        System.out.print("\n\tBST: ");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node root)
    {
        if(root != null)
        {
            inOrder(root.getLeftChild());
            System.out.print(root.getAttr() + " ");
            inOrder(root.getRightChild());
        }
    }

    public void preOrder()
    {
        System.out.print("\n\tBST: ");
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node root)
    {
        if(root != null)
        {
            System.out.print(root.getAttr() + " ");
            preOrder(root.getLeftChild());
            preOrder(root.getRightChild());
        }
    }

    public void postOrder()
    {
        System.out.print("\n\tBST: ");
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node root)
    {
        if(root != null)
        {
            preOrder(root.getLeftChild());
            preOrder(root.getRightChild());
            System.out.print(root.getAttr() + " ");
        }
    }
}