public class factorialClass {

    public static long calcFactorial(int x)
    {
        long fact = x;
        while (x > 1)
        {
            x --;
            fact *= x;
        }
        return fact;
    }

    public static double calcE()
    {
        double e = 1;
        double olde = 0;
        int count = 1;
        while (e - olde > 0.001)
        {
            olde = e;
            e = e + (1.0 / ( calcFactorial(count)));
            count ++;
         //   System.out.println(e + " " + count); test code
        }
        return e;
    }

    public static double calcEX(int x)
    {
        double e = 1;
        double olde = 0;
        int count = 1;
        while (e - olde > 0.0001)
        {
            olde = e;
            e = e + ((Math.pow(x, count)) / ( calcFactorial(count)));
            count ++;
            //   System.out.println(e + " " + count); test code
        }
        return e;
    }

    public static void main(String[] args)
    {
        for (int count = 1; count <= 20; count ++)
        {
            System.out.println(calcFactorial(count));
        }
        System.out.printf("e is %2.3f \n", calcE());
        for (int count = 1; count <= 5; count ++)
        {
            System.out.printf("e^" + count + " is %2.3f \n", calcEX(count));
        }
    }
}
