
// display SUM factor of a given num

public class cls_example_29 {
    public static void main (String[] args)
    {
        int num = 6;
        int sum = 0;
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
               sum = sum + i;
            }
        }
        System.out.print(sum);

    }
}
