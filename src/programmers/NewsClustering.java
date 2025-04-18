package programmers;

import java.util.ArrayList;
import java.util.List;

public class NewsClustering {
    public int solution(String str1, String str2) {
        List<String> a = makeSet(str1.toLowerCase());
        List<String> b = makeSet(str2.toLowerCase());

        List<String> inter = new ArrayList<>(a);
        inter.retainAll(b);

        List<String> union = new ArrayList<>(a);
        b.forEach(e -> {
            if (!inter.remove(e)) union.add(e);
        });

        if (union.isEmpty()) return 65536;
        return (int) ((double) inter.size() / union.size() * 65536);
    }

    private List<String> makeSet(String s) {
        List<String> set = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            String sub = s.substring(i, i + 2);
            if (sub.matches("[a-z]{2}")) set.add(sub);
        }
        return set;
    }
}