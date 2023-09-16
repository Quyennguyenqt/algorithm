package com.nqt;

public class AlgorithmSort {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(2, l1);
//        ListNode l3 = new ListNode(2, l2);
//
//
//        ListNode ln1 = new ListNode(1);
//        ListNode ln2 = new ListNode(2, ln1);
//        ListNode ln3 = new ListNode(2, ln2);
//
//        Solution sl = new Solution();
//        sl.mergeTwoLists(l3, ln3);
        int a[] = {9, 4, 5, 6, 3, 5};
        int b[] = {1, 2, 3, 4, 5, 7, 6};
       //bubbleSort1(b);
       //insertSort1(a);
        sortArray(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);

    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int tem = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tem;
                }
            }
            if (isSorted) break;
        }
    }

    public static void insertSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n - 1; i++) {
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > ai) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
        }

    }

    public static void bubbleSort1 (int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n -i -1; j++) {
                if(a[j] > a[j + 1]) {
                    isSorted = false;
                    int temp = a[j];
                    a[j] = a[j +1];
                    a[j + 1] = temp;
                }
            }
            if(isSorted) break;
           printArray(i, a);
            System.out.println();
        }
    }

    public void selectionSort(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n -1; j++) {
                if(a[i] > a [j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static int[] merge(int[] a1, int[] a2) {
        //tron 2 mang voi nhau
        int n = a1.length + a2.length;
        int[] result = new int[n];
        /*
         * i la chi so result
         * i1 la chi so a1
         * i2 la chi so a2
         */
        int i = 0, i1 = 0, i2 = 0;
        while (i< n) {
            if(i1 < a1.length && i2< a2.length) { //a1&a2 != rong
                if(a1[i1] <= a2[i2]) {//a1 nho hon
                    result[i] = a1[i1];
                    i++; i1++;
                } else { // a2 nho hon
                    result[i] = a2[i2];
                    i++; i2++;
                }
            } else {    //a1 rong or a2 rong
                if(i1 < a1.length){//a2 rong
                    result[i] = a1[i1];
                    i++; i1++;
                } else {
                    result[i] = a1[i2];
                    i++; i2++;
                }
            }
        }
        return result;
    }

    public static int[] mergeSort(int[]a, int L, int R) {
        if(L > R) return new int[0];
        if(L == R) {
            int[] singleElement = {a[L]};
            return singleElement;
        }
        //chia ra
        int k = (L + R)/2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k+1, R);

        int[] result = merge(a1, a2);
        return result;
    }

    public static int[] sortArray(int [] nums) {
        return mergeSort(nums, 0, nums.length -1);
    }

    private static void printArray(int i, int[] a) {
        System.out.print(i + ":");
        for(int k = 0; k < a.length; k++) {
            System.out.print( a[k] + " ");
        }
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 != null || l2 != null) {
            return l1 == null ? l2 : l1;
        } else {
            ListNode head1 = l1;
            ListNode head2 = l2;
            while (head2 != null) {
                if (head1.next != null) {
                    if (head2.val < head1.val) {
                        ListNode ln = new ListNode(head2.val);
                        ln.next = head1;
                    } else {

                    }
                } else {

                }
                head2 = head2.next;
            }
        }
        return new ListNode();
    }
}
