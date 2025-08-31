package section11.e_abstract_classes_exercise;

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null) {
            this.root = item;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("The list is empty");
            return;
        }
        while(true) {
            ListItem item;
            if(root.next() != null) {
                item = root.next();
                System.out.println(item.getValue());
            } else {
                break;
            }
        }
    }
}
