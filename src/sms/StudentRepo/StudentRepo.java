
package sms.StudentRepo;

import sms.objects.Student;

/**
 *
 * @author yathu
 */
public interface StudentRepo {
    public abstract String save(Student student);
    public abstract String update(Student student);
    public abstract String getStudent(int id);
    public abstract String deleteStudent(int id);
    public abstract void getAllStudent();
}
