/*
 * A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.
 *
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.
 *
 * Write a function:
 *
 * class Solution { public int[] solution(int[] A, int K); }
 * that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.
 *
 * For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
 *
 * Assume that:
 *
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 * Copyright 2009–2016 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited. 
 */

// import java.util.Arrays;

class Solution {
    public static void main (String args[]) {
        Solution instance = new Solution();
        int a[] = {6,2,8,7,31,6};
        instance.solution(a, 2);
    }
    public int[] solution(int[] A, int K) {
        // System.out.println(Arrays.toString(A)); 

        int index    = 0;
        int length   = A.length;
        int shift    = K % length;
        int left     = length - shift;
        int answer[] = new int[length];
        for(int i = 0;i < length;i++) {
            index = (left + i) % length;
            answer[i] = A[index];
        }

        // System.out.println(Arrays.toString(answer)); 

        return answer;
    }
}

/*
 * score : 87
 *
 * 1. 1.483 s RUNTIME ERROR,  tested program terminated unexpectedly
 * stderr:
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 *         at Solution.solution(Solution.java:12)
 *         at wrapper.run(wrapper.java:41)
 *         at wrapper.main(wrapper.java:30)
 * 2. 1.504 s RUNTIME ERROR,  tested program terminated unexpectedly
 * stderr:
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 *         at Solution.solution(Solution.java:12)
 *         at wrapper.run(wrapper.java:41)
 *         at wrapper.main(wrapper.java:30)
 */
