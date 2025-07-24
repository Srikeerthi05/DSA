// brute force
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merged=new ArrayList<>();
        int n=intervals.length;
        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(!merged.isEmpty() && end<=merged.get(merged.size()-1)[1]){
                continue;
            }

            for(int j=i+1;j<n;j++){
                if(intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                }
                else {
                    break;
                }
            }
            merged.add(new int[]{start,end});
        }
        return merged.toArray(new int[merged.size()][]);
        
    }
}

//optimal
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merged=new ArrayList<>();
        int n=intervals.length;
        for (int i=0;i<n;i++){
            if(ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)){
                 ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            } else {
                int lastIndex = ans.size() - 1;
                int mergedEnd = Math.max(ans.get(lastIndex).get(1), arr[i][1]);
                ans.get(lastIndex).set(1, mergedEnd);
            }
        }

        return ans;
        }
    
}
