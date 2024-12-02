public class ArrayList {

    private Object[] data;
    private int size;

    public ArrayList() {
        data = new Object[10];
        size = 0;
    }

    public void addFirst(Object elem) {
        if (size == data.length) {
            resizeArray();
        }

        for (int i = size - 1; i >= 0; i--) {
            data[i + 1] = data[i];
        }

        data[0] = elem;
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return data[index];
    }

    public Object set(int index, Object elem) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Object oldValue = data[index];
        data[index] = elem;
        return oldValue;
    }

    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Object removedElement = data[index];

        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }

        size--;

        return removedElement;
    }

    public int indexOf(Object elem) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(elem)) {
                return i;
            }
        }

        return -1;
    }

    public int size() {
        return size;
    }

    private void resizeArray() {
        int newSize = data.length * 2;
        Object[] newData = new Object[newSize];

        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }
}