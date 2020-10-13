package servicepush;

public class ServicePush {
    public static void main(String[] args) {
        int z = 0;
        if (false) {
          z = 3;
        }
        z = 1 / z; // Noncompliant, possible division by zero
      
        final String output = "ServicePush";
        System.out.println(output);
    }
}
