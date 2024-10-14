import java.util.*;

public class halfPyramid 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    for(int h=0;h<=j;h++)
                    {
                        System.out.print("* ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}