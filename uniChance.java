import java.util.Scanner;

  class Main {
    public static void main(String[] args) {
    System.out.println("Okay, Hello- So You would like to know if UNI is for you? ");
    System.out.println("I will ask you a set of questions 10 in total, answer with 0 for No or 1 for Yes");



    System.out.println("---Let's Begin---\n");

    System.out.println("Do you have $40,000 laying around? 0 or 1");
    Scanner q1 = new Scanner(System.in);
    int Q1 = q1.nextInt();

    System.out.println("Are you okay with speding 40 plus hours in UNI? 0 or 1");
    Scanner q2 = new Scanner(System.in);
    int Q2 = q2.nextInt();

    System.out.println("Are you okay with speding 40 plus hours in UNI? 0 or 1");
    Scanner q3 = new Scanner(System.in);
    int Q3 = q3.nextInt();

    System.out.println("Are you okay with speding 40 plus hours in UNI? 0 or 1");
    Scanner q4 = new Scanner(System.in);
    int Q4 = q4.nextInt();

    System.out.println("Are you okay with speding 40 plus hours in UNI? 0 or 1");
    Scanner q5 = new Scanner(System.in);
    int Q5 = q5.nextInt();

    System.out.println("Are you okay with speding 40 plus hours in UNI? 0 or 1");
    Scanner q6 = new Scanner(System.in);
    int Q6 = q6.nextInt();

    System.out.println("Are you okay with speding 40 plus hours in UNI? 0 or 1");
    Scanner q7 = new Scanner(System.in);
    int Q7 = q7.nextInt();

    System.out.println("Are you okay with speding 40 plus hours in UNI? 0 or 1");
    Scanner q8 = new Scanner(System.in);
    int Q8 = q8.nextInt();

    System.out.println("Are you okay with speding 40 plus hours in UNI? 0 or 1");
    Scanner q9 = new Scanner(System.in);
    int Q9 = q9.nextInt();

    System.out.println("Are you okay with speding 40 plus hours in UNI? 0 or 1");
    Scanner q10 = new Scanner(System.in);
    int Q10 = q10.nextInt();


    int ans = (Q1+Q2+Q3+Q4+Q5+Q6+Q7+Q8+Q9+Q10)*10;
    System.out.println("you'r chances of enjoying school is ");
    System.out.println(ans);
  }
}
