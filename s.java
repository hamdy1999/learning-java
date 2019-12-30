public class s
{
    public static void main(String[] args) {
    }

    static int RecursiveSum(int n , int[] arr) {
        if (n == 1)
            return 0;
         else
            return arr[n-1] + RecursiveSum(n - 1, arr);

    }

    static boolean majourity(boolean a, boolean b, boolean c){
        int count = 0;
        if (a==true) count++;// it may replaced by if(a) count++;
        if (b==true) count++;
        if (c==true) count++;

        if (count >= 2)
            return true;
        else
            return false;
    }

    static boolean odd(boolean a, boolean b, boolean c){
        int count = 0;
        if (a==true) count++;// it may replaced by if(a) count++;
        if (b==true) count++;
        if (c==true) count++;
        if (count % 2 == 0)
            return false;
        else
            return true;
    }

    static boolean eq(int[] a, int[] b){
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++)
                if (a[i] != b[i])
                    return false;
            return true;
        }
        else
            return  false;
    }

    static double lg(double N){
        return Math.log10(N)/Math.log10(2);
    }

    static  double Max(double[] N){
        double Max = N[0];
        for (int i =0; i< N.length; i++)
        {
            if (N[i] > Max)
                Max = N[i];
        }
        return Max;
    }

    static  double Min(double[] N){
        double Min = N[0];
        for (int i =0; i < N.length; i++)
        {
            if (N[i] < Min)
                Min = N[i];
        }
        return Min;
    }

    static  double[] rescalator(double[] N) {
        for (int i =0; i< N.length; i++)
            N[i] = (N[i] - Min(N))/ (Max(N) - Min(N));
        return N;
    }

}