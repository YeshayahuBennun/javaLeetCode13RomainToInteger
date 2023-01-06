

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.romanToInt("MC"));

    }

    public int romanToInt(String s) {
        String a = s.toUpperCase();
        char[] charArray = a.toCharArray();
        char prev = ' ';
        int sum = 0;

        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case 'I':
                    prev = charArray[i];
                    sum += 1;
                    break;
                case 'V':
                    if (prev == 'I') {
                        sum--;
                        sum += 4;
                    } else {
                        sum += 5;
                    }
                    prev = charArray[i];
                    break;
                case 'X':
                    if (prev == 'I') {
                        sum--;
                        sum += 9;
                    } else {
                        sum += 10;
                    }
                    prev = charArray[i];
                    break;
                case 'L':
                    if (prev == 'X') {
                        sum -= 10;
                        sum += 40;
                    } else {
                        sum += 50;
                    }
                    prev = charArray[i];
                    break;
                case 'C':
                    if (prev == 'X') {
                        sum -= 10;
                        sum += 90;
                    } else {
                        sum += 100;
                    }
                    prev = charArray[i];
                    break;
                case 'D':
                    if (prev == 'C') {
                        sum -= 100;
                        sum += 400;
                    } else {
                        sum += 500;
                    }
                    prev = charArray[i];
                    break;
                case 'M':
                    if (prev == 'C') {
                        sum -= 100;
                        sum += 900;
                    } else {
                        sum += 1000;
                    }
                    prev = charArray[i];
                    break;
            }
        }
        return sum;
    }
}
