public class ConcatDemo
{
   public static void main(String[] args)
   {
      String animal1 = "quick brown fox";
      String animal2 = "lazy dog";
      String article = "the";
      String action = "jumps over";
      String space = " ";
      String message = (article + space + animal1 + space + action + space + article + space + animal2);
      System.out.println(message);
   }
}
