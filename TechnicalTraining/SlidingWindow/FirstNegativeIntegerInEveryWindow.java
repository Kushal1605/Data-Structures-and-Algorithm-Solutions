/*
 * https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
 */

 class Compute {  
    public long[] printFirstNegativeInteger(long arr[], int n, int k) {
        List<Integer> list = new ArrayList<>();
        int start = 0, end = 0, index = 0;
        long res [] = new long [n - k + 1];
        while(end < n) {
            if(arr[end] < 0)
                list.add(end);
            if(end - start + 1 == k) {
                if(list.size() == 0)
                    res[index++] = 0l;
                else {
                    res[index++] = (long)arr[list.get(0)];
                    if(start == list.get(0))
                        list.remove(0);
                }
                start += 1;
            }
            end += 1;
        }
        return res;
    }
}
