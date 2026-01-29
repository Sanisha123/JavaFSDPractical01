import java.util.*;
class Lottery {
    int num;
    Lottery(){ num=(int)(Math.random()*90)+10; }
    int prize(int u){
        int a=num/10,b=num%10,c=u/10,d=u%10;
        if(num==u) return 10000;
        if(a==d && b==c) return 3000;
        if(a==c||a==d||b==c||b==d) return 1000;
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Lottery l=new Lottery();
        System.out.println("Enter number:");
        int u=sc.nextInt();
        System.out.println("Prize Rs."+l.prize(u));
    }
}
