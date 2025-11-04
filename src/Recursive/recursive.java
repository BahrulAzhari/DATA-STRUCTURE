package Recursive;

class recursive {

    public static int countdown(int n){
        if (n == 1) {
            return 1;
        }else{
            System.out.println(n);
            return countdown(n - 1);
        }
    }

    public static int faktorial(int n){
        if (n == 1) {
            return 1;
        }else{
            return n * faktorial(n - 1);
        }
    }

    public static int sum(int n){
        if (n == 1) {
            return 1;
        }else{
            return n + sum(n -1);
        }
    }

    public static int fibonaci(int n){
        if (n <= 1) {
            return n;
        }else{
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }

    public static void main(String[] args) {
        
        int n = 5;
        System.out.println("Hitung mundur " + n + " :");
        System.out.println(countdown(n));

        System.out.println("Hitung faktorial " + n + " :");
        System.out.println(faktorial(n));

        System.out.println("Hitung " + n + " => 1 :");
        System.out.println(sum(n));

        System.out.println("Hitung fibonaci " + n + " :");
        for(int i = 0; i <= n; i++){
            System.out.print(fibonaci(i) + ", ");
        }
    }
    
}