
package sms.StudentRepo.StudentRepoImpl;

import sms.Config.DbConfig;
import sms.objects.Student;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sms.StudentRepo.StudentRepo;

/**
 *
 * @author yathu
 */
public class StudentRepoImpl implements StudentRepo{
    private final static  DbConfig dbconfig= DbConfig.getInstance();
      
    
    @Override
    public String save(Student student) {
         String sql="INSERT INTO student (name,age,department,district,nic,gender,performance)"
                + " VALUES (?,?,?,?,?,?,?)";
             
        try (Connection con = dbconfig.dbConnection()) {
            
            PreparedStatement ps=con.prepareStatement(sql);
            
                ps.setString(1, student.getName());
                ps.setInt(2, student.getAge());
                ps.setString(3, student.getDepartment());
                ps.setString(4, student.getDistrict());
                ps.setString(5, student.getNic());
                ps.setString(6, student.getGender());
                ps.setInt(7, student.getPerformance());
                
           int row= ps.executeUpdate();
        
           if(row>0){
                return "Successfull";
           }
           else{
                return "Something Went Wrong";

           }
           
        }
        catch(Exception e){
           
            return e.toString();
        }
         
    
    }   

    @Override
    public String update(Student student) {
     
        String sql = "UPDATE student SET name=?, age=?, department=?, district=?,nic=?, gender=?, performance=?  WHERE id=?";  
        try (Connection con = dbconfig.dbConnection()) {
            
            PreparedStatement ps=con.prepareStatement(sql);
            
                ps.setString(1, student.getName());
                ps.setInt(2, student.getAge());
                ps.setString(3, student.getDepartment());
                ps.setString(4, student.getDistrict());
                ps.setString(5, student.getNic());
                ps.setString(6, student.getGender());
                ps.setInt(7, student.getPerformance());
                ps.setInt(8, student.getId());
                
           int row= ps.executeUpdate();
        
           if(row>0){
                return "Successfull";
           }
           else{
                return "Something Went Wrong";

           }
           
        }
        catch(Exception e){
           
            return e.toString();
        }
        }

    @Override
    public String getStudent(int id) {
    
          try {
              
              Connection con = dbconfig.dbConnection();
              CallableStatement cs =con.prepareCall("{call GetByID(?)}");
              cs.setInt(1, id);
              ResultSet rs=cs.executeQuery();
           
           rs.next();
           
           return("\n ID: "+rs.getInt(1) +
                   "\n Name: "+rs.getString(2)+
                   "\n Age: "+rs.getInt(3)+
                   "\n Department: "+rs.getString(4)+
                   "\n District: "+rs.getString(5)+
                   "\n NIC: "+rs.getString(6)+
                   "\n Gender: "+rs.getString(7)+
                   "\n Performance: "+rs.getInt(8)+ " ");
           
          }
          catch (Exception ex) {
              return ex.toString();
          }
           
     }

    @Override
    public String deleteStudent(int id) {
        try{
            Connection con = dbconfig.dbConnection();
         
            String sql="DELETE from student WHERE id= ? ";
            
            PreparedStatement st=con.prepareStatement(sql);
            st.setInt(1, id);
            int row = st.executeUpdate();
            
            if(row>0){
                return "Deleted Successfully";
           }
           else{
                return "Something Went Wrong";

           }
            
        }
        catch(Exception e){
            return e.toString();
        }
    }
    
    @Override
    public void getAllStudent(){
        String sql="SELECT * from student";

        try  {
            Connection con = dbconfig.dbConnection();
            PreparedStatement st=con.prepareStatement(sql);
            ResultSet rs= st.executeQuery(sql);

   
            while(rs.next())
            {
                System.out.println("\n ID: "+rs.getInt(1) +
                   "\n Name: "+rs.getString(2)+
                   "\n Age: "+rs.getInt(3)+
                   "\n Department: "+rs.getString(4)+
                   "\n District: "+rs.getString(5)+
                   "\n NIC: "+rs.getString(6)+
                   "\n Gender: "+rs.getString(7)+
                   "\n Performance: "+rs.getInt(8)+ " ");
            }
        }catch(Exception e){
        }
    }
}
