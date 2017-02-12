public class Node
{
    protected Integer attribute;
    protected Node left;
    protected Node right;

    public Node()
    {
        attribute = 0;
        left = right = null;
    }

    public Node(Integer attr)
    {
        attribute = attr;
        left = right = null;
    }

    public Integer getAttr()
    {
        return this.attribute;
    }

    public Node getLeftChild()
    {
        return this.left;
    }

    public Node getRightChild()
    {
        return this.right;
    }

    public Integer getParent(Node current)
    {
        return null;
    }
}
