class Frequency {
	static void find_frequency(String s, String pattern) {
		int start = 0, end = 0, k = pattern.length(), count = 0;
        StringBuilder temp = new StringBuilder();
        while(end < s.length()){
            temp.append(s.charAt(end));
            if((end - start + 1) == k){
                if(temp.toString().equals(pattern))
                    count++;
                temp.deleteCharAt(0);
                start += 1;
            }
            end += 1;
        }
        System.out.println(count);
	}
}
