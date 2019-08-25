package pl.sdaacademy.lists;

public class MyLinkedList {

    private MyLinkedListItem head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(Integer value) {
        MyLinkedListItem myLinkedListItem = new MyLinkedListItem(value);

        if (this.head == null) {
            this.head = myLinkedListItem;
        } else {

            MyLinkedListItem lastItem = getLastItem();
            lastItem.nextItem = myLinkedListItem;
        }
        size++;
    }




    public Integer get(int index) {

        return getElement(index).value;
    }


    private MyLinkedListItem getElement(int index) {
        MyLinkedListItem tmpItem = head;
        for (int i = 0; i < index; i++) {
            tmpItem = tmpItem.nextItem;
        }
        return tmpItem;
    }


    public void remove(int index) {

        MyLinkedListItem previous = getElement(index - 1);
        MyLinkedListItem toRemove = getElement(index);
        previous.nextItem = toRemove.nextItem;
        toRemove.nextItem=null;

        size--;


//        /\
//       /  \
//        ||
//        ||
//        ||
    }

    public void add (int index, Integer value){
        MyLinkedListItem toAdd = new MyLinkedListItem(value);
        MyLinkedListItem previousElement = getElement(index - 1);
        toAdd.nextItem = previousElement.nextItem;
        previousElement.nextItem = toAdd;

        size++;
    }




    public int size() {
        return size;
    }

    private MyLinkedListItem getLastItem() {
        MyLinkedListItem tmpItem = this.head;
        while (tmpItem.nextItem != null) {
            tmpItem = tmpItem.nextItem;
        }
        return tmpItem;
    }


    static class MyLinkedListItem {
        private Integer value;
        private MyLinkedListItem nextItem;

        private MyLinkedListItem(Integer value) {
            this.value = value;
        }
    }


}
