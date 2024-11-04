//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text1 = new String ("locphihuu@gmail.com");
        String text2 = new String ("!1182999@st.neu.edu.vn");
        String text4 = new String("haidayso3@gmail.com");
        String text3 = "haidayso3@gmail.com";
        String text5 = "haidayso3@gmail.com";

        String[] listtestValid = new String[] {text1,text2,text3,text4,text5};
        String[] listtestInValid = new String[] {"dafdsgsdsafds@fdsddaf",text2 ,"fsdfdf@$@#$#%$.@$%"};
        EmailExample emailExample1 = new EmailExample();
        for (String emailExample : listtestValid) {

            boolean isValid = emailExample1.validate(emailExample);
            System.out.println("Email: " + emailExample + " co tinh hop le la: " + isValid );
        }
        for (String emailExample : listtestInValid) {
            boolean isInValid = emailExample1.validate(emailExample);
            System.out.println("Email: " + emailExample + " co tinh hop le la: " + isInValid);
        }



    }
}