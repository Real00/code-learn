package com.hear;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 *
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 * 1 2 3 4 5 6 7 8 9 10
 * @author: WANGJR
 * @create: 2019-01-04 15:25
 **/
public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int[] num1 = {},num2={1};
        System.out.println(findMedianSortedArrays(num1,num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        //确保第一个数组最大的数小于第二个数组
        if(nums1.length>0&&nums2.length>0&&nums1[nums1.length-1]>nums2[nums2.length-1]){
            return findMedianSortedArrays(nums2,nums1);
        }
        List<Integer> list = new ArrayList<>(nums1.length+nums2.length);
        for(int i:nums1){
            list.add(i);
        }
        for (int j :nums2){
            list.add(j);
        }
        list.sort((o1,o2)->o1.compareTo(o2));
        if(list.size()%2==0){
            return (double) (list.get(list.size()/2-1)+list.get(list.size()/2))/2;
        }
        else {
            return list.get(list.size()/2);
        }
    }

    public static double findMedianSortedArrays1(int[] nums1, int[] nums2){
        if(nums1.length>nums2.length){
            return findMedianSortedArrays1(nums2,nums1);
        }


        return 1;
    }
}
