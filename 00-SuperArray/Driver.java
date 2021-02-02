public class Driver{
  public static void main(String[] args){
    SuperArray arr1 = new SuperArray(9);
    System.out.println(arr1.isEmpty());
    arr1.add(1);
    arr1.add(2);
    arr1.add(3);
    arr1.add(4);
    arr1.add(5);
    arr1.add(6);
    arr1.add(7);
    arr1.add(8);
    arr1.add(10);
    System.out.println(arr1);
    arr1.add(8, 9);
    System.out.println(arr1);
    arr1.grow(1);
    arr1.add(11);
    System.out.println(arr1);
    arr1.set(0, 100);
    System.out.println(arr1);
    arr1.remove(0);
    System.out.println(arr1);
  }
}
