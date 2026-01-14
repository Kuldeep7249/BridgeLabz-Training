import java.util.*;

public class Hashing {

    public static List<int[]> zeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;
        map.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
        return result;
    }

    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            if (set.contains(target - x)) return true;
            set.add(x);
        }
        return false;
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);

        int longest = 0;
        for (int x : set) {
            if (!set.contains(x - 1)) {
                int curr = x;
                int count = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (map.containsKey(rem)) {
                return new int[]{map.get(rem), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, -7, 3, 1, 3, 1, -4};
        System.out.println(zeroSumSubarrays(arr1));

        int[] arr2 = {8, 7, 2, 5, 3, 1};
        System.out.println(hasPairWithSum(arr2, 10));

        int[] arr3 = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr3));

        int[] arr4 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr4, 9)));
    }
}
