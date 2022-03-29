public List<List<Integer>> threeSum(int[] num) {
    Arrays.sort(num);
    List<List<Integer>> res = new LinkedList<>(); 
    for (int i = 0; i < num.length-2; i++) {
        if(i == 0 || num[i] != num[i-1]) {
            int low = i+1, high = num.length-1, sum = 0 - num[i];
            while (low < high) {
                if (num[low] + num[high] == sum) {
                    res.add(Arrays.asList(num[i], num[low], num[high]));
                    while (low < high && num[low] == num[low+1]) low++;
                    while (low < high && num[high] == num[high-1]) high--;
                    low++; high--;
                } else if (num[low] + num[high] < sum) low++;
                else high--;
           }
        }
    }
    return res;
}