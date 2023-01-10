import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] a={1,2,2,3,3,3,4,4,4,5,5,5,5,5,5};
	    int[] b=new int[9];
	    System.out.println(Arrays.toString(b));
	    for(int i=0;i<a.length;i++){
	        int x=a[i];
	        b[x]+=1;
	     //   System.out.println(b[x]);
	    }
	    
	    int[] q={1,2,3,4,5};
	    
	    /*for(int i=0;i<q.length;i++){
	        int x=q[i];
	        System.out.println(q[i]+" "+b[x]);
	    }*/
	    System.out.println(Arrays.toString(a));
	    System.out.println(Arrays.toString(b));
	}
}
