class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        int row = board.length;
        int col = board[0].length;
        List<String> ans = new ArrayList<>();

        for(String word: words){
            boolean flag = false;
            for(int r=0;r<row && !flag;r++){
                for(int c=0;c<col;c++){
                    if(board[r][c] != word.charAt(0)) continue;
                    if(back(board, r, c, word, 0)){
                        ans.add(word);
                        flag=true;
                        break;
                    }
                }
            }
        }
        return ans;
    }

    public boolean back(char[][] board, int r, int c, String word, int i){
        if(i == word.length()) return true;
        if(r<0 || c<0 || r>= board.length || c>= board[0].length || board[r][c]!=word.charAt(i)){
            return false;
        }

        board[r][c]='*';
        boolean res = back(board, r+1, c, word, i+1) ||
                      back(board, r-1, c, word, i+1) ||
                      back(board, r, c+1, word, i+1) ||
                      back(board, r, c-1, word, i+1);

        board[r][c]=word.charAt(i);
        return res;
    }
}
