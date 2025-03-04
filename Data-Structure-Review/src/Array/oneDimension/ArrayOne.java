package Array.oneDimension;

public class ArrayOne {
    public static void main(String[] args) {
        //Declare and create array
        int[] number = new int[5];

        //Declare array with values
        int [] value = {1,2,3,4,9};

        //Modify value inside of array
        value[2] = 16;

        //Array with loop
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
    }//main
}//class
