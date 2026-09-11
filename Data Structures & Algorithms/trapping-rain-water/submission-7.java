class Solution {
    public int trap(int[] height) {

        int l = 0;
        int r = height.length-1;
        int ans = 0;
        int leftmax = height[l];
        int rightmax = height[r];

        while(l < r){
            
            if(leftmax < rightmax){

                l++;
                leftmax = Math.max(height[l],leftmax);
                ans += leftmax - height[l];

            } else {
                r--;
                rightmax = Math.max(height[r],rightmax);
                ans += rightmax - height[r];
            }

            
        }

        return ans;
        
    }
}
