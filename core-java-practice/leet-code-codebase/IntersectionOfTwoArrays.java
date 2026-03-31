import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        int[] tmp = new int[Math.min(nums1.length, nums2.length)];
        while (i<nums1.length && j<nums2.length) {
            if (nums1[i] < nums2[j]) i++;
            else if (nums1[i] > nums2[j]) j++;
            else {
                if (k==0 || tmp[k-1] != nums1[i]) tmp[k++] = nums1[i];
                i++; j++;
            }
        }
        int[] res = new int[k];
        System.arraycopy(tmp, 0, res, 0, k);
        return res;
    }
}