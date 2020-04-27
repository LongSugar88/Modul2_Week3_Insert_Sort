public class Insertion_Sort<T extends Comparable> {
    public T[] sort(T[] myArray){
        for(int i=0; i< myArray.length; i++){
            int position = i;
            for(int j = i+1; j > 0; j--){
                if(myArray[j].compareTo(myArray[i]) < 0){
                    position = j;
                }
            }
            T token = myArray[position];
            for(int k= position; k > i ; k-- ){
                myArray[k] = myArray[k-1];
            }
            myArray[i] = token;
//            print(myArray);
        }
        return myArray;
    }
    public void print(T[] myArray){
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i] + "");
        }
        System.out.println();
    }
}
