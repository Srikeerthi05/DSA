
class Main {
    public static int trapped(int height[]){
        int n=height.length;
        int lm[]=new int[n];//auxiliary array
        int rm[]=new int[n];//auxiliary array
        
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        
        int rightMax[]=new int[n];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterlevel-height[i];
        }
        return trappedWater;
        }
    public static void main(String[] args) {
       int height[]={4,2,0,6,3,2,5};
       System.out.println(trapped(height));
    }
    }
