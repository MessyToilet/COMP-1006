// 
public class Peaks{
    public static int numPeaks(int[] data){
        // returns the number of "peaks" in the input data
        return peaks(data).length;
    }

    public static int[] peaks(int[] data){
        // returns the locations of all peaks in the input data
        System.out.println("Data: " + java.util.Arrays.toString(data));
        if (data.length == 1) {             //If data is one number
            return data;                    //Return one number
        }
        else if (data.length == 2) {        //If data is two numbers
            if (data[0] > data[1]) {        //And if first num > second num
                return new int[]{0};        //Return first num
            }
            else if (data[1] > data[0]) {   //Or if second num > first num
                return new int[]{1};        //Return second num
            }
            else {
                return new int[]{};         //Else return empty
            }
        }
        else if (data.length == 3 && data[1] > data[0] && data[1] > data[2]) {
            return new int[]{1};
        } 
        else {                                  //If data is three or more

            int count   = 0;                    //Init count var for array len
            int count2  = 0;
            if (data[0] > data[1]) {            //If data one is bigger than two
                count2   += 1;
            }
            if (data[data.length - 1] > data[data.length - 2]) {        //If data is two numbers
                count += 1;
            }            
            for (int i = 1; i < data.length - 1; i++) {                 //Iterate from second ele to second last ele
                if (data[i] > data[i - 1] && data[i] > data[i + 1]) {   //check if num is bigger than previous and next
                    count += 1;
                }
            }
            int[] locations = new int[count + count2];
            //System.out.println("Passed checks, count: " + count + " Array: " + java.util.Arrays.toString(locations));
            if (data[0] > data[1]) {            //If data one is bigger than two
                locations[0] = 0;
                //System.out.println("First is bigger + " + java.util.Arrays.toString(locations));
            }
            if (count2 == 0) {
                count = 0;
            }
            else {
                count = 1;
            }
            //System.out.println("Count: " + count);
            //System.out.println("Begin Iteration for " + (data.length - 1) + " times");        
            for (int i = 1; i < data.length - 1; i++) {                 //Iterate from second ele to second last ele
                //System.out.println("Iterating... " + i + " Data: " + data[i]);
                if (data[i] > data[i - 1] && data[i] > data[i + 1]) {   //check if num is bigger than previous and next    
                    locations[count] = i;
                    //System.out.println("Middle is bigger + " + java.util.Arrays.toString(locations));
                    count   += 1;
                }
            }           
            if (data[data.length - 1] > data[data.length - 2]) {        //If data is two numbers
                //System.out.println("Adding Last...");
                locations[locations.length - 1] = data.length - 1;
                //System.out.println("Last is bigger + " + java.util.Arrays.toString(locations));
            }
            return locations; 
        }
    }

    public static int[][] minmax(int[] data){
        // finds the min and max values (and all their locations)
        //Future me, iterate through data set as like method above, then grab location and value.
        System.out.println("Data      : " + java.util.Arrays.toString(data));
        System.out.println("Size      : " + data.length);

        if (data.length == 1) {
            return new int[][]{{data[0], 0}, {data[0], 0}};       //return if one ele
        }
        if (data.length == 2) {
            if (data[0] < data[1]) {
                return new int[][]{{data[0], 0}, {data[1], 1}}; //return if first is smaller
            }
            else if (data[1] < data[0]) {
                return new int[][]{{data[1], 1}, {data[0], 0}}; //return if first is smaller
            }
            else {
                return new int[][]{};
            }
        }

        int min = data[0];
        int max = data[0];        //init place holder vars

        int min_count = 0;
        int max_count = 0;

        for (int i = 0; i < data.length; i++) {     //Find max/min
            if (data[i] > max) {
                max = data[i];
            }
            if (data[i] < min) {
                min = data[i];
            }
        }
        for (int i = 0; i < data.length; i++) {     //coun max/min
            if (data[i] == max) {            
                max_count += 1;
            }
            if (data[i] == min) {
                min_count += 1;
            }
        }


        int[] max_pos = new int[max_count + 1];
        int[] min_pos = new int[min_count + 1];
        max_pos[0] = max;
        min_pos[0] = min;
        max_count = 1;
        min_count = 1;

        for (int i = 0; i < data.length; i++){
            if (data[i] == max){
                max_pos[max_count] = i;
                max_count += 1;
            }
            if (data[i] == min){
                min_pos[min_count] = i;
                min_count += 1;
            }
        }

        return new int[][]{min_pos, max_pos};   
    }

    public static void main(String[] args){
      // you can use this to help test your code
      
        int[] test_one = new int[]{2, 16, 2, 16, 2, 16, 2};
                                            //num of peaks

        System.out.println("Array     : " + java.util.Arrays.toString(test_one));
        System.out.println("Peaks     : " + (java.util.Arrays.deepToString(minmax(test_one))));



        
    }
}