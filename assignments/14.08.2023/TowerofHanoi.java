import java.util.Scanner;

public class TowerofHanoi {

    static int count=0;
    public static void tower(int n, char start, char temp, char stop)
    {
        if (n==1){
            count++;
            System.out.println("Move disk 1 from "+ start + "->" + stop);
            return;
        }
        tower(n-1,start,stop,temp);
        count++;
        System.out.println("Move disk " + n + " from " + start+ "->" +stop);
//        tower(1,start,temp,stop);
        tower(n-1,temp,start,stop);


    }


    public static void main(String[] args)
    {

        long start = System.currentTimeMillis();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of disks:");
//        int n = sc.nextInt();
        int n =3;

        tower(n,'A','B','C');
        System.out.println("Total number of Steps: "+count);

        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Time elapsed:"+timeElapsed +"ms");

    }



}
