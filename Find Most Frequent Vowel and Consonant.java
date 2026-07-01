class Solution {
    public int maxFreqSum(String s) {

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;

        int mv = 0, mc = 0;
        for (int i = 0; i < 26; i++) {
            if (i == 0 || i == 4 || i == 8 || i == 14 || i == 20) {
                if (freq[i] > mv) mv = freq[i];
            } else if (freq[i] > mc) mc = freq[i];
        }
        return mc + mv;
    }
}