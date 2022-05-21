package practice;

import java.io.IOException;
import java.net.InetAddress;

public class IpScanner {

    public static void CheckHosts(String subnet) throws IOException {
        int timeout=1000;
        for (int i=1;i<50;i++){
            String host=subnet + "." + i;
            String name = InetAddress.getByName(host).getHostName();
            if (InetAddress.getByName(host).isReachable(timeout)){
                System.out.println(host + " is reachable " + name);
            }
        }
    }
}
