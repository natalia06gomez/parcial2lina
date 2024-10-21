package co.edu.unipiloto.estdatos.tallerheap.estructuras;
/**
 * Interfaz de un heap binario genérico.
 * @author Diego
 */
import java.util.ArrayList;

public class IHeap<T extends Comparable<T>> implements IHeap<T> {
    private ArrayList<T> heap;
    private boolean isMaxHeap;

    public Heap(boolean isMaxHeap) {
        this.heap = new ArrayList<>();
        this.isMaxHeap = isMaxHeap;
    }

    @Override
    public void add(T elemento) {
        heap.add(elemento);
        siftUp();
    }

    @Override
    public T peek() {
        if (heap.isEmpty()) return null;
        return heap.get(0);
    }

    @Override
    public T poll() {
        if (heap.isEmpty()) return null;
        T root = heap.get(0);
        T lastElement = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, lastElement);
            siftDown();
        }
        return root;
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    @Override
    public void siftUp() {
        int index = heap.size() - 1;
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            T current = heap.get(index);
            T parent = heap.get(parentIndex);

            if ((isMaxHeap && current.compareTo(parent) > 0) || (!isMaxHeap && current.compareTo(parent) < 0)) {
                heap.set(index, parent);
                heap.set(parentIndex, current);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    @Override
    public void siftDown() {
        int index = 0;
        int size = heap.size();
        while (index * 2 + 1 < size) {
            int leftChildIndex = index * 2 + 1;
            int rightChildIndex = index * 2 + 2;
            int swapIndex = leftChildIndex;

            if (rightChildIndex < size && ((isMaxHeap && heap.get(rightChildIndex).compareTo(heap.get(leftChildIndex)) > 0) ||
                    (!isMaxHeap && heap.get(rightChildIndex).compareTo(heap.get(leftChildIndex)) < 0))) {
                swapIndex = rightChildIndex;
            }

            if ((isMaxHeap && heap.get(index).compareTo(heap.get(swapIndex)) < 0) ||
                    (!isMaxHeap && heap.get(index).compareTo(heap.get(swapIndex)) > 0)) {
                T temp = heap.get(index);
                heap.set(index, heap.get(swapIndex));
                heap.set(swapIndex, temp);
                index = swapIndex;
            } else {
                break;
            }
        }
    }
}
