import java.util.*;

public class combination_sum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
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
            List<List<Integer>> result
    ){
        if(remaining == 0){
            result.add(new ArrayList(current));
            return;
        }if(remaining < 0){
            return;
        }
        for(int i = start;i< candidates.length;i++){
            current.add(candidates[i]);
            backtrack(
                    candidates,
                    i,
                    remaining - candidates[i],
                    current,
                    result
            );
            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = combinationSum(candidates, target);

        System.out.println("Combinations: " + result);
    }
}
