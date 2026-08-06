import java.util.*;

public class combination_sum2 {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(candidates, 0, target, current, result);

        return result;
    }

    private static void backtrack(
            int[] candidates,
            int start,
            int remaining,
            List<Integer> current,
            List<List<Integer>> result) {


        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {


            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }


            if (candidates[i] > remaining) {
                break;
            }

            // Choose
            current.add(candidates[i]);

            // Explore
            // i + 1 because each candidate can be used only once
            backtrack(
                    candidates,
                    i + 1,
                    remaining - candidates[i],
                    current,
                    result
            );

            // Undo
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> result = combinationSum2(candidates, target);

        System.out.println("Combinations: " + result);
    }
}