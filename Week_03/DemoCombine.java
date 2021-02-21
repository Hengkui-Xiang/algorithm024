//组合
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || n < k) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(n, k, 1, path, res);
        return res;
    }
    private void dfs(int n, int k, int index, Deque<Integer> path, List<List<Integer>> res) {
        // 终止条件
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        // 遍历， 搜索起点上界为 n - (k - path.size()) + 1
        for (int i = index; i <= n - (k - path.size()) + 1; i++) {
            path.addLast(i);
            // 下一层
            dfs(n, k, i + 1, path, res);
            path.removeLast();
        }
    }
}
