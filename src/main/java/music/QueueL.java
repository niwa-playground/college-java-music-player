package music;

import java.io.File;

public class QueueL {

    LinkedList antrian;

    public QueueL() {
        antrian = new LinkedList();
    }

    public void enqueue(File elemen) {
        antrian.addFirst(elemen);
    }

    public File dequeue() {
        if (!isEmpty()) {
            return antrian.removeLast();
        } else {
            return null;
        }
    }

    public int size() {
        return antrian.size();
    }

    public boolean isEmpty() {
        if (antrian.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getName(int i) {
        return antrian.baca(i).getData().getName();
    }

    public LinkedList getAntrian() {
        return antrian;
    }

    public File get(int i) {
        return antrian.baca(i).getData();
    }
}
