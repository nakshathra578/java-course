package recursion;
public class StringPalindrome {
    public static void main(String[] args) {
        String text = "madam";
        if(pal(text, 0, text.length()-1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static Boolean pal(String s, int start, int end){
        if(start == end || start > end) return true;
        if(s.charAt(start) != s.charAt(end)) return false;
        return pal(s, start+1, end-1);
    }
}