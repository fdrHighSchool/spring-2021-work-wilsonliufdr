import java.util.Arrays;

public class SuperArray{
  private int[] arr;

  public SuperArray(int size){
    this.arr = new int[size];
  } // constructor that takes in specific size

  public SuperArray(){
    this.arr = new int[10];
  } // constructor that sets the size of array to 10 by default

  public void add(int val){
    for(int i = 0; i < this.arr.length; i++){
      if(arr[i] == 0){
        arr[i] = val;
        return;
      }
    } // add value to array if array isn't filled up
    int[] temp = new int[this.arr.length + 1];
    for(int i = 0; i < this.arr.length; i++){
      temp[i] = arr[i];
    }
    temp[temp.length - 1] = val;
    arr = new int[temp.length];
    arr = temp;
  } // make a new temporary array with an increased index if it's filled up and add value to array

  public void add(int index, int val){
    int[] temp = new int[this.arr.length + 1];
    for(int i = 0; i < index; i++){
      temp[i] = arr[i];
    } // temporary array with same element as arr[i] but with increased index
    temp[index] = val;
    for(int i = index; i < this.arr.length; i++){
      temp[i + 1] = arr[i];
    } // value is added to specific index
    arr = new int[temp.length];
    arr = temp;
  } // temp array is applied to arr

  public void grow(int n){
    int[] temp = new int[this.arr.length + n];
    for(int i = 0; i < this.arr.length; i++){
      temp[i] = arr[i];
    } // temporary array with same element as arr[i] but with increased index
    arr = new int[temp.length];
    arr = temp;
  } // temporary array is applied to arr

  public void set(int i, int val){
    this.arr[i] = val;
  } // set value to a specific index

  public boolean isEmpty(){
    for(int i = 0; i < this.arr.length; i++){
      if(arr[i] != 0){
        return false;
      }
    } // Check the array for zeros, if all equals zero it is empty if not it's not empty
    return true;
  }

  public void remove(int index){
    int[] temp = new int[this.arr.length - 1];
    for(int i = 0, k = 0; i < this.arr.length; i++){
      if(i != index){
        temp[k] = arr[i];
        k++;
      }
    } // removes specific index from array and shifts all values down
    arr = new int[temp.length];
    arr = temp;
  } // temporary array is applied to arr

  public String toString(){
    return Arrays.toString(this.arr);
  }
}
