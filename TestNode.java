public class TestNode<T>{

    private T t;
    private TestNode parent;
    private TestNode child;

    public TestNode(){
    }

    public TestNode(T t){
        this.t = t;
    }

    public TestNode(T t, TestNode parent, TestNode child){
        this.t = t;
        this.parent = parent;
        this.child = child;
    }

    public void set_t(T t){
        this.t = t;
    }

    public void set_parent(TestNode parent){
        this.parent = parent;
    }

    public void set_child(TestNode child){
        this.child = child;
    }

    public T get_t(){
        return t;
    }

    public TestNode get_parent(){
        return parent;
    }

    public TestNode get_child(){
        return child;
    }

    public String toString(){
        return "Node: " +
    }
}