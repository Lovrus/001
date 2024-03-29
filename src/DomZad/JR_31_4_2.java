package DomZad;
/*
Black box
*/

public class JR_31_4_2 implements Action {
    public static int countActionObjects;

    private int param;

    private Action solutionAction = new Action() {
        private FirstClass first;
        private SecondClass second;

        public void someAction() {
            if (param > 0) {
                if (first == null) {
                    first = new FirstClass() {
                        @Override
                        public void someAction() {
                            super.someAction();
                            JR_31_4_2.this.someAction();
                        }

                        @Override
                        public Action getDependantAction() {
                            System.out.println(param);
                            param--;
                            return param > 0 ? JR_31_4_2.this : this;
                        }
                    };
                }
                first.getDependantAction().someAction();
            } else {
                if (second == null) {
                    second = new SecondClass() {
                        @Override
                        public void someAction() {
                            sb.append(SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM).append(param);
                            super.someAction();

                        }
                    };
                }
                second.someAction();
            }
        }
    };


    public JR_31_4_2(int param) {
        this.param = param;
    }

    @Override
    public void someAction() {
        solutionAction.someAction();
    }

    /**
     * 5
     * 4
     * 3
     * 2
     * 1
     * class FirstClass, method someAction
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = 0
     * Count of created Action objects is 2
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = -1
     * Count of created Action objects is 3
     */
    public static void main(String[] args) {
        JR_31_4_2 solution = new JR_31_4_2(5);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);

        solution = new JR_31_4_2(-1);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);
    }
}