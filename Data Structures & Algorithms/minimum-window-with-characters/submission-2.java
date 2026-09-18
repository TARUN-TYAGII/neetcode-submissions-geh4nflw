class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";
        HashMap<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int start = 0;
        int formed = 0;
        int left = 0;
        int min = Integer.MAX_VALUE;
        HashMap<Character, Integer> window = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) && need.get(c).intValue() == window.get(c).intValue()) {
                formed++;
            }

            while (formed == need.size()) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (need.containsKey(leftChar) && need.get(leftChar).intValue() > window.get(leftChar).intValue()) {
                    formed--;
                }
                left++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + min);
    }
}
