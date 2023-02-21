import java.util.Scanner;
class AssignmentHandGame
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("plz wait game is starting");
System.out.println("1.White  2.Black");
System.out.println("Please choose from menu don't choose out of that");
int player1=sc.nextInt();
System.out.println("Please choose from menu don't choose out of that");
int player2=sc.nextInt();
System.out.println("Please choose from menu don't choose out of that");
int player3=sc.nextInt();


if(player1==1 && player2==2 && player3==2)
 System.out.println("player 1 Won");

else if(player1==1 && player2==2 && player3==1)
 System.out.println("player 2 Won");

else if(player1==1 && player2==1 && player3==2)
 System.out.println("player 3 Won");

else if(player1==2 && player2==1 && player3==1)
 System.out.println("player 1 Won");

else if(player1==2 && player2==1 && player3==2)
 System.out.println("player 2 Won");

else if(player1==2 && player2==2 && player3==1)
 System.out.println("player 3 Won");

else if(player1==1 && player2==1 && player3==1)
 System.out.println("Match Drawn");

else if(player1==2 && player2==2 && player3==2)
 System.out.println("Match Drawn");
else
 System.out.println("Invalid Input");
}
}
