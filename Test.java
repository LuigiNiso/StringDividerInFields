/**
 * Test
 */
public class Test {

  public static void main(String[] args) {
    String s1 = "Luigi~Niso~NSILGU04E22L419K~1000~";

    StringDivider sd1 = new StringDivider(s1, "~");

    System.out.println(new Contributor(sd1.nextField(), sd1.nextField(), sd1.nextField(), Double.parseDouble(sd1.nextField())));
  }
}