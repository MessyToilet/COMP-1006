// 
public class Peaks{
    public static int numPeaks(int[] data){
        // returns the number of "peaks" in the input data
        return peaks(data).length;
    }

    public static int[] peaks(int[] data){
        // returns the locations of all peaks in the input data
        int[] locations = new int[data.length];
        if (data[0] > data[1]) {
            locations[0] = 0;
        }
        for (int i = 1; i < data.length; i++) {
            if ((data[i - 1] < data[i]) && (data[i] < data[i+1])) {
                locations[i] = i;
            }
        }
        if (data[data.length - 1] > data[data.length - 2]) {
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

    }
}