import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        for(int d=0;d<T;d++)
        {
        int K,N;
        ArrayList<Integer> a=new ArrayList<>();

        N=scan.nextInt();
        K=scan.nextInt();
        for(int i=0;i<N;i++)
        {
            int b=scan.nextInt();
            a.add(b);
        }
        a=sort(a,N);
        int y=a.get(K-1);
        int q=y;
        int s=a.indexOf(q);
        while(a.get(s)==a.get(s+1))
        {
            s=s+1;   
        }
        s++;
        System.out.println(s);
        }
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> a,int N)
    {
     ArrayList<Integer> b=a;  
     for(int k=0;k<N;k++)
     {
     for(int j=0;j<N-1;j++)
     {
        if(b.get(j)<b.get(j+1))
        {
            int m=b.get(j);
            b.set(j,b.get(j+1));
            b.set(j+1,m);
        }
     }
     }
        return b;
    }
    }
