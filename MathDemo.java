public class MathDemo {
    public static int min(int a , int b) {
        if (a >= b){
            return b;
        }
        else {
            return a;
        }
    }
    public static int max(int a , int b) {
        if (a >=b){
            return a;

        }
        return b;


 
    } 
    public static int sum(int[] args) {
        int sum=0;
        for (int i = 0; i < args. length; i++) {
            sum+=args[i];

        }
        return sum;
    }
        
    public static void main(String[] args) {

        System.out.println(MathDemo.min(3, 7));
        System.out.println(MathDemo.max(3, 7));
        System.out.println(MathDemo.sum(new int[]{1, 2, 3, 4}));
    

    }
}