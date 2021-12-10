package music;

import java.io.File;

public class ListNode {

    private File data;
    private ListNode next;
    private ListNode prev;

    public ListNode() {
    }

    public ListNode(File data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public ListNode(File data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(File data, ListNode next, ListNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public File getData() {
        return data;
    }

    public void setData(File data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

}
