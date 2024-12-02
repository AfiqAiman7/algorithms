public class Student
{
    private String studName;
    private int idNum;
    private String facName;
    public Student(String sN,int id,String facNm)
    {
        studName=sN;
        idNum=id;
        facName=facNm;
    }
    public void setStudent(String sN,int id,String facNm)
    {
        studName=sN;
        idNum=id;
        facName=facNm;
    }
    public String getStudName()
    {
        return studName;
    }
    public int getIdNum()
    {
        return idNum;
    }
    public String getFacName()
    {
        return facName;
    }
    public String toString()
    {
        return studName+"#"+idNum+"#"+facName;}
    }