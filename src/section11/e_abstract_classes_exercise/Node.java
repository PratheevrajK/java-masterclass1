package section11.e_abstract_classes_exercise;

public class Node extends ListItem{
    public Node(Object value){
        super(value);
    }
    ListItem next(){
        return rightLink;
    }
    ListItem setNext(ListItem item){
        rightLink = item;
        return item;
    }
    ListItem previous(){
        return leftLink;
    }
    ListItem setPrevious(ListItem item){
        leftLink = item;
        return leftLink;
    }
    int compareTo(ListItem item){
        return this.getValue().hashCode() - item.getValue().hashCode();
    }
}