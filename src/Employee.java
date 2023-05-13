public class Employee {
private int emp_id;
private  String emp_name;
private int emp_ege;
private double emp_salary;
public int getEmp_id() {
    return emp_id;
}
public String getEmp_name(){
    return emp_name;
}
public int getEge() {
    return emp_ege;
}
public double getEmp_salary() {
    return emp_salary;
}
public void setEmp_id(int emp_id) {
    this.emp_id = emp_id;
}
public void setEmp_name(String emp_name) {
    this.emp_name = emp_name;
}
public void setEmp_ege(int emp_ege) {
    this.emp_ege = emp_ege;
}
public void setEmp_salary(double emp_salary) {
    this.emp_salary = emp_salary;
}
}
class RunEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
       e.setEmp_id(702123);
       e.setEmp_name("Nalaka Madushan");
       e.setEmp_ege(26);
       e.setEmp_salary(75000.254);
        System.out.println(e.getEmp_id());
        System.out.println(e.getEmp_name());
        System.out.println(e.getEge());
        System.out.println(e.getEmp_salary());
    }
}