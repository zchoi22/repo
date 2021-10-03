public class TestNode<T> {

    private T t;
    private TestNode parent;
    private TestNode child;

    //constructs empty test node object
    public TestNode(){
    }

    //constructor that sets the type object
    public TestNode(T t){
        this.t = t;
    }

    //constructor for type object, parent, and child (two other node objects)
    public TestNode(T t, TestNode parent, TestNode child){
        this.t = t;
        this.parent = parent;
        this.child = child;
    }

    //sets type object
    public void set_t(T t){
        this.t = t;
    }

    //sets parent
    public void set_parent(TestNode parent){
        this.parent = parent;
    }

    //sets child
    public void set_child(TestNode child){
        this.child = child;
    }

    //returns type object
    public T get_t(){
        return t;
    }

    //returns parent
    public TestNode get_parent(){
        return parent;
    }

    //returns child
    public TestNode get_child(){
        return child;
    }

    @Override
    public String toString(){
        return String.format("Node: " + t);
    }

    @Override
    public boolean equals(Object o){
        if (o == this){
            return true;
        }

        if(!(o instanceof TestNode)){
            return false;
        }

        TestNode t = (TestNode) o;

        return this.t == t.get_t();
    }
}