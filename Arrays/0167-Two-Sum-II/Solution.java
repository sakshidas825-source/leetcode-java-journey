class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //array is already sorted so we dont have to use Arrays.sort(numbers);
        int i=0, j=numbers.length-1;
        //kyunki humme na pointers ko ek dusre se exceed krwani h aur nahi meet isiliye jab tak i<j hoga tab tak loop chalega aur agr i>j hua toh pointer ek dusre se aage chala jayega and i==j or i<=j hua then they meet at the same point aur check krne ka koi fydaa nahi.
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum==target){
                return new int[]{i+1,j+1};
            }
            else if(sum<target){
                i++;
            } 
            else if(sum>target){
                j--;
            }      
        }
        return new int[]{};
    }
}
