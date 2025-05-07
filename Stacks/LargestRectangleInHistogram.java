class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int left[]=new int[n];
        int right[]=new int[n];
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            left[i]=s.isEmpty()? -1 : s.peek();
            s.push(i);
        }        


        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            right[i]=s.isEmpty()? n : s.peek();
            s.push(i);
        }  

        int maxArea=0;
        
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int currArea=heights[i]*width;
            maxArea= Math.max(maxArea, currArea);
        }
        return maxArea;
    }
}
