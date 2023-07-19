import java.util.*;
public class noblenum {
    public int math(int a[], int b) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < b; i++) {
            if (a[i] == a[1]) ;
            {
                sum = i;
            }}
            return count;
        }


    public static void main(String[] args)
        {
        Scanner sc=new Scanner(System.in);
        noblenum nwm=new noblenum();
        int b=sc.nextInt();
        int a[]=new int[b];
        for(int i=0;i<b;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
            System.out.println(nwm.math(a,b));
    }}



