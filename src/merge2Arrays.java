import java.util.Arrays;

public class merge2Arrays {


    public static int[] merge(int[] array1, int[] array2){

        int[] mergedArray = new int[array1.length+array2.length];
        int i=0;
        int k=0;
        if(array1.length>array2.length){
            for( i=0; i<array2.length; i++){
                mergedArray[k]=array1[i];
                k+=2;
            }
            for(i=array2.length; i<array1.length; i++){
                mergedArray[k]=array1[i];
                k++;
            }
            k=1;
            for( i=0; i<array2.length; i++){
                mergedArray[k]=array2[i];
                k+=2;
            }
        }else if(array2.length>array1.length){
            for( i=0; i<array1.length; i++){
                mergedArray[k]=array1[i];
                k+=2;
            }
            k=1;
            for( i=0; i<array1.length; i++){
                mergedArray[k]=array2[i];
                k+=2;
            }
            k=array1.length*2;
            for(i=array1.length; i<array2.length; i++){
                mergedArray[k]=array2[i];
                k++;
            }

        }else{
            for( i=0; i<array1.length; i++){
                mergedArray[k]=array1[i];
                mergedArray[k+=1]=array2[i];
                k++;
            }

        }

        System.out.println(Arrays.toString(mergedArray));
        return mergedArray;
    }
    public static void main(String[] args) {
        int[] array1= {1,2,3};
        int[] array2= {6,7,8,9,10};
        merge(array1,array2);

    }
}
