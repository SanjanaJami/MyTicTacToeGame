import java.util.Scanner;
class TicTacToe1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("***welcome to Tic-Tac-Toe***");
		System.out.println("Hi player1, enter your name");
		String name=scan.next();
		System.out.println("Hi player2, enter your name");
		String name1=scan.next();
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print("-");
			}
			System.out.println();
		}
		System.out.println("***"+name+" will use x***");
		System.out.println("***"+name1+" will use o***");
		System.out.println();
		System.out.println("press 1 for player1");
		System.out.println("press 2 for player2");
		System.out.println();
		System.out.println("***player1 turn***"); //1
		char space11='-';
		char space12='-';
		char space13='-';
		char space21='-';
		char space22='-';
		char space23='-';
		char space31='-';
		char space32='-';
		char space33='-';
		System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
			System.out.println("enter row");
		int row=scan.nextInt();
		System.out.println("enter column");
		int column=scan.nextInt();
		if(row==1&&column==1)
		{
			space11='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==2)
		{
			space12='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==3)
		{
			space13='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==1)
		{
			space21='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==2)
		{
			space22='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==3)
		{
			space23='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==1)
		{
			space31='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==2)
		{
			space32='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==3)
		{
			space33='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		System.out.println("***player2 turn***"); //1
		System.out.println("enter row");
		row=scan.nextInt();
		System.out.println("enter column");
		column=scan.nextInt();
		if(row==1&&column==1)
		{
			space11='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==2)
		{
			space12='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==3)
		{
			space13='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==1)
		{
			space21='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==2)
		{
			space22='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==3)
		{
			space23='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==1)
		{
			space31='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==2)
		{
			space32='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==3)
		{
			space33='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		System.out.println("***player1 turn***"); //2
		System.out.println("enter row");
		row=scan.nextInt();
		System.out.println("enter column");
		column=scan.nextInt();
		if(row==1&&column==1)
		{
			space11='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==2)
		{
			space12='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==3)
		{
			space13='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==1)
		{
			space21='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==2)
		{
			space22='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==3)
		{
			space23='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==1)
		{
			space31='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==2)
		{
			space32='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==3)
		{
			space33='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		System.out.println("***player2 turn***");  //2
		System.out.println("enter row");
		row=scan.nextInt();
		System.out.println("enter column");
		column=scan.nextInt();
		if(row==1&&column==1)
		{
			space11='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==2)
		{
			space12='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==3)
		{
			space13='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==1)
		{
			space21='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==2)
		{
			space22='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==3)
		{
			space23='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==1)
		{
			space31='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==2)
		{
			space32='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==3)
		{
			space33='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		System.out.println("***player1 turn***");  //3
		System.out.println("enter row");
		row=scan.nextInt();
		System.out.println("enter column");
		column=scan.nextInt();
		if(row==1&&column==1)
		{
			space11='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==2)
		{
			space12='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==3)
		{
			space13='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==1)
		{
			space21='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==2)
		{
			space22='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==3)
		{
			space23='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==1)
		{
			space31='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==2)
		{
			space32='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==3)
		{
			space33='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		if((space11==space12)&&(space12==space13)&&(space13==space11))
		{
			System.out.println(""+name+" has won");
		}
		else if((space21==space22)&&(space22==space23)&&(space23==space21))		
		{
			System.out.println(""+name+" has won");
		}
		else if((space31==space32)&&(space32==space33)&&(space33==space31))
		{
			System.out.println(""+name+" has won");
		}
		else if((space11==space21)&&(space21==space31)&&(space31==space11))
		{
			System.out.println(""+name+" has won");
		}
		else if((space12==space22)&&(space22==space32)&&(space32==space12))
		{
			System.out.println(""+name+" has won");
		}
		else if((space13==space23)&&(space23==space33)&&(space33==space13))
		{
			System.out.println(""+name+" has won");
		}
		else if((space11==space22)&&(space22==space33)&&(space33==space11))
		{
			System.out.println(""+name+" has won");
		}
		else if((space13==space22)&&(space22==space31)&&(space31==space13))
		{
			System.out.println(""+name+" has won");
		}
		System.out.println("***player2 turn***"); //3
		System.out.println("enter row");
		row=scan.nextInt();
		System.out.println("enter column");
		column=scan.nextInt();
		if(row==1&&column==1)
		{
			space11='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==2)
		{
			space12='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==3)
		{
			space13='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==1)
		{
			space21='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==2)
		{
			space22='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==3)
		{
			space23='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==1)
		{
			space31='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==2)
		{
			space32='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==3)
		{
			space33='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		if((space11==space12)&&(space12==space13)&&(space13==space11))
		{
			System.out.println(""+name1+" has won");
		}
		else if((space21==space22)&&(space22==space23)&&(space23==space21))		
		{
			System.out.println(""+name1+" has won");
		}
		else if((space31==space32)&&(space32==space33)&&(space33==space31))
		{
			System.out.println(""+name1+" has won");
		}
		else if((space11==space21)&&(space21==space31)&&(space31==space11))
		{
			System.out.println(""+name1+" has won");
		}
		else if((space12==space22)&&(space22==space32)&&(space32==space12))
		{
			System.out.println(""+name1+" has won");
		}
		else if((space13==space23)&&(space23==space33)&&(space33==space13))
		{
			System.out.println(""+name1+" has won");
		}
		else if((space11==space22)&&(space22==space33)&&(space33==space11))
		{
			System.out.println(""+name1+" has won");
		}
		else if((space13==space22)&&(space22==space31)&&(space31==space13))
		{
			System.out.println(""+name1+" has won");
		}
		System.out.println("***player1 turn***"); //4
		System.out.println("enter row");
		row=scan.nextInt();
		System.out.println("enter column");
		column=scan.nextInt();
		if(row==1&&column==1)
		{
			space11='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==2)
		{
			space12='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==3)
		{
			space13='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==1)
		{
			space21='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==2)
		{
			space22='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==3)
		{
			space23='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==1)
		{
			space31='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==2)
		{
			space32='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==3)
		{
			space33='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		if((space11==space12)&&(space12==space13)&&(space13==space11))
		{
			System.out.println(""+name+" has won");
		}
		else if((space21==space22)&&(space22==space23)&&(space23==space21))		
		{
			System.out.println(""+name+" has won");
		}
		else if((space31==space32)&&(space32==space33)&&(space33==space31))
		{
			System.out.println(""+name+" has won");
		}
		else if((space11==space21)&&(space21==space31)&&(space31==space11))
		{
			System.out.println(""+name+" has won");
		}
		else if((space12==space22)&&(space22==space32)&&(space32==space12))
		{
			System.out.println(""+name+" has won");
		}
		else if((space13==space23)&&(space23==space33)&&(space33==space13))
		{
			System.out.println(""+name+" has won");
		}
		else if((space11==space22)&&(space22==space33)&&(space33==space11))
		{
			System.out.println(""+name+" has won");
		}
		else if((space13==space22)&&(space22==space31)&&(space31==space13))
		{
			System.out.println(""+name+" has won");
		}
		System.out.println("***player2 turn***"); //4
		System.out.println("enter row");
		row=scan.nextInt();
		System.out.println("enter column");
		column=scan.nextInt();
		if(row==1&&column==1)
		{
			space11='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==2)
		{
			space12='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==3)
		{
			space13='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==1)
		{
			space21='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==2)
		{
			space22='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==3)
		{
			space23='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==1)
		{
			space31='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==2)
		{
			space32='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==3)
		{
			space33='o';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		if((space11==space12)&&(space12==space13)&&(space13==space11))
		{
			System.out.println(""+name1+" has won");
		}
		else if((space21==space22)&&(space22==space23)&&(space23==space21))		
		{
			System.out.println(""+name1+" has won");
		}
		else if((space31==space32)&&(space32==space33)&&(space33==space31))
		{
			System.out.println(""+name1+" has won");
		}
		else if((space11==space21)&&(space21==space31)&&(space31==space11))
		{
			System.out.println(""+name1+" has won");
		}
		else if((space12==space22)&&(space22==space32)&&(space32==space12))
		{
			System.out.println(""+name1+" has won");
		}
		else if((space13==space23)&&(space23==space33)&&(space33==space13))
		{
			System.out.println(""+name1+" has won");
		}
		else if((space11==space22)&&(space22==space33)&&(space33==space11))
		{
			System.out.println(""+name1+" has won");
		}
		else if((space13==space22)&&(space22==space31)&&(space31==space13))
		{
			System.out.println(""+name1+" has won");
		}
		System.out.println("***player1 turn***"); //5
		System.out.println("enter row");
		row=scan.nextInt();
		System.out.println("enter column");
		column=scan.nextInt();
		if(row==1&&column==1)
		{
			space11='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==2)
		{
			space12='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==1&&column==3)
		{
			space13='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==1)
		{
			space21='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==2)
		{
			space22='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==2&&column==3)
		{
			space23='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==1)
		{
			space31='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==2)
		{
			space32='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		else if(row==3&&column==3)
		{
			space33='x';
			System.out.println(""+space11+"\t"+space12+"\t"+space13+"\n"+space21+"\t"+space22+"\t"+space23+"\n"+space31+"\t"+space32+"\t"+space33+"");
		}
		if((space11==space12)&&(space12==space13)&&(space13==space11))
		{
			System.out.println(""+name+" has won");
		}
		else if((space21==space22)&&(space22==space23)&&(space23==space21))		
		{
			System.out.println(""+name+" has won");
		}
		else if((space31==space32)&&(space32==space33)&&(space33==space31))
		{
			System.out.println(""+name+" has won");
		}
		else if((space11==space21)&&(space21==space31)&&(space31==space11))
		{
			System.out.println(""+name+" has won");
		}
		else if((space12==space22)&&(space22==space32)&&(space32==space12))
		{
			System.out.println(""+name+" has won");
		}
		else if((space13==space23)&&(space23==space33)&&(space33==space13))
		{
			System.out.println(""+name+" has won");
		}
		else if((space11==space22)&&(space22==space33)&&(space33==space11))
		{
			System.out.println(""+name+" has won");
		}
		else if((space13==space22)&&(space22==space31)&&(space31==space13))
		{
			System.out.println(""+name+" has won");
		}
		else
		{
			System.out.println("***DRAW***");
		}
	}

}