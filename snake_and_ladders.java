

import java.util.*;
class snake_and_ladders
{
    public static void main(String[] args)throws Exception
    {
        Scanner in=new Scanner(System.in);
        int a=0,b=0,c=0,d=0,k=0;
        System.out.println("\t\t\t********** Welcome to Snakes and Ladders **********");
        while(true)
        {
            if(k==0)
                System.out.println("\nDo you want to play(Y/N)?");
            else
                System.out.println("\nDo you want to play again(Y/N)?");
            String gam=in.next();//user's choice entered
            gam=gam.toLowerCase();
            if(gam.compareTo("y")==0)//if gam='y'then game starts
            {
                a=0;b=0;c=0;d=0;k++;//all the values returned to 0
                System.out.println("\nEnter the no. of players(2-4):");
                int n=in.nextInt();//no.of players entered
                if(n==2)
                {
                    System.out.println("Enter the names of all the players:");
                    System.out.println("Player 1:");
                    String pl1=in.next();//name of 1st player entered
                    System.out.println("Player 2:");
                    String pl2=in.next();//name of 2nd player entered
                    while(a!=100||b!=100)
                    {
                        System.out.println("\n\n\nDo you wish to continue(Y/N)?");
                        String con=in.next();con=con.toLowerCase();
                        if(con.compareTo("y")==0)
                        {
                            Thread.sleep(500);
                            System.out.println("\t\t*********************************");
                            int x=(int)(Math.random()*6+1);//dice rolled by 1st player
                            System.out.println("\t\t|\t"+pl1+" rolled a "+x+" ");
                            int y=(int)(Math.random()*6+1);//dice rolled by 2nd player
                            System.out.println("\t\t|");
                            System.out.println("\t\t|\t"+pl2+" rolled a "+y+" ");
                            System.out.println("\t\t*********************************");
                            a=a+x;b=b+y;
                            System.out.println("\n\n");
                            if(a<=100)
                                System.out.println("\t\t"+pl1+" is at "+a+".");
                            if(a==29||a==31||a==55||a==40||a==62||a==73||a==95||a==98)//conditions for snakes
                            {
                                if(a==29||a==55)
                                    a=11;
                                else if(a==31||a==40)
                                    a=26;
                                else if(a==62||a==73)
                                    a=44;
                                else if(a==95||a==98)
                                    a=13;
                                System.out.println(pl1+" got bit by a snake!!!!!");
                                System.out.println(pl1+" is now at "+a+".");
                            }
                            if(a==20||a==57||a==70)//conditions for ladders
                            {
                                if(a==20)
                                    a=35;
                                else if(a==57)
                                    a=68;
                                else if(a==70)
                                    a=87;
                                System.out.println(pl1+" got a ladder!!!!!");
                                System.out.println(pl1+" is now at "+a+".");
                            }
                            if(a>100)
                            {
                                int t=100-a+x;
                                System.out.println(pl1+" needs a "+t+" to win.");
                                a=a-x;
                            }
                            if(a==100)//if 1st player reaches 100
                            {
                                System.out.println("\n\n\t\t********** "+pl1+" is the Winner**********");
                                break;
                            }
                            if(b<=100)
                                System.out.println("\t\t"+pl2+" is at "+b+".");
                            if(b==29||b==55||b==31||b==40||b==62||b==73||b==95||b==98)//conditions for snakes
                            {
                                if(b==29||b==55)
                                    b=11;
                                else if(b==31||b==40)
                                    b=26;
                                else if(b==62||b==73)
                                    b=50;
                                else if(b==95||b==98)
                                    b=13;
                                System.out.println(pl2+" got bit by a snake!!!!!");
                                System.out.println(pl2+" is now at "+b+".");
                            }
                            if(b==20||b==57||b==70)//conditions for ladders
                            {
                                if(b==20)
                                    b=35;
                                else if(b==57)
                                    b=68;
                                else if(b==70)
                                    b=87;
                                System.out.println(pl2+" got a ladder!!!!!");
                                System.out.println(pl2+" is now at "+b+".");
                            }
                            if(b>100)
                            {
                                int t=100-b+y;
                                System.out.println(pl2+" needs a "+t+" to win.");
                                b=b-y;
                            }
                            if(b==100)//if 2nd player reaches 100
                            {
                                System.out.println("\n\n\t\t********** "+pl2+" is the Winner**********");
                                break;
                            }
                        }
                        else
                            break;
                    }
                }
                else if(n==3)
                {
                    System.out.println("Enter the names of all the players:");
                    System.out.println("Player 1:");
                    String pl1=in.next();//name of 1st player entered
                    System.out.println("Player 2:");
                    String pl2=in.next();//name of 2nd player entered
                    System.out.println("Player 3:");
                    String pl3=in.next();//name of 3rd player entered
                    while(a!=100||b!=100||c!=100)
                    {
                        System.out.println("\n\n\nDo you wish to continue(Y/N)?");
                        String con=in.next();con=con.toLowerCase();
                        if(con.compareTo("y")==0)
                        {
                            Thread.sleep(500);
                            System.out.println("\t\t*********************************");
                            int x=(int)(Math.random()*6+1);//dice rolled by 1st player
                            System.out.println("\t\t|\t"+pl1+" rolled a "+x+" ");
                            int y=(int)(Math.random()*6+1);//dice rolled by 2nd player
                            System.out.println("\t\t|");
                            System.out.println("\t\t|\t"+pl2+" rolled a "+y+" ");
                            int z=(int)(Math.random()*6+1);//dice rolled by 3rd player
                            System.out.println("\t\t|");
                            System.out.println("\t\t|\t"+pl3+" rolled a "+z+" ");
                            System.out.println("\t\t*********************************");
                            a=a+x;b=b+y;c=c+z;
                            System.out.println("\n\n");
                            if(a<=100)
                                System.out.println("\t\t"+pl1+" is at "+a+".");
                            if(a==29||a==31||a==55||a==40||a==62||a==73||a==95||a==98)//conditions for snakes
                            {
                                if(a==29||a==55)
                                    a=11;
                                else if(a==31||a==40)
                                    a=26;
                                else if(a==62||a==73)
                                    a=44;
                                else if(a==95||a==98)
                                    a=13;
                                System.out.println(pl1+" got bit by a snake!!!!!");
                                System.out.println(pl1+" is now at "+a+".");
                            }
                            if(a==20||a==57||a==70)//conditions for ladders
                            {
                                if(a==20)
                                    a=35;
                                else if(a==57)
                                    a=68;
                                else if(a==70)
                                    a=87;
                                System.out.println(pl1+" got a ladder!!!!!");
                                System.out.println(pl1+" is now at "+a+".");
                            }
                            if(a>100)
                            {
                                int t=100-a+x;
                                System.out.println(pl1+" needs a "+t+" to win.");
                                a=a-x;
                            }
                            if(a==100)//if 1st player reaches 100
                            {
                                System.out.println("\n\n\t\t********** "+pl1+" is the Winner**********");
                                break;
                            }
                            if(b<=100)
                                System.out.println("\t\t"+pl2+" is at "+b+".");
                            if(b==29||b==55||b==31||b==40||b==62||b==73||b==95||b==98)//conditions for snakes
                            {
                                if(b==29||b==55)
                                    b=11;
                                else if(b==31||b==40)
                                    b=26;
                                else if(b==62||b==73)
                                    b=50;
                                else if(b==95||b==98)
                                    b=13;
                                System.out.println(pl2+" got bit by a snake!!!!!");
                                System.out.println(pl2+" is now at "+b+".");
                            }
                            if(b==20||b==57||b==70)//conditions for ladders
                            {
                                if(b==20)
                                    b=35;
                                else if(b==57)
                                    b=68;
                                else if(b==70)
                                    b=87;
                                System.out.println(pl2+" got a ladder!!!!!");
                                System.out.println(pl2+" is now at "+b+".");
                            }
                            if(b>100)
                            {
                                int t=100-b+y;
                                System.out.println(pl2+" needs a "+t+" to win.");
                                b=b-y;
                            }
                            if(b==100)//if 2nd player reaches 100
                            {
                                System.out.println("\n\n\t\t********** "+pl2+" is the Winner**********");
                                break;
                            }
                            if(c<=100)
                                System.out.println("\t\t"+pl3+" is at "+c+".");
                            if(c==29||c==55||c==31||c==40||c==62||c==73||c==95||c==98)//conditions for snakes
                            {
                                if(c==29||c==55)
                                    c=11;
                                else if(c==31||c==40)
                                    c=26;
                                else if(c==62||c==73)
                                    c=50;
                                else if(c==95||c==98)
                                    c=13;
                                System.out.println(pl3+" got bit by a snake!!!!!");
                                System.out.println(pl3+" is now at "+c+".");
                            }
                            if(c==20||c==57||c==70)//conditions for ladders
                            {
                                if(c==20)
                                    c=35;
                                else if(c==57)
                                    c=68;
                                else if(c==70)
                                    c=87;
                                System.out.println(pl3+" got a ladder!!!!!");
                                System.out.println(pl3+" is now at "+c+".");
                            }
                            if(c>100)
                            {
                                int t=100-c+z;
                                System.out.println(pl3+" needs a "+t+" to win.");
                                c=c-z;
                            }
                            if(c==100)//if 3rd player reaches 100
                            {
                                System.out.println("\n\n\t\t********** "+pl3+" is the Winner**********");
                                break;
                            }                            
                        }
                        else
                            break;
                    }
                }
                else if(n==4)
                {
                    System.out.println("Enter the names of all the players:");
                    System.out.println("Player 1:");
                    String pl1=in.next();//name of 1st player entered
                    System.out.println("Player 2:");
                    String pl2=in.next();//name of 2nd player entered
                    System.out.println("Player 3:");
                    String pl3=in.next();//name of 3rd player entered
                    System.out.println("Player 4:");
                    String pl4=in.next();//name of 4th player entered
                    while(a!=100||b!=100||c!=100||d!=100)
                    {
                        System.out.println("\n\n\nDo you wish to continue(Y/N)?");
                        String con=in.next();con=con.toLowerCase();
                        if(con.compareTo("y")==0)
                        {
                            Thread.sleep(500);
                            System.out.println("\t\t*********************************");
                            int x=(int)(Math.random()*6+1);//dice rolled by 1st player
                            System.out.println("\t\t|\t"+pl1+" rolled a "+x+" ");
                            int y=(int)(Math.random()*6+1);//dice rolled by 2nd player
                            System.out.println("\t\t|");
                            System.out.println("\t\t|\t"+pl2+" rolled a "+y+" ");
                            int z=(int)(Math.random()*6+1);//dice rolled by 3rd player
                            System.out.println("\t\t|");
                            System.out.println("\t\t|\t"+pl3+" rolled a "+z+" ");
                            int e=(int)(Math.random()*6+1);//dice rolled by 4th player
                            System.out.println("\t\t|");
                            System.out.println("\t\t|\t"+pl4+" rolled a "+e+" ");
                            System.out.println("\t\t*********************************");
                            a=a+x;b=b+y;c=c+z;d=d+e;
                            System.out.println("\n\n");
                            if(a<=100)
                                System.out.println("\t\t"+pl1+" is at "+a+".");
                            if(a==29||a==31||a==55||a==40||a==62||a==73||a==95||a==98)//conditions for snakes
                            {
                                if(a==29||a==55)
                                    a=11;
                                else if(a==31||a==40)
                                    a=26;
                                else if(a==62||a==73)
                                    a=44;
                                else if(a==95||a==98)
                                    a=13;
                                System.out.println(pl1+" got bit by a snake!!!!!");
                                System.out.println(pl1+" is now at "+a+".");
                            }
                            if(a==20||a==57||a==70)//conditions for ladders
                            {
                                if(a==20)
                                    a=35;
                                else if(a==57)
                                    a=68;
                                else if(a==70)
                                    a=87;
                                System.out.println(pl1+" got a ladder!!!!!");
                                System.out.println(pl1+" is now at "+a+".");
                            }
                            if(a>100)
                            {
                                int t=100-a+x;
                                System.out.println(pl1+" needs a "+t+" to win.");
                                a=a-x;
                            }
                            if(a==100)//if 1st player reaches 100
                            {
                                System.out.println("\n\n\t\t********** "+pl1+" is the Winner**********");
                                break;
                            }
                            if(b<=100)
                                System.out.println("\t\t"+pl2+" is at "+b+".");
                            if(b==29||b==55||b==31||b==40||b==62||b==73||b==95||b==98)//conditions for snakes
                            {
                                if(b==29||b==55)
                                    b=11;
                                else if(b==31||b==40)
                                    b=26;
                                else if(b==62||b==73)
                                    b=50;
                                else if(b==95||b==98)
                                    b=13;
                                System.out.println(pl2+" got bit by a snake!!!!!");
                                System.out.println(pl2+" is now at "+b+".");
                            }
                            if(b==20||b==57||b==70)//conditions for ladders
                            {
                                if(b==20)
                                    b=35;
                                else if(b==57)
                                    b=68;
                                else if(b==70)
                                    b=87;
                                System.out.println(pl2+" got a ladder!!!!!");
                                System.out.println(pl2+" is now at "+b+".");
                            }
                            if(b>100)
                            {
                                int t=100-b+y;
                                System.out.println(pl2+" needs a "+t+" to win.");
                                b=b-y;
                            }
                            if(b==100)//if 2nd player reaches 100
                            {
                                System.out.println("\n\n\t\t********** "+pl2+" is the Winner**********");
                                break;
                            }
                            if(c<=100)
                                System.out.println("\t\t"+pl3+" is at "+c+".");
                            if(c==29||c==55||c==31||c==40||c==62||c==73||c==95||c==98)//conditions for snakes
                            {
                                if(c==29||c==55)
                                    c=11;
                                else if(c==31||c==40)
                                    c=26;
                                else if(c==62||c==73)
                                    c=50;
                                else if(c==95||c==98)
                                    c=13;
                                System.out.println(pl3+" got bit by a snake!!!!!");
                                System.out.println(pl3+" is now at "+c+".");
                            }
                            if(c==20||c==57||c==70)//conditions for ladders
                            {
                                if(c==20)
                                    c=35;
                                else if(c==57)
                                    c=68;
                                else if(c==70)
                                    c=87;
                                System.out.println(pl3+" got a ladder!!!!!");
                                System.out.println(pl3+" is now at "+c+".");
                            }
                            if(c>100)
                            {
                                int t=100-c+z;
                                System.out.println(pl3+" needs a "+t+" to win.");
                                c=c-z;
                            }
                            if(c==100)//if 3rd player reaches 100
                            {
                                System.out.println("\n\n\t\t********** "+pl3+" is the Winner**********");
                                break;
                            }
                            if(d<=100)
                                System.out.println("\t\t"+pl4+" is at "+d+".");
                            if(d==29||d==55||d==31||d==40||d==62||d==73||d==95||d==98)//conditions for snakes
                            {
                                if(d==29||d==55)
                                    d=11;
                                else if(d==31||d==40)
                                    d=26;
                                else if(d==62||d==73)
                                    d=50;
                                else if(d==95||d==98)
                                    d=13;
                                System.out.println(pl4+" got bit by a snake!!!!!");
                                System.out.println(pl4+" is now at "+d+".");
                            }
                            if(d==20||d==57||d==70)//conditions for ladders
                            {
                                if(d==20)
                                    d=35;
                                else if(d==57)
                                    d=68;
                                else if(d==70)
                                    d=87;
                                System.out.println(pl4+" got a ladder!!!!!");
                                System.out.println(pl4+" is now at "+d+".");
                            }
                            if(d>100)
                            {
                                int t=100-d+e;
                                System.out.println(pl4+" needs a "+t+" to win.");
                                d=d-e;
                            }
                            if(d==100)//if 4th player reaches 100
                            {
                                System.out.println("\n\n\t\t********** "+pl4+" is the Winner**********");
                                break;
                            }
                        }
                        else
                            break;
                    }
                }
                else
                    System.out.println("Enter no. of players between 2-4.");
            }
            else
                break;
        }
    }
}

