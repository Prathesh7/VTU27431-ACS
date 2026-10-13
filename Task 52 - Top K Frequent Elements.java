import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num : freq.keySet()) {
            int count = freq.get(num);

            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }

            buckets[count].add(num);
        }

        int[] result = new int[k];
        int index = 0;

        for (int count = nums.length; count >= 1 && index < k; count--) {
            if (buckets[count] != null) {
                for (int num : buckets[count]) {
                    result[index++] = num;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}

OUTPUT:


Status: Accepted
Runtime: 0 ms

CASE 1

Input:
nums = [1, 1, 1, 2, 2, 3]
k = 2

Output:
[1, 2]

Expected:
[1, 2]

Result: PASS
