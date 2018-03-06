import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class towersOfHanoi {
	public static void main(String args[]) throws IOException
	{
	     Scanner s = new Scanner(System.in);
		 LinkedList<Integer> src = new LinkedList<Integer>();
	     LinkedList<Integer> des = new LinkedList<Integer>();
	     LinkedList<Integer> aux = new LinkedList<Integer>();
	     int n,i,from,to;
	     boolean targetReached=false;
	     System.out.println("Enter the number of discs:");
	     n = s.nextInt();
	     for(i=n;i>=1;i--)
	    	 src.addLast(i);
	     LinkedList<Integer> dup = new LinkedList<Integer>();
	     dup = (LinkedList<Integer>) src.clone();
    	 System.out.println(src);
    	 System.out.println(des);
    	 System.out.println(aux);
    	 System.out.println(dup);

		 while(!targetReached)
	     {
	    	 if(src.size()==0)
	    		 src.addLast(100);
	    	 if(des.size()==0)
	    		 des.addLast(100);
	    	 if(aux.size()==0)
	    		 aux.addLast(100);
			 if(des.equals(dup))
	    	 {
	    		 targetReached=true;
	    		 break;
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Enter the element to be moved:");
	    		 from = s.nextInt();
	    		 if(src.peekLast()==from)
	    		 {
	    			 System.out.println("To(1-src,2-des,3-aux):");
	    			 to = s.nextInt();
	    			 switch(to)
	    			 {
	    			 case 1:
	    				 if(src.peekLast()>from || src.size()==0)
	    				 {
	    					 int no=src.removeLast();
	    					 src.addLast(no);
	    				 }
	    				 else System.out.println("Illegal move.Try Again.11");
	    				 break;
	    			 case 2:
	    				 if(des.peekLast()>from || des.size()==0)
	    				 {
	    					 int no=src.removeLast();
	    					 des.addLast(no);
	    				 }
	    				 else System.out.println("Illegal move.Try Again.12");
	    				 break;
	    			 case 3:
	    				 if(aux.peekLast()>from || aux.size()==0)
	    				 {
	    					 int no=src.removeLast();
	    					 aux.addLast(no);
	    				 }
	    				 else System.out.println("Illegal move.Try Again.13");
	    				 break;
	    			 default:
	    				 System.out.println("Illegal move.Try Again.14");
	    			 }
	    		 }
	    		 else if(des.peekLast()==from)
	    		 {
	    			 System.out.println("To(1-src,2-des,3-aux):");
	    			 to = s.nextInt();
	    			 switch(to)
	    			 {
	    			 case 1:
	    				 if(src.peekLast()>from || src.size()==0)
	    				 {
	    					 int no=des.removeLast();
	    					 src.addLast(no);
	    				 }
	    				 else System.out.println("Illegal move.Try Again.21");
	    				 break;
	    			 case 2:
	    				 if(des.peekLast()>from || des.size()==0)
	    				 {
	    					 int no=des.removeLast();
	    					 des.addLast(no);
	    				 }
	    				 else System.out.println("Illegal move.Try Again.22");
	    				 break;
	    			 case 3:
	    				 if(aux.peekLast()>from || aux.size()==0)
	    				 {
	    					 int no=des.removeLast();
	    					 aux.addLast(no);
	    				 }
	    				 else System.out.println("Illegal move.Try Again.23");
	    				 break;
	    			 default:
	    				 System.out.println("Illegal move.Try Again.24");
	    			 }
	    		 }
	    		 else if(aux.peekLast()==from)
	    		 {
	    			 System.out.println("To(1-src,2-des,3-aux):");
	    			 to = s.nextInt();
	    			 switch(to)
	    			 {
	    			 case 1:
	    				 if(src.peekLast()>from || src.size()==0)
	    				 {
	    					 int no=aux.removeLast();
	    					 src.addLast(no);
	    				 }
	    				 else System.out.println("Illegal move.Try Again.31");
	    				 break;
	    			 case 2:
	    				 if(des.peekLast()>from || des.size()==0)
	    				 {
	    					 int no=aux.removeLast();
	    					 des.addLast(no);
	    				 }
	    				 else System.out.println("Illegal move.Try Again.32");
	    				 break;
	    			 case 3:
	    				 if(aux.peekLast()>from || aux.size()==0)
	    				 {
	    					 int no=aux.removeLast();
	    					 aux.addLast(no);
	    				 }
	    				 else System.out.println("Illegal move.Try Again.33");
	    				 break;
	    			 default:
	    				 System.out.println("Illegal move.Try Again.34");
	    			 }
	    		 }
	    		 else
	    			 System.out.println("Illegal move.Try Again.4");
	    	 }
			 if(src.contains(100))
	    		 src.remove();
	    	 if(des.contains(100))
	    		 des.remove();
	    	 if(aux.contains(100))
	    		 aux.remove();
	    	 System.out.println(src);
	    	 System.out.println(des);
	    	 System.out.println(aux);
	     }

	}

}
