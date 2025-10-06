class Solution {
    public int maxArea(int[] height) {
        int  i =  0;
        int j =  height.length-1;
        int mres = 0;
        while(i<=j){
            int cr = Math.min(height[i],height[j])*(j-i);
            mres = Math.max(cr,mres);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return mres;
    }
}