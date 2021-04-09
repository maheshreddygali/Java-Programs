class Parent
{
void AnimalEat()
{
System.out.println("animal is eating");
}
}

class Child extends Parent
{
void AnimalTravel()
{
System.out.println("animal is travelling");
}
}

class SingleInherit
{
public static void main(String[] args)
{
Child p1 = new Child();
p1.AnimalEat();
p1.AnimalTravel();
}
}

