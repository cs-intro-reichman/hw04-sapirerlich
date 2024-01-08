public class ArrayOps {
    public static void main(String[] args) {
        int[] array1 = {3 ,-2 ,1};
        boolean is_sorted = isSorted(array1);
        System.out.println(is_sorted);
        
    }
    
    public static int findMissingInt (int [] array) {
        int counter = 0;
        for (int i = 0 ; i <= array.length ; i++){
            counter = 0;
            for (int j = 0 ; j < array.length ; j++){
                if (array[j] == i){
                    counter++;
                    
                }
            }
            if (counter == 0){
                return i;
            }

        }
        return -1;
    }


public static int MinValue(int [] array) {
        int min = array[0];
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] < min){
                min = array[i];
            }

        }
        return min;
    }

    public static int MaxValue(int [] array) {
        int max = MinValue(array);
        for (int i = 0 ; i <array.length ; i++){
            if (array[i] > max){
                max = array[i];
            }

        }
        return max;
    }


    public static int secondMaxValue(int [] array) {
        int max = MaxValue(array);
        int second_max = MinValue(array);
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] > second_max && array[i] != max){
                second_max = array[i];
            }
            
        }
        return second_max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int counter = 0;
        for (int i = 0 ; i < array1.length ; i++){
            counter = 0;
            for(int j = 0 ; j < array2.length ; j++){
                if(array2[j] == array1[i]){
                    counter++;
                }
        

            }
            if (counter == 0){
            return false;
            }

        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        if (isSorted_decreasingly(array) || isSorted_increasingly(array)){
            return true;
        }
        return false;
    }

    public static boolean isSorted_decreasingly(int [] array) {
        int counter = 0;
        for (int i = 0 ; i < array.length-1 ; i++){
            if (array[i] >= array[i+1]){
                counter++;
            }

        }
        if (counter == array.length-1){
            return true;
        }
        return false;
    }

    public static boolean isSorted_increasingly(int [] array) {
        int counter = 0;
        for (int i = 0 ; i < array.length-1 ; i++){
            if (array[i] <= array[i+1]){
                counter++;
            }

        }
        if (counter == array.length-1){
            return true;
        }
        return false;
    }

}








