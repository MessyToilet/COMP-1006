import java.util.Random;

public class StringBuildingExample{

    public static void main(String[] args){
        Random rnd = new Random("Winter 2022".hashCode());
        int size = 10000;
        if(args.length==1){
            size = Integer.parseInt(args[0]);
        }

        long tic = 0, toc = 0, time;
        System.out.println("size is " + size);
        
        // StringBuilder
        tic = System.nanoTime();
        StringBuilder s2 = new StringBuilder("");
        for(int i=0; i<size; i+=1){
            s2.append(String.valueOf(rnd.nextInt()));
        }
        String s2_string = s2.toString();
        toc = System.nanoTime();

        System.out.println("time for StringBuilder : " + (toc-tic)*1e-9 + " seconds");

        tic = System.nanoTime();
        String s1 = "";
        for(int i=0; i<size; i+=1){
            s1 += String.valueOf(rnd.nextInt());
        }
        toc = System.nanoTime();

        System.out.println("time for String        : " + (toc-tic)*1e-9 + " seconds");


        


    }

}