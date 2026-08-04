import java.util.Arrays;

class Assign_cookies {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // child pointer
        int j = 0; // cookie pointer

        while (i < g.length && j < s.length) {

            if (s[j] >= g[i]) {
                // Give cookie to child
                i++;
                j++;
            } else {
                // Cookie too small, try next cookie
                j++;
            }
        }

        return i;
    }
}
