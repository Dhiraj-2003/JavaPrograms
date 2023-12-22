import java.util.*;
public class bagdemo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        bag obj[]=new bag[20];
        int n=0;
        int ch1;
        do {
            System.out.println("\n1. Add a ball in the bag.");
            System.out.println("\n2. Display all the contents of the bag.");
            System.out.println("\n3. Remove a particular ball from the bag.");
            System.out.println("\n4. Exit");
            System.out.println("\nEnter the serial number of the operation that you want to perform:");
            ch1=sc.nextInt();
            switch(ch1) 
            {
            case 1: 

                String col;
                int w;
                int ch2;
                
                do {
                    System.out.println("\n[NOTE:By default the ball weight is 20 and the ball colour is red.]\n");
                    
                    System.out.println("\n1. Enter Both: ball colour and ball weight.");
                    System.out.println("\n2. Select both default: default ball colour and default ball weight.");
                    System.out.println("\n3. Enter ball colour and select default ball weight.");
                    System.out.println("\n4. Enter ball weight and select default ball colour.");
                    System.out.println("\n5. Go back.");
                    
                    ch2=sc.nextInt();
                    switch(ch2)
                    {
                    
                    case 1:
                        System.out.println("Enter ball colour: ");
                        col=sc.next();
                        System.out.println("Enter ball weight: ");
                        w=sc.nextInt();
                        n=bag.return_obj();
                        obj[n]=new bag(col,w);
                        //n=n+1;
                        System.out.println("\n\t\tBall number "+(n+1)+" added to the bag");
                    break;
                    
                    case 2:
                        n=bag.return_obj();
                        obj[n]=new bag();
                        //n=n+1;
                        System.out.println("\n\t\tBall number "+(n+1)+" added to the bag");
                    break;
                    
                    case 3:
                        System.out.println("Enter ball colour: ");
                        col=sc.next();
                        n=bag.return_obj();
                        obj[n]=new bag(col);
                        //n=n+1;
                        System.out.println("\n\t\tBall number "+(n+1)+" added to the bag");
                    break;
                    
                    case 4:
                        System.out.println("Enter ball weight: ");
                        w=sc.nextInt();
                        n=bag.return_obj();
                        obj[n]=new bag(w);
                        //n=n+1;
                        System.out.println("\n\t\tBall number "+(n+1)+" added to the bag");
                    break;
                    
                    case 5:
                        System.out.println("OK");
                    break;
                        
                    default:
                            System.out.println("Enter valid choice.");
                    }
                    }while(ch2!=5);	
            break;
            
            case 2:
                n=bag.return_obj();
                if(obj[0]==null)
                {
                    System.out.println("\n There are no balls in the bag.Bag is empty now.");
                }
                else {
                int i;
            
                System.out.println("\n Displaying the contents of the bag:");
                System.out.println();
                System.out.println("Sr.no.\t\t\tColour\t\t\t\tWeight");
                n=bag.return_obj();
                for( i=0;i<n;i++)
                {    	
                        System.out.print(i+1+")");
                        obj[i].display();	
                }
                System.out.println("\nThere are total "+n+" ball(s) in the bag.");
            
                bag.output(n);
                }
            break;
            
            case 3:int num;
                n=bag.return_obj();
                if(n==0) 
                {
                System.out.println("\n\tThere are no balls in the bag.You have not added any balls to the bag.");
                }
                else 
                {
                System.out.println("Enter the number of that ball which you want to remove:");
                num=sc.nextInt();
                if(num>0 & num<=n) 
                {
                    bag.delete_record(obj,num);
                    for(int i=num;i<n;i++) 
                    {
                        obj[i-1]=obj[i];
                    }
                    
                System.out.println("\n\t\t\tThe Ball at number "+num+" was removed.");
                }
                else 
                {
                    System.out.println("Enter valid number.");
                }
            }
                break;
            
                
            case 4:
                System.out.println("\nExitted Successfully !!!");
            break;
            
            default:
                System.out.println("Enter valid choice.");
            }			
        }while(ch1!=4);	
        sc.close();

    }

}
