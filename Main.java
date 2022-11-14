/*class Recur{
    public static void main(String[] args){
        int result=sum(10);
        System.out.println(result);
    }
    public static int sum(int k){
        if (k>0){
            return k+sum(k-1);
        }
        else{
            return 0;
        }
    }

*/
public class Main {
    public static void main(String[] args) {
      int result = sum(5, 10);//adding numbers beytween 5 and 10
      System.out.println(result);
    }
    public static int sum(int start, int end) {
     //adding a halting condition
        if (end > start) {
            return end + sum(start, end - 1);
      } else {
            return end;
      }
    }
  }
