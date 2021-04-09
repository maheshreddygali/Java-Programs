class DisplayOverloading3
{
   void disp(char c, int num)
   {
       System.out.println("I’m the first definition of method disp");
   }
   void disp(int num, char c)
   {
       System.out.println("I’m the second definition of method disp" );
   }
}
class Sample3
{
   public static void main(String args[])
   {
       DisplayOverloading3 obj = new DisplayOverloading3();
       obj.disp('x', 51 );
       obj.disp(52, 'y');
   }
}
