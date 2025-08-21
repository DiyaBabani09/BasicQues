class String4{
    public  static String reverseWords(String s) {
        StringBuilder word=new StringBuilder();
        String ans="";

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }
            else{
                if(word.length()!=0 ){
                    ans+=word.reverse() + " ";
                    word.setLength(0);
                }
            }
        }
        if(word.length()!=0 && word.toString()!="  "){
            ans+=word.reverse();
        }
        
        return ans;
    }
    
    
    public static void main(String args[]){
    String str="the sky is blue";
    
    System.out.println(reverseWords(str));
}
}
