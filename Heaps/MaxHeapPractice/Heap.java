package Heaps.MaxHeapPractice;

public class Heap {
    private int[] heap;
    private int size;

    public Heap(int capacity){
        heap = new int[capacity];
    }

    public void insert(int value){
        if(isFull()){
            throw new IndexOutOfBoundsException("heap is full");
        }
        heap[size] = value;
        size++;
    }

    public int peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("heap is empty");
        }
        return heap[0];
    }

    public int delete(int index){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("heap is empty");
        }
        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size-1];

        if(index == 0 || heap[index] < heap[parent]){
            fixHeapBelow(index, size -1);
        }
        else{
            fixHeapAbove(index);
        }
        size--;

        return deletedValue;
    }

    public void fixHeapAbove(int index){
        int newValue = heap[index];
        while(index > 0 && newValue > heap[getParent(index)]){
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
    }

    public void printHeap(){
        for(int i=0; i<size; i++){
            System.out.print(heap[i]);
            System.out.print("");
        }
    }

    public boolean isFull(){
        return size == heap.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getParent(int index){
        return (index -1)/2;
    }

    public int getChild(int index, boolean left){
        return 2 * index + (left ? 1 : 2);
    }
}
