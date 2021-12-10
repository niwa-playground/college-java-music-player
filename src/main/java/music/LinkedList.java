package music;

import java.io.File;

public class LinkedList {

    private ListNode head;
    private int size;

    public LinkedList() {
        head = new ListNode();
        head.setNext(head);
        head.setPrev(head);
        size = 0;
    }

    private ListNode addBefore(File data, ListNode node) {
        ListNode baru = new ListNode(data);
        if (isEmpty()) {
            head.setNext(baru);
            head.setPrev(baru);

            baru.setNext(head);
            baru.setPrev(head);

        } else {
            baru.setNext(node);
            baru.setPrev(node.getPrev());

            node.getPrev().setNext(baru);
            node.setPrev(baru);
        }
        size++;
        return node;
    }

    public void addFirst(File data) {
        addBefore(data, head.getNext());
    }

    public void addLast(File data) {
        addBefore(data, head);
    }

    public File remove(ListNode node) {
        node.getNext().setPrev(node.getPrev());
        node.getPrev().setNext(node.getNext());

        node.setPrev(null);
        node.setNext(null);

        size--;
        return node.getData();
    }

    public File removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            return remove(head.getNext());
        }
    }

    public File removeLast() {
        if (isEmpty()) {
            return null;
        } else {
            return remove(head.getPrev());
        }
    }

    public int size() {
        return size;
    }

    public ListNode getHead() {
        return head;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public ListNode baca(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index > size) {
            return null;
        } else {
            ListNode cari = head.getNext();
            int i = 0;
            while (i != index) {
                if (cari.getNext() == null) {
                    return null;
                }
                cari = cari.getNext();
                i++;
            }
            return cari;
        }

    }

    public ListNode search(File data) {
        if (!isEmpty()) {
            ListNode bantu = head;
            while (bantu.getNext() != null) {
                if (bantu.getData() == data) {
                    return bantu;
                }
                bantu = bantu.getNext();
            }
            if (bantu.getData() == data) {
                return bantu;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String array = "";
        ListNode cetak = head.getNext();
        while (cetak != head) {
            array = array + cetak.getData() + ", ";
            cetak = cetak.getNext();
        }
        return array;
    }

}
