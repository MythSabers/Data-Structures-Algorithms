public class MajorityElement {

    public static void main(String[] args) {
        int[] a = {3, 4, 3, 2, 4, 4, 4, 4};
        Solution sol = new Solution();
        sol.printMajority(a, a.length);
    }
}

class Solution {
    void printMajority(int[] a, int size) {
        int candidate = findCandidate(a, size);
        if (isMajority(a, size, candidate))
            System.out.println(candidate);
        else
            System.out.println("No Majority Element");
    }

    int findCandidate(int[] a, int size) {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }

        return a[maj_index];
    }

    boolean isMajority(int[] a, int size, int candidate) {
        int i, count = 0;
        for (i = 0; i < size; i++)
            if (a[i] == candidate)
                count++;
        return count > size / 2;
    }
}
