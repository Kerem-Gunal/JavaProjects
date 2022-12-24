public class PhoneCheck {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("Samsung");
        phone.setModel("Note 3");
        phone.setYear(10);
        System.out.println(phone.toString());
        System.out.println("Is your phone obsolete: "+phone.isObsolete());
    }
}
