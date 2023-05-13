public class Run {
    public static void main(String[] args) {
BankAccount ba = new BankAccount();
ba.setAcc_no(1234567890);
ba.setName("Nalaka");
ba.setEmail("nalakamadushan430@gmail.com");
ba.setAmount(455254.35);
        System.out.println(ba.getAcc_n() + " " + ba.getName() + " " + ba.getEmail() + " " + ba.getAmount());
    }
}
