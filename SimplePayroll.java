import java.util.*;
class SimplePayroll {
    static String[] names = new String[100];
    static double[] salary = new double[100];
    static int count = 0;
    static int[] undo = new int[100];
    static int ucount = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("\n1.Add employee\n2.Show payroll\n3.Undo last\n4.Exit");
            System.out.println("Choice:");
            int ch = Integer.parseInt(sc.nextLine());
            try {
                if(ch == 1) addEmployee();
                else if(ch == 2) payroll();
                else if(ch == 3) undoLast();
                else if(ch == 4) break;
                else System.out.println("Invalid choice");
            } catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    static void addEmployee() throws Exception {
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter salary:");
        double sal = Double.parseDouble(sc.nextLine());
        if (name.isEmpty() || sal < 0) throw new Exception("Invalid name or salary!");

        names[count] = name;
        salary[count] = sal;
        undo[ucount++] = count;
        count++;
        System.out.println("Employee added");
    }

    static void payroll() throws Exception {
        if(count == 0) throw new Exception("No employees to display!");
        for(int i = 0; i < count; i++) {
            if(names[i] != null) {
                System.out.println(names[i] + " - salary: " + salary[i]);
            }
        }
    }

    static void undoLast() throws Exception {
        if(ucount == 0) throw new Exception("Nothing to undo!");
        int idx = undo[--ucount];
        System.out.println("Removed last added employee: " + names[idx]);
        names[idx] = null;
        salary[idx] = 0;
    }
}