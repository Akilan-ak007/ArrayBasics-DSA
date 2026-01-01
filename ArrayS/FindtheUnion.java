package ArrayS;

import java.util.ArrayList;
import java.util.List;

public class FindtheUnion {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 4, 6, 7, 8};
        int n = nums1.length, m = nums2.length;
        System.out.println(fun(nums1,nums2,n,m));
    }

    static List<Integer>fun(int[] nums1, int[] nums2, int n, int m) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                    i++;
                }
            } else if (nums2[j] < nums1[i]) {
                if (union.isEmpty() || union.get(union.size() - 1) != nums2[j]) {
                    union.add(nums2[j]);
                    j++;
                }
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                    i++;
                    j++;
                }
            }
        }
        while (i < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                union.add(nums1[i]);
                i++;
            }
        }
        while (j < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != nums2[j]) {
                union.add(nums2[j]);
                j++;
            }
        }
        return union;
    }
}
