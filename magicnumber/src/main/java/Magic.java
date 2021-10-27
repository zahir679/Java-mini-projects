public class Magic {
    public static void main(String[] args) {
        int myNumber = 10;
        // refer myNumber as the original number
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive/6;
        System.out.println(stepSix);
    }
}
// myNumber can be changed to any number and the output will always be 3