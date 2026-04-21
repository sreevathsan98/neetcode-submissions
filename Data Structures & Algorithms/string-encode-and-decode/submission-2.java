class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str:strs){
            sb.append(str.length()).append("/:").append(str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        int n = str.length();
        List<String> res = new ArrayList<>();
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<n){
            int delimit = str.indexOf("/:",i);
            int len = Integer.parseInt(str.substring(i,delimit));
            sb.append(str.substring(delimit+2,delimit+2+len));
            i=delimit+2+len;
            res.add(sb.toString());
            sb= new StringBuilder();
        }
        return res;
    }
}
