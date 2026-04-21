class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str:strs){
            sb.append(str.replace("/","//")).append("/:");
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        int n = str.length();
        List<String> res = new ArrayList<>();
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<n){
            if(i+1<n&&str.charAt(i)=='/'&&str.charAt(i+1)==':'){
                res.add(sb.toString());
                sb= new StringBuilder();
                i+=2;
            }
            else if(i+1<n&&str.charAt(i)=='/'&&str.charAt(i+1)=='/'){
                sb.append(str.charAt(i));
                i+=2;
            }
            else{
                sb.append(str.charAt(i)+"");
                i++;
            }
        }
        return res;
    }
}
