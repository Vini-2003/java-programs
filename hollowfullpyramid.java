import java.util.Scanner;

public class hollowfullpyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int h=((2*n))/2;
        int m=h;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<=(2*n)-1;j++)
            {
                if(j==h ||j==m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            m--;
            h++;
            System.out.print("\n");
        }
        for(int i=n-1;i<2*n-1;i++){
            System.out.print(" *");
        }

    }
}
