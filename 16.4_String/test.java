public class test {

    public static void main(String[] args) {
        String str = "aaabbbccc";
        int count = 1;
        // StringBuilder sb = new StringBuilder();
        String sb = new String();
        for(int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i + 1) && i < str.length()) {
                count++;
            } else {
                sb += str.charAt(i) +""+ count;
                count = 1;
            }
        }
        System.out.println(sb);
    }
}