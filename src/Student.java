public class Student
{
    String name;
    int id = 910, grade = 11;



    public Student()
    {
        id = 910;
        grade = 12;
        name = "Victor";
    }
    public Student(String name, int grade, int id)
    {
        this.name = name;
        this.grade = grade;
        this.id = id;



    }//end of 5 constructor


    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    public void setId(int id)
    {
        this.id = id;
    }


    public void getBook(int damage)
    {

    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}
