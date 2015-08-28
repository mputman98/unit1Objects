


public class TrimIt
{
   public static void main(String[] args)
   {
      String sentence1 = "      abc   ";
      String sentence2 = "   def";
      String sentence3 = "ghi         ";
       
      String message = (sentence1 + sentence2 + sentence3);
      
      int Length1 = sentence1.length();
      System.out.println(Length1);
      
      int Length2 = sentence2.length();
      System.out.println(Length2);
      
      int Length3 = sentence3.length();
      System.out.println(Length3);

      System.out.println(message);
   }
}
