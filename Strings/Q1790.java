class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2))
            return true;

        int count = 0;
        int fi = 0;
        int si = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count == 1)
                    si = i;
                if (count == 2)
                    fi = i;
            }
        }
        if (count > 2)
            return false;
        return (s2.charAt(fi) == s1.charAt(si)) && (s2.charAt(si) == s1.charAt(fi));

    }
}