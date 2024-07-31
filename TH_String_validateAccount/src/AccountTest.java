// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AccountTest {
    private static AccountExample accountExample;
    private static final String[] validAccount = new String[]{"123abc_", "_abv123", "______", "123456","abcdefgh"};
    private static final String[] invalidAccount = new String[]{".@","12345","1234_","avcde"};

    public static void main(String[] args) {
      accountExample = new AccountExample();
      for (String acount:validAccount){
          boolean isValid = accountExample.validate(acount);
          System.out.println("Account is " + acount + " is valid " + isValid);
      }
      for (String acount:invalidAccount){
          boolean isvalid = accountExample.validate(acount);
          System.out.println("Account is " + acount + " is valid " + isvalid);
      }
    }
}