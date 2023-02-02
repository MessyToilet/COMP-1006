// 
public class Peaks{
    public static int numPeaks(int[] data){
        // returns the number of "peaks" in the input data
        return peaks(data).length;
    }

    public static int[] peaks(int[] data){
        // returns the locations of all peaks in the input data
        int[][] locations2D = new int[data.length][];

        int[] locations = new int[data.length];
        //if array length 1, then peak
        if (data[0] > data[1]) {//if first is peak
            locations[0] = 0;
            locations2D[0] = new int[]{0};
        }
        for (int i = 1; i < data.length; i++) {
            if ((data[i - 1] < data[i]) && (data[i] < data[i+1])) {//if any num is greater than the num before and after
                locations[i] = i;
                locations2D[i] = new int[locations2D[i - 1].length + 1];
                for (int k = 1; k < locations2D[i - 1].length; i++) {
                    locations2D[i][k] = locations2D[i][k];
                }
                locations2D[i][locations2D[i].length - 1] = i;
            }
            else{
                for (int k = 1; k < locations2D[i-1].length; i++) {
                    locations2D[i][k] = locations2D[i - 1][k];
                }
            }
        }
        if (data[data.length - 1] > data[data.length - 2]) {//if last is peak
            locations[data.length - 1] = data.length - 1;
        }
        return locations;
    }

    public static int[][] minmax(int[] data){
        // finds the min and max values (and all their locations)
        int[][] locations = new int[data.length][1];
        if (data[0] < data[1]) {
            locations[0][0] = data[0];
            locations[0][1] = 0;
        }
        for (int i = 1; i < data.length; i++) {
            if ((data[i - 1] < data[i]) && (data[i] < data[i+1])) {
                locations[i][0] = data[i];
                locations[i][1] = i;
            }
        }
        if (data[data.length - 1] > data[data.length - 2]) {
            locations[data.length - 1][0] = data[data.length - 1];
            locations[data.length - 1][1] = data.length - 1;
        }
        return locations;   
    }

    public static void main(String[] args){
      // you can use this to help test your code
      
        int[] test_one = new int[]{5,-1};
        int test_numpeaks = 1;                                          //num of peaks

        System.out.println("Array     : " + java.util.Arrays.toString(test_one));
        System.out.println("Peaks     : " + (numPeaks(test_one)));
        System.out.println("Peaks     : " + test_numpeaks);


        
    }
}