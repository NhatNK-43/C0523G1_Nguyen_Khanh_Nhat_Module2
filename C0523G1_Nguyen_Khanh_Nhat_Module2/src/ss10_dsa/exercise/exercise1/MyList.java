package ss10_dsa.exercise.exercise1;

import java.lang.annotation.ElementType;
import java.util.Arrays;
import java.util.Objects;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            System.out.println("Successfully created array with size: " + capacity);
            elements = new Object[capacity];
        } else {
            System.out.println("Input parameter error!");
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("Successfully created array with size: " + elements.length);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }

    }

    //    private void ensureCapacity() {
//        int newSize = elements.length * 2;
//        elements = Arrays.copyOf(elements, newSize);
//    }
    public Boolean add(E element) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size++] = element;
        return true;
    }

    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        } else if (index == elements.length) {
            ensureCapacity(1);
        }

        if (elements[index] == null) {
            size++;
            elements[index] = element;
        } else {
            if (size == elements.length) {
                ensureCapacity(1);
            }
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = element;
            size++;
        }
    }

    public E remove(int index) {
        Object element = elements[index];
        if (index < 0 || index >= elements.length)
            throw new ArrayIndexOutOfBoundsException("Array index out of range: " + index);
        else {
            if (element != null) {
                for (int i = index; i < elements.length - 1; i++) {
                    elements[i] = elements[i + 1];
                }
                elements[elements.length - 1] = null;
                size--;
            }
        }
        return (E) element;
    }

    public int getSize() {
        return size;
    }

    public int getLength() {
        return elements.length;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public MyList<E> clone() {
        MyList<E> arrayCopy = new MyList<>();
        arrayCopy.elements = Arrays.copyOf(elements, elements.length);
        arrayCopy.size = size;
        return arrayCopy;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean contains(E o) {
        return this.indexOf(o) >= 0;
    }

    public Object clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        return this;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
