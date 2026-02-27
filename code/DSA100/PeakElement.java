package DSA100;

public class PeakElement {

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        for(int i=1; i<n-1; i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
        }
        return nums[0] > nums[n - 1] ? 0 : n - 1;
    }

    public static void main(String[] args){
        PeakElement pe = new PeakElement();
        int[] nums = {3,4,5,1,2};
        int result = pe.findPeakElement(nums);
        System.out.println("The peak element is at: "+result+" index.");
        System.out.println(nums[result]);
    }

}
