package DomZad;
/*
Inner
*/

public class JR_30_4_2 {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static JR_30_4_2[] getTwoSolutions() {
        JR_30_4_2[] result = new JR_30_4_2[2];

        JR_30_4_2 solution = new JR_30_4_2();
        solution.innerClasses[0] = solution.new InnerClass();
        solution.innerClasses[1] = solution.new InnerClass();

        JR_30_4_2 solution2 = new JR_30_4_2();
        solution2.innerClasses[0] = solution.new InnerClass();
        solution2.innerClasses[1] = solution.new InnerClass();

        result[0] = solution;
        result[1] = solution2;

        return result;
    }

    public static void main(String[] args) {

    }
}
