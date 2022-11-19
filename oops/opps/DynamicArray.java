package opps;

public class DynamicArray {
    private int data[];
    private int nextIndex;

// Constrector to create array
    public DynamicArray(){
        data = new int[5];
        nextIndex = 0;
    }

// Chacking updated size of the array
    public int size(){
       return nextIndex;
    }

// inserting element in array
    public void add(int element){
        if (nextIndex == data.length){
            reconstruct();
        }
        data[nextIndex] = element;
        nextIndex++;
    }

// Reconstruct a new array with double size and store the pervious array element to anew array 
    public void reconstruct(){
        int temp[] = data;
        data = new int[nextIndex * 2];
        for(int i = 0; i < temp.length; i++){
            data[i] = temp[i];
        }

    }

// setter to set element or update element at index
// if given index is greater than nextIndex it will not update or add elemennt at that index

    public void set(int element, int index){
        if(index > nextIndex ){ 
            return;
        }
        if(index < nextIndex){
            data[index] = element;
        }
        else{
            add(element);
        }
    }

// Getter to print element of the array
    public int get(int index){
        if(index >= nextIndex){
            //error out
            return -1;
        }
        return data[index];
    }

// Check Weather if Array is empty or not
    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

// Removing last element of array #tobe done
    public int removeLast(){
        if(size() == 0){
            //error out
            return -1;
        }
        int value = data[nextIndex - 1];
        data[nextIndex] = 0;
        nextIndex--;
        return value;

    }    

// Print Function
    public void print(){
        for(int i=0; i<data.length; i++){
            System.out.println(data[i]);
        }
    }
}
