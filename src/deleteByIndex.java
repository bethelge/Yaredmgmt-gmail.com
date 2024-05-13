//question 6
import java.util.Arrays;

//question 6
public class deleteByIndex {
    public static void main(String[] args){
        int[] array = {3,7,1,9,4};
        int indexToDelete = 2;
        deleteByIndex newArray = new deleteByIndex();
        newArray.deleteElement(array,indexToDelete);
       // System.out.println(Arrays.toString(array));
    }
    public void deleteElement(int[] array , int indexToDelete){
        int[] newArray = new int[array.length-1];
        for(int i = 0;i<indexToDelete;i++){
            if(indexToDelete>array.length || indexToDelete<array.length ){
                System.out.println("Invalid index");
                System.out.println(Arrays.toString(array));
                break;
            }else{
                newArray[i] = array[i];
                //break;

            }


            }
        for(int i = indexToDelete;i<array.length;i++){
            newArray[i-1] = array[i];
        }
        System.out.println(Arrays.toString(newArray));

    }

}
