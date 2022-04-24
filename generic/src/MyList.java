import java.util.Arrays;

public class MyList<T> {
    private T[] arr;

    MyList() {
        this.arr = (T[]) new Object[10];
    }

    MyList(int capacity) {
        this.arr = (T[]) new Object[capacity];
    }

    public int size() {
        int i = 0;
        for (T o : arr) {
            if (o != null) {
                i++;
            }
        }
        return i;

    }

    public int getCapacity() {
        return arr.length;
    }

    public void add(T data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = data;
                break;
            } else if (i == arr.length - 1) {
                arr = Arrays.copyOf(arr, arr.length * 2);
                arr[arr.length / 2] = data;
                break;
            }
        }

    }

    T get(int index) {
        if (index < arr.length) {
            return arr[index];
        } else {
            return null;
        }
    }

    void remove(int index) {
        if (index < arr.length) {
            arr[index] = null;
            for (int i = index + 1; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    arr[i] = null;
                }
                arr[i] = arr[i - 1];
            }
        }
    }

    void set(int index, T data) {
        if (index >= 0 && index < arr.length) {
            arr[index] = data;
        } else {
            System.out.println("null");
        }
    }

    public String toString() {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==null){
                continue;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.print("]");
        return " ";
    }

    int indexOf(T data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    int lastIndexOf(T data) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    boolean isEmpty() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return true;
            }
        }
        return false;
    }

    void clear() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            arr[i] = null;
        }
    }
    public  MyList<T>  subList(int start,int finish){
        MyList<T> lidt = new MyList<>(finish - start + 1);
        for(int i = start; i < finish+1; i++){
            lidt.add(arr[i]);
        }
        return lidt;
    }
    public boolean contains(T data){
        for(T i: arr){
            if(i==data){
                return true;
            }
        } return false;

    }
    public  T[] toArray(){
        return arr;

    }
}

