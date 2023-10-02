class Solution {

    public static void main(String[] args) {

        System.out.println((int)'a');
        System.out.println((int)'z');
        System.out.println((int)'A');
        System.out.println((int)'Z');

        System.out.println(new Solution().solution("a F z",4));
    }

    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) != ' ') {

                if((int)s.charAt(i) + n >= 65 && (int)s.charAt(i) + n <= 90) {
                    answer += String.valueOf((char)((int)s.charAt(i) + n));
                } else if((int)s.charAt(i) + n > 90 && (int)s.charAt(i) + n < 97) {
                    answer += "A";
                } else if((int)s.charAt(i) + n > 122){
                    answer += "a";
                } else {
                    answer += String.valueOf((char)((int)s.charAt(i) + n));
                }

            } else {
                //answer += " ";
            }

        }

        return answer;
    }
}