import java.util.Scanner; 

public class Lab423 {
   public static void main(String[] args) {
      
    Scanner scnr = new Scanner(System.in);
    int count = 0;
    int max = 0;
    int min = 0;
    int sum = 0;
    int num = scnr.nextInt();
    boolean posInts = false;
	   double avg;
    // try{
    //    if (num < 0){
    //       num = scnr.nextInt();
    //    } else {
    //    while (num >= 0){
    //        count ++;
    //        posInts = true;
    //        sum += num;
    //        max = Math.max(max, num);
    //        min = Math.min(min, num);
    //        num = scnr.nextInt();
    //        if (num < 0){
    //           num = scnr.nextInt();
    //        } 
           
    //    }  
    //    }
    // } catch (Exception e) {
    //      int sumWo;
    //      double avg;
       
    //      if (posInts = false || count <= 2){
    //         sumWo = 0;
    //         avg = 0.00;
    //      } else {
    //      count -= 2;
    //      min = (min < 0) ? 0 : min;
    //      max = (max < 0) ? 0 : max;
    //      sumWo = (sum - max - min);
    //      avg = ((double)sumWo/(double)count);
    //      }
         
    //      System.out.print(sumWo + " ");
    //      System.out.printf("%.2f\n", avg);
         
    // }
	   num = scnr.nextInt();
	   while (num  >= 0) {
	         min = (min > num) ? num : min;
	         max = (max < num) ? num : max;
			 sum += num;
	         count++;
	   System.out.println(num + " " + count);
	         // sumWo = (sum - max - min);
	         // avg = ((double)sumWo/(double)count);
		   num = scnr.nextInt();
       }
	   System.out.println(count);
	   if (count <= 2) {
			sum = 0;
			avg = 0.0;
		} else {
			sum = sum - min - max;
			avg = sum / (double) (count - 2);
		}
         
         System.out.print(sum + " ");
         System.out.printf("%.2f\n", avg);
   }
}
