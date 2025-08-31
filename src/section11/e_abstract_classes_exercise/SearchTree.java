package section11.e_abstract_classes_exercise;

public class SearchTree implements NodeList {
    public ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem item) {
        if(item != null) {
            System.out.println(item.getValue());
            traverse(item.next());
        }
    }
}
