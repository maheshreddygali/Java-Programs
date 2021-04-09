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

class Subchild extends Parent
{
void AnimalType()
{
System.out.println("animal is black and white");
}
}


class Hierarchy
{
public static void main(String[] args)
{
Subchild p1 = new Subchild();
p1.AnimalEat();
p1.AnimalType();

Child p2 = new Child();
p2.AnimalEat();
p2.AnimalTravel();
}
}

