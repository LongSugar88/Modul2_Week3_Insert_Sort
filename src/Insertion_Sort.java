
public class Insertion_Sort<T extends Comparable> {
    int count = 1;
    public T[] sort(T[] myArray){
        for(int i=0; i< myArray.length; i++){
            int position = i;
            for(int j = i-1; j >= 0; j--){
                if(myArray[i].compareTo(myArray[j]) < 0){
                    position = j;
                }
            }
            T token = myArray[i];
            for(int k= i; k > position ; k-- ){
                myArray[k] = myArray[k-1];
            }
            myArray[position] = token;
            print(myArray);
        }
        return myArray;
    }
    public void print(T[] myArray){
        System.out.println("Lần " + count);
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        count++;
    }
}