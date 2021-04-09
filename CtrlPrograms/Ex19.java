class Ex19
{
 public static void main(String args[])
 {
  int fact=0;
  for(int i=1;i<=10;i++)
   {
    fact=0;
    for(int j=1;j<=10;j++)
     {
      if(i%j==0)
       fact++;
     }
    if(fact==2)
     System.out.println(i);
   }
 }
}
