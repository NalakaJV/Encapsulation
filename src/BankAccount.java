public class BankAccount {
    private long acc_no;
    private String name, email;
    private double amount;
    public long getAcc_n() {
        return acc_no;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail () {
        return email;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount (double amount) {
        this.amount = amount;
    }
}
class Run1 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAcc_no(1234567890);
        ba.setName("Nalaka");
        ba.setEmail("nalakamadushan430@gmail.com");
        ba.setAmount(455254.35);
        System.out.println(ba.getAcc_n() + " " + ba.getName() + " " + ba.getEmail() + " " + ba.getAmount());
    }
}
