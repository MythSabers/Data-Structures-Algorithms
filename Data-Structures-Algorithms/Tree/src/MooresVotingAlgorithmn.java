

class MooresVotingAlgorithmnSoution {
    void findMajorityElement(int[] arr) {
        int cand = findCandidate(arr);
        if (isMajority(cand, arr)) {
            System.out.println(cand);
            return;
        }
        System.out.println("No Majority Found");
    }

    private boolean isMajority(int cand, int[] arr) {
        int m = arr.length / 2;
        int count = 0;
        for (int i : arr)
            if (cand == i)
                count++;
        return count >= m;
    }

    private int findCandidate(int[] arr) {
        int count = 0;
        int maj_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[maj_index])
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return arr[maj_index];
    }

}
public class MooresVotingAlgorithmn {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,4,4,4,4};

        new MooresVotingAlgorithmnSoution().findMajorityElement(arr);

    }
}
