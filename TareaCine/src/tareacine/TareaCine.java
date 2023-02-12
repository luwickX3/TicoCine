package tareacine;
import java.util.Scanner;
public class TareaCine 
{

    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner(System.in);
        int N;
        int Array1[];
        System.out.print("Ingrese la cantidad de asientos disponibles:");
        N = Scan.nextInt();
        Array1 = new int [N];
        for(int i = 0; i<N;i++)
        {
            System.out.println("ingrese numero de asiento: "+(i+1));
            Array1[i] = Scan.nextInt();
        }
        for (int i = 0; i<N; i++)
        {
            if (Array1[i] == 1)
            {
                Array1[i]=0;
            }  
        }
        for (int i = 0; i<N; i++)
        {
            for (int j = 0; j<N; j++)
            {
                if(Array1[i] == 0 && Array1[j] != 0)
                {
                    Array1[i] = Array1[j];
                    Array1[j] = 0;
                }
            }
        }
        System.out.print(Array1[0]);
        for(int i = 1; i <N; i++)
        {
            System.out.print(Array1[i]);
        }
    }
    
}
