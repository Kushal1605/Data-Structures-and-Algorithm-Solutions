
/*
 * https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/0
 */

 class Solve {
    int[] findTwoElement(int arr[], int n) {    
         int x = 0,y = 0;
        int [] res = new int [2];
        int xor = 0,in_xor = 0;
        for(int i = 0; i <= n; i++){
            if(i != n)
                 xor ^= arr[i];
            in_xor^=i;
        }
        int net = xor ^ in_xor;
        int diff = net & (-net);
        for(int i = 0; i < n; i++){
            if((arr[i] & diff) != 0)
                x ^= arr[i];
            else
                y ^= arr[i];
        }
        for(int i = 1; i <= n; i++){
             if((i & diff) != 0)
                x ^= i;
            else
                y ^= i;            
        }
        int c = 0;
        for(int i = 0; i < n; i++)
            if(x == arr[i]) 
                c++;        
        if(c != 0) {
            res[0] = x;
            res[1] = y;
        }
        else{
            res[0] = y;
            res[1] = x;
        }
        return res;
    }
}