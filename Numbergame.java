import java.util.*;
class Numbergame{
    public static void main(String args[]){
        Random rd=new Random();
        int rn=rd.nextInt(100)+1;
        numb(rn);
    }
    public static void numb(int rn){
        Scanner t = new Scanner(System.in);
        int score=0;
        for(int i=0;i<5;i++){
        System.out.print("Enter a number between 1 to 100:");
        int n=t.nextInt();
        if(n>100){
            System.out.println("invalid number enter number below 100 ");
            numb(rn);
        }
        else if(rn==n){
            System.out.println("its correct");
            System.out.println("you have won the game");
            score = score+10;
            break;

        }
        else if(rn<n){
            System.out.println("too high");
        }
        else if(rn>n){
            System.out.println("too low");
       }  
      
    }
    System.out.println("your total score is:"+score);
    System.out.println("1.Play again"+"     "+"2.Exit");
    System.out.print("Enter your option:");
    int f=t.nextInt();
    if(f==1){
        numb(rn);
    }
    }
}