class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length<nums2.length)
            return merge(nums1,nums2);
        else
            return merge(nums2,nums1);    
  
    }

    public double merge(int[] nums1,int[] nums2){

        int ans[]=new int[nums1.length+nums2.length];
        int j=0;
        int i=0;
        int k=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i];
                i++;
            }
            else{
                ans[k++]=nums2[j];
                j++;
            }
        }
        while(i<nums1.length){
            ans[k++]=nums1[i];
            i++;
        }
        while(j<nums2.length){
            ans[k++]=nums2[j];
            j++;
        }
        
        // System.out.print(ans[1]);
        int n=ans.length;
        if(n%2 !=0){
            double s= (double)ans[n/2];
            return s;
        }
        else{
            double sum=(double)(ans[n/2] + ans[(n/2)-1]);
            return (double)sum/2;
        }
    }
}