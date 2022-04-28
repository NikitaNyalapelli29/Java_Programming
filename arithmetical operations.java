package basic;

public class Practice {
    public static void main(String[] args) {
        /*
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13
         */

        int first_ans = -5 + (8 * 6);
        System.out.println(first_ans);
        int second_ans = (55+9) % 9;
        System.out.println(second_ans);
        int third_ans = 20 + ((-3*5 )/ 8);
        System.out.println(third_ans);
        int fourth_ans = 5 +( (15 / 3) * 2 )- (8 % 3);
        System.out.println(fourth_ans);
    }
}
