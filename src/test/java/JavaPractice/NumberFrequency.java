package JavaPractice;

public class NumberFrequency {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 7, 4, 7, 3, 9, 0, 1, 5, 7, 8, 5, 7, 2};
        int[] frequency = new int[numbers.length];

        int count =1;
        for (int i=0; i<numbers.length; i++){
           for(int j=i+1; j<numbers.length; j++){
              // System.out.print(" i= " +numbers[i]);
               //System.out.println("  j= " + numbers[j]);
               if (numbers[i] == numbers[j]){
                   count++;
                   //System.out.println("loop"+i+"s " + count);
               }
               frequency[i] = count;
           }
        }

        for (int element : frequency){
            System.out.println(element);
        }

       // System.out.println(count);
    }
}