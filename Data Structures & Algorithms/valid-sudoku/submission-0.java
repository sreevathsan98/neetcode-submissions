class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,HashSet<Character>> row = new HashMap<>();
        HashMap<Integer,HashSet<Character>> col = new HashMap<>();
        HashMap<String,HashSet<Character>> cell = new HashMap<>();
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char c = board[i][j];
                String squareKey = i/3+","+j/3;
                if(c!='.'){
                    if(!row.containsKey(i)){
                        row.put(i,new HashSet<>());
                    }
                    if(!col.containsKey(j)){
                        col.put(j,new HashSet<>());
                    }
                    if(!cell.containsKey(squareKey)){
                        cell.put(squareKey,new HashSet<>());
                    }
                    if(row.get(i).contains(c)||col.get(j).contains(c)||
                    cell.get(squareKey).contains(c)){
                        return false;
                    }
                    row.get(i).add(c);
                    col.get(j).add(c);
                    cell.get(squareKey).add(c);
                }
            }
        }
        return true;

    }
}
