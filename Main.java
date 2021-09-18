/*
Coded by James Liang
5. Three positive integers a, b, and c with a < b < c form a Pythagorean triplet if a2 + b2 = c2 . For example, 3, 4, and 5 form a Pythagorean triplet since 32 + 42 = 52. Write a program that first prompts the user for a positive integer and then finds and prints all Pythagorean triplets whose largest member is less than or equal to that integer.
*/

/*
Three Possible Triples
6,8,10
9,12,15
12,16,20
*/
import java.util.Scanner;//importing Scanner

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int hyp, a, b; //delcaring variables
    System.out.println("Enter the hypotenuese:");
    hyp = input.nextInt();//Scanner assigns input to variable
    System.out.println("You picked "+hyp);

    for (int c = hyp; hyp > 1; hyp--)//loops
      {
        for (a=1; a < c; a++)
        {
          for (b=1; b < c; b++)
          {
            if (a*a + b*b == c*c)//determine if the loop's a^2 and b^2 will equal c^2
            {
              if (a<b && b<c)//will only run if a<b<c
              {
                System.out.println("The Pythagorean triplets are:");//printing out results
                System.out.println(a);
                System.out.println(b);
                System.out.println("Hypoteneuse: "+c);
              }
            }
          }
        }
     }
  }
}