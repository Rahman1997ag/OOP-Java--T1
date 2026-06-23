

public class main
{
    static class Person
{

    public Person()
    {

    }
    public void Introduce()
    {
        System.out.println("Hi!.. I am Person");
    }

}
static class Student extends Person
{

    public Student()
    {
        
    }
    
    @Override
    public void Introduce()
    {
        System.out.println("Hi!.. I am Student");
    }

}
static class Lecturer extends Person
{

    public Lecturer()
    {
        
    }

    @Override
    public void Introduce()
    {
        System.out.println("Hi!.. I am Lecturer");
    }

}

public static void main(String[] Args)
{
    Person person = new Person();
    person.Introduce();

    Student student = new Student();
    student.Introduce();

    Lecturer lecturer = new Lecturer();
    lecturer.Introduce();
}
}
