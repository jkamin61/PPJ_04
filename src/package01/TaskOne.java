public class TaskOne {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("initial value = "+i);
        i = i++;
        System.out.println("value after post-incrementation = "+i);
        //Value of i is not incremented because post-incrementation is done after the assignment.
        i = ++i;
        System.out.println("value after pre-incrementation = "+i);
        //Value of i is incremented because pre-incrementation is done before the assignment.
        i = i++ + ++i;
        System.out.println("sum of post-incremented value and pre-incremented = "+i);
        //Value of i is incremented by 1 and then added to the incremented value of i by 1.
    }
}
