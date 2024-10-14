import java.util.Scanner;

public class invertedHalfPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int h=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==h)
                {
                    for(int k=0;k<=h;k++)
                    {
                        System.out.print("* ");
                    }
                }
            }
            h--;
            System.out.print("\n");
        }
    }
}
