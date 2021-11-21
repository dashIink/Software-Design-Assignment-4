import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Driver {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        Display.createDisplay();
        Scanner.createScanner();
        CashRegister c =  new CashRegister();
        int x;
        while(true){
            x = Scanner.getText();
            CashRegister.setCurrentProductUPC(x);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
