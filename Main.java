import java.util.Scanner;


public class Main {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  String line = scan.nextLine();
  Tree<Integer> t = new Tree<Integer>();
  while(!line.equals("done")) {
   t.insert(Integer.parseInt(line));
   line = scan.nextLine();
  }
  t.print();
   System.out.println(t.getHeight());
 }
}