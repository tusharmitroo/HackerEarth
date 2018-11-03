import java.util.Scanner;

class Test {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int count=0;
        
        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
            if(arr[i]==0) count++;
        }
        
        if(count<=1||count==n) System.out.println(n-count);
        
        else {
            int info[] = new int[count];
        
            int indx=0;
            
            for(int i=0; i<n; i++) {
                if(arr[i]==0) {
                    info[indx] = i;
                    indx++;
                }
            }
    
            int l = info[1]+1;
            int r = n - info[count-2];
            int max=(l>=r)?l:r;
            
            int diff=0;
            for(int i=0; i<count-2; i++) {
                diff = info[i+2]-info[i];
                if(diff>max) max = diff;
            }
            
        if(n-count-(max-1)>=0) System.out.println(max-1);
        else System.out.println(max-2);
        }
    }
}
