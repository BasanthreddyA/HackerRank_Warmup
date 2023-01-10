//frequency count of variables by using Array(bruteforce)

public class Main
{
	public static void main(String[] args) {
	    int[] a={1,2,3,4,5,6,1,1,1};
	    int q=1;
	    int feq=0;
	    for(int i=0;i<a.length;i++){
	        if(a[i]==q){
	            feq++;
	        }
	    }
		System.out.println(feq);
	}
}

// time complexity O(N*Q) 
//n=number of elements,N=number of quries