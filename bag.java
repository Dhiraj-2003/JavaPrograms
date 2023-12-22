
public class bag {

		private int w;
		private String c;
		private static int wt;
		private static int count;
		public static void output(int n)
		 {
			 if(n==0) 
			 {
				 wt=0;
				 System.out.println("The total weight of the bag is:"+wt+".");
			 }
			 else 
			 {
			 System.out.println("The total weight of the bag is:"+wt+".");
			 }
		 }
		 
		 
		public void display() 
		{	
			System.out.print("\t\t\t"+c+"\t\t\t\t"+w);
			System.out.println();
		}
		
		
		public bag(String c,int w) 
		{
			this.c=c;
			this.w=w;
	        wt=wt+w;
	        count++;
		}
		
		
		public bag() 
		{
			w=20;
			c="red";
			wt=wt+w;	
			count++;
		}
		
		
		public bag(String c) 
		{
		this.c=c;
	    w=20;
		wt=wt+w;
		count++;
		}

		
		public bag(int w) 
		{	
		c="red";
		this.w=w;
		wt=wt+w;
		count++;
		}

		
	    public static int return_obj()
	    {
	    	return count;
	    }
		
	    
		public static void delete_record(bag[] obj, int num) 
		{
			count=count-1;
			wt=wt-obj[num-1].w;
			
		}
		
		
	}
