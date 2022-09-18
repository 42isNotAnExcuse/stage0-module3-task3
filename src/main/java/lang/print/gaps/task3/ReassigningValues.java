package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
//        Declare another 3 variables: first, second, third (1,10,100).
//        Make console output of 3 initial vars (first, second, third) each on new line.
//
//        Initialize vars linkToFirst, linkToSecond, linkToThird with the variables first, second, third.
//        Reassign (first, second, third) with the : 15, 6, 4.
//        And write to console all the variables
//        (in the order they were declared), each on a new line. Pay attention to results.

        int first = 1;
        int second = 10;
        int third = 100;
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;

        System.out.printf("%d\n%d\n%d\n", first, second, third);

        first = 15;
        second = 6;
        third = 4;

        System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",
                first, second, third, linkToFirst, linkToSecond, linkToThird);
    }
}
