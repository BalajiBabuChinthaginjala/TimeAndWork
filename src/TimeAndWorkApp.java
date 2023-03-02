import java.util.Scanner;

public class TimeAndWorkApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. If A and B can do a piece of work in X and Y days respectively while working\n" +
                "alone, they will together take time to complete it.");
        System.out.println("2. If A , B , C can do a piece of work in X , Y , Z days respectively while\n" +
                "working alone , they will together take time to finish it");
        System.out.println("3.A and B complete a work in x days and B and C complete in y days and A and C complete in z days\n" +
                " how many days A and B and C together to complete");
        System.out.println("4.If x people can do W1 work in D1 days while putting in H1 hours per day,\n" +
                " and if x people can complete W2 work in D2 days while putting in H2 hours per day");
        System.out.println("5. /* if m1 men or w1 women can do a work in d1 days ,then in how many days " +
                "will m2 men and w2 women do the same work*/");
        System.out.println("A and B can do alone a job in x days and y days. They began the work together\n" +
                " but z days before the completion of job, A/B leaves off. In how many days will\n" +
                " the work be completed?");
        System.out.println("Enter your Choice");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter work Done By A");
                double x=sc.nextDouble();
                System.out.println("Enter Work done by B");
                double y=sc.nextDouble();
                System.out.println(WorkingAlone_TogetherToComplete.A_BTogether(x,y));
                break;
            case 2:
                System.out.println("Enter work Done By A");
                double x1=sc.nextDouble();
                System.out.println("Enter Work done by B");
                double y1=sc.nextDouble();
                System.out.println("Enter work Done by C");
                double z1= sc.nextDouble();
                System.out.println(WorkingAlone_TogetherToComplete.A_B_CTogether(x1,y1,z1));
                break;
            case 3:
                System.out.println("Enter the work done by A and B");
                double A_BWork= sc.nextDouble();
                System.out.println("Enter the work done by B and C");
                double B_CWork= sc.nextDouble();
                System.out.println("Enter the work done by A and C");
                double A_CWork= sc.nextDouble();
                System.out.println("1.WorkDone By A,B,C together");
                System.out.println("2.Work done A alone");
                System.out.println("3.Work done B alone");
                System.out.println("4.Work done C alone");
                int choice1= sc.nextInt();
                switch (choice1) {
                    case 1 ->
                            System.out.println(WorkingTogether_AloneToComplete.abc_Together(A_BWork, B_CWork, A_CWork));
                    case 2 -> System.out.println(WorkingTogether_AloneToComplete.a_alone(A_BWork, B_CWork, A_CWork));
                    case 3 -> System.out.println(WorkingTogether_AloneToComplete.b_alone(A_BWork, B_CWork, A_CWork));
                    case 4 -> System.out.println(WorkingTogether_AloneToComplete.c_alone(A_BWork, B_CWork, A_CWork));
                    default -> System.out.println("Enter valid input");
                }
            case 4:
                ChainRule.main(args);
            case 5:
                System.out.println("enter value for no of mans");
                double m1 = sc.nextDouble();
                System.out.println("Enter value for no of women/boys");
                double w1 = sc.nextDouble();
                System.out.println("enter value for no days take to complete");
                double d1 = sc.nextDouble();
                System.out.println("enter no of mens to do the work");
                double m2 = sc.nextDouble();
                System.out.println("enter no of women to do work");
                double w2 = sc.nextDouble();
                double result1 = ChainRule.type1(m1, w1, d1, m2, w2);
                System.out.println("The total no of days to complete the work by " + m2 + " men and " + w2 + " women is: "
                        + result1 + " days");
                break;
            case 6:
                System.out.println("Enter A work");
                double x2= sc.nextDouble();
                System.out.println("Enter B work");
                double y2= sc.nextDouble();
                System.out.println("Enter How many days before A/B leaves");
                double z2= sc.nextDouble();
                System.out.println("Who leaves A/B--enter A or B");
                String input=sc.next();
                if (input.equals("A")){
                    System.out.println(Leaving.leaving_A(x2,y2,z2));
                }else{
                    System.out.println(Leaving.leaving_B(x2,y2,z2));
                }
                break;


        }

    }
}
