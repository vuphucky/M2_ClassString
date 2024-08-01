// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static PhoneNumberExample phoneNumberExample;

    public static void main(String[] args) {
        String[] validPhone = {"(84)-(0978489648)"};
        String[] invalidPhone = {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

        phoneNumberExample = new PhoneNumberExample();
        for (String phoneNumber:validPhone){
            boolean idValid = phoneNumberExample.isValid(phoneNumber);
            System.out.println("phone: " + phoneNumber + " is valid: " + idValid);
        }
        for (String phone:invalidPhone){
            boolean isValid = phoneNumberExample.isValid(phone);
            System.out.println("phone: " + phone + " is valid: " + isValid);
        }
    }
}