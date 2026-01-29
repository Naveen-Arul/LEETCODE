class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) {
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String word = queue.poll();
                char[] chars = word.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char original = chars[i];
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (ch == original) continue;
                        chars[i] = ch;
                        String newWord = new String(chars);
                        if (newWord.equals(endWord)) {
                            return level + 1;
                        }
                        if (set.contains(newWord)) {
                            queue.add(newWord);
                            set.remove(newWord);
                        }
                    }
                    chars[i] = original;
                }
            }
            level++;
        }
        return 0;
    }
}