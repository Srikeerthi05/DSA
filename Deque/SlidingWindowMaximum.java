class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n-k+1]; //result array ,for each window 1 element so , if n=7,k=3, then res[5].
        Deque<Integer> dq=new ArrayDeque<>();
        int idx=0;
        for(int i=0;i<n;i++){
            if(!dq.isEmpty()&& dq.peekFirst()==i-k){//before doing anything if there are elements ,remove them.
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[i]>nums[dq.peekLast()]){ //if curr element is greater than last element in deque
                dq.pollLast();   //pop last element
            }
            dq.addLast(i); //if not, add it to the deque

            if(i>=k-1){ //window checking
                res[idx]=nums[dq.peekFirst()];  // after the checking , the front element is highest so push to res[]
                idx++; //increment the index
            }
        }
        return res;
    }
}
