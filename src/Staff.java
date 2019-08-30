public class Staff
{
    String name;
    int staffId = 210;



    public Staff()
    {
        staffId = 910;
        name = "Mrs. Rioux";
    }

    public Staff(String name, int staffId)
    {
        this.name = name;
        this.staffId = staffId;



    }//end of 5 constructor
    public String getName()
    {
        return name;
    }

    public int getStaffId()
    {
        return staffId;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setStaffId(int staffId)
    {
        this.staffId = staffId;
    }



    public void getBook(int damage)
    {

    }

    @Override
    public String toString()
    {
        return "Staff{" +
                "name='" + name + '\'' +
                ", staffId=" + staffId +
                '}';
    }
}
