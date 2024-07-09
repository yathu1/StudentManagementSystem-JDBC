
package sms;

import sms.Util.SmsDisplay;
import sms.Service.ServiceImpl.StudentServiceImpl;
import sms.Service.StudentService;
import java.util.Scanner;

/**
 *
 * @author yathu
 */
public class SMS {

    public static void main(String[] args) {
          StudentService service = new StudentServiceImpl();
        SmsDisplay.display();
         Scanner scanner = new Scanner(System.in);
        SmsDisplay.display();
        System.out.println("Enter your Choice:");
        int choice = scanner.nextInt();
        
  
        switch (choice) {
                case 1:
                    service.saveStudent();
                    break;
                 case 2:
                    service.updateStudent();
                     break;
                 case 3:
                     service.deleteStudent();
                     break;
                 case 4:
                    service.getAllStudent();
                     break;
                 case 5:
                    service.searchStudent();
                     break;
                case 6:
                    // Exit the application.
                    System.exit(0);
                    break;
                default:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Invalid option. Please enter a valid option between 1 and 6.");
                     SmsDisplay.display();
            }
    }
    
}
