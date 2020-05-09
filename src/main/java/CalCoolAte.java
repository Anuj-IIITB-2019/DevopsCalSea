import java.util.Scanner;

public class CalCoolAte {
    int add(int a ,int b)
    {
        return a+b;
    }
    int subtract(int a,int b)
    {
        return a-b;
    }
    int  multiply(int a ,int b)
    { return a*b; }
    int divide(int a, int b)
    {return a/b; }

   public static void main(String[] args)
   {
        CalCoolAte obj = new CalCoolAte();
       Scanner sc = new Scanner(System.in);
       int res=0;

       boolean iterIsFirst = true;
       System.out.println("Enter operation to perform \n a - Add \n s - Subtract \n m - Multiply \n d - Divide");
          char ch= sc.next().charAt(0);
       while(ch!='q')
       {
           int a;
           int b;
           if(iterIsFirst)
           {
               System.out.println("enter 1st number");
               a = sc.nextInt();
               System.out.println("enter 2nd number");
               b = sc.nextInt();
               iterIsFirst = false;
           }
           else
           { a = res;
           System.out.println("previous result will be used as first number in the calculation \n To start a new calculation quit the program \n enter second number to perform current calc");
           b=sc.nextInt();
           }

           switch (ch){
               case 'a':
                   res = obj.add(a,b);
                   break;
               case 's':
                   res = obj.subtract(a,b);
                   break;
               case 'm':
                   res = obj.multiply(a,b);
                   break;
               case 'd':
                   while(b==0){
                       System.out.println("error :division by zero ");
                        b= sc.nextInt();}
                   res = obj.divide(a,b);
                   break;
               case 'q':
                   break;
               default:
                   System.out.println("kindly choose an operation to calculate");
                   System.out.println("if u want to quit calculating press q or Q");

                   break;

           }
           System.out.println("your current result is "+res);
           ch =sc.next().charAt(0);
       }
   }


}
