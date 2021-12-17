public class CleanCode {
    // static class for smallest number and largest number
    static class NumberToCheck{
        int SmallestNumber;
        int LargestNumber;
    }

    // method for the Largest and Smallest numbers in a given array
    static NumberToCheck findLargestSmallest (int[] array, int sizeArray){

        NumberToCheck objCheck = new NumberToCheck();

        int TempNumber;

        if (sizeArray == 1) {
            objCheck.LargestNumber = array[0];
            objCheck.SmallestNumber = array[0];
            return objCheck;
        }

        if (array[0] > array[1]) {
            objCheck.LargestNumber = array[0];
            objCheck.SmallestNumber = array[1];
        }
        else {
            objCheck.LargestNumber = array[1];
            objCheck.SmallestNumber = array[0];
        }

        for (TempNumber = 2; TempNumber < sizeArray; TempNumber++) {

            if (array[TempNumber] > objCheck.LargestNumber) {
                objCheck.LargestNumber = array[TempNumber];
            }
            else if (array[TempNumber] < objCheck.SmallestNumber) {
                objCheck.SmallestNumber = array[TempNumber];
            }
        }

        return objCheck;
    }

    //Main Method
    public static void main(String args[]){

        int givenArray[] = {1000, 11, 445, 1, 330, 3000};
        int arraySize = 6;

        // Method Calling
        NumberToCheck objCheck = findLargestSmallest(givenArray,arraySize);

        System.out.printf("CLEAN CODE ASSIGNMENT COMPILED BY RANU RAJPUT\n");
        // printing the given array
        System.out.printf("Given Array -->\n");
        for (int tempNum = 0; tempNum < arraySize; tempNum++){
            System.out.printf(givenArray[tempNum] + " ");
        }


        // print the  Smallest Number
        System.out.printf("\nThe Smallest Number in the given array is %d", objCheck.SmallestNumber);
        //print the Largest number
        System.out.printf("\nThe Largest Number in the given array is %d\n", objCheck.LargestNumber);
    }

}
