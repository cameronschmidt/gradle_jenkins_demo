package servicetemplatesend;

public class ServiceTemplateSend {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;
        target =+ num; // Noncompliant; target = 3

        final String output = "ServiceTemplateSend";
        System.out.println(output);
    }
}
