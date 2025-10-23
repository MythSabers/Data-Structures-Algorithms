public class DisjointSet {
    public static void main(String[] args) {
        System.out.println("Disjoint Set Implementation");
    }
}

class DisjointSetImpl {
    int[] parent;
    void initialize(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return find(parent[x]);
    }

    void union(int x, int y) {
        int x_rep = find(x);
        int y_rep = find(y);
        if (x_rep == y_rep) {
            return;
        }
        parent[y_rep] = x_rep;
    }
}