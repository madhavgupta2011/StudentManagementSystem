package studentmanagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Madhav Gupta
 */
public class connect {
    public static String getStudent(int rollno) throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");  
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
      Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from student where rollno="+rollno);
            rs.next();
            String name=rs.getString("name");
            st.close();
            con.close();
            return name;
            
    }
    
    /**
     *
     * @param rollno
     * @param name
     * @param dob
     * @param fname
     * @param branch
     * @param year
     * @param section
     * @return
     * @throws Exception
     */
    public static int addStudent(int rollno,String name,Date dob,String fname,String branch,int year,int section) throws Exception
    {
        if(branch==null || year==0 || section==0)
        {
            return 0;
        }
        else
        {
      String query="insert into student values(?,?,?,?,?,?,?)";
      Class.forName("com.mysql.jdbc.Driver");  
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
      PreparedStatement st = con.prepareStatement(query);
      st.setInt(1,rollno);
      st.setString(2,name);
      st.setDate(3,dob);
      st.setString(4,fname);
      st.setString(5,branch);
      st.setInt(6,year);
      st.setInt(7,section);
      int count=st.executeUpdate();
      return count;
        }
        
    }
    public static int DeleteStudent(int rollno) throws ClassNotFoundException, SQLException
    {
        String query="Delete from student where roll_no="+rollno;
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
        Statement st = con.createStatement();
        int count=st.executeUpdate(query);
        return count;
    }
    
}
