
package ejemplo;
import java.io.*;
import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {
        
        int num, control;
        int sumaDiv=0;
        int contDiv=0;
        
        Scanner r=new Scanner(System.in);
        
        do
        {
        System.out.println("Dígite un número");
        num=r.nextInt();
        
        for(int i=1;i<=(num/2);i++)
        {
            if((num%i)==0)
            {
                sumaDiv+=i;
                
            }
        }
        
        for(int i=1;i<=num;i++)
        {
            if((num%i)==0)
            {
                contDiv++;
            }
        }
        
        if(contDiv==2)
            System.out.println("Es un numero primo.");
        else
            System.out.println("NO un numero primo. Divisores: "+contDiv);
        
            
        if(num==sumaDiv)
            System.out.println("Es un numero perfecto. Suma divisores: "+sumaDiv);
        else
            System.out.println("NO es un numero perfecto. Suma divisores: "+sumaDiv);
        
        System.out.println("\nDígite 0 (cero) para terminar.\tDígite 1 (uno) para continuar.");
        control=r.nextInt();
        num=0;
        contDiv=0;
        sumaDiv=0;
        }while(control!=0);
        
    }
}
