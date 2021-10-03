class TestTestNode<T> {
    private TestNode parent;
    private TestNode child;
    private T t;
    private TestNode test;

    public TestTestNode(){
    }

    public TestTestNode(TestNode parent, TestNode child,
                        TestNode test, T t){
        this.parent = parent;
        this.child = child;
        this.test = test;
        this.t = t;
    }

    public void set_parent(TestNode parent){this.parent = parent;}

    public void set_child(TestNode child){this.child = child;}

    public void set_test(TestNode test){this.test = test;}

    public void set_t(T t){this.t = t;}

    //tests toString method and constructors
    public void test1(T t, TestNode parent, TestNode child){
        this.set_test(new TestNode());
        System.out.print("Empty test node class: ");
        System.out.println(this.test.toString());

        this.set_t(t);
        this.set_test(new TestNode(this.t));
        System.out.print("Test node class w/ t type: ");
        System.out.println(this.test.toString());

        this.set_parent(parent);
        this.set_child(child);
        System.out.print("Test node class w/ t type & two empty nodes: ");
        this.set_test(new TestNode(this.t, this.parent, this.child));
        System.out.print(this.test.toString());
        System.out.print(", " + this.test.get_child());
        System.out.println(", " + this.test.get_parent());
    }

    public void test2(T t, TestNode child){
        this.set_test(new TestNode(t, child, child));
        this.set_parent(new TestNode(t, child, child));
        System.out.print("Compare two equal test nodes: ");
        System.out.println(this.test.equals(this.parent));
        System.out.print("Compare two unequal test nodes: ");
        System.out.println(this.test.equals(this.child));
    }
}

public class Main {
    public static void main(String[] args){
        TestTestNode test = new TestTestNode();
        test.test1(20, new TestNode(), new TestNode());
        test.test2(20, new TestNode(30));
    }
}