package senghuot.github.com.kakuna;

import senghuot.github.com.kakuna.services.Atomizer;
import senghuot.github.com.kakuna.services.Registration;

/**
 * This is the main application to invoke other services.
 *
 * Ex: java -jar target/microservice-dynamoDB-0.0.1-SNAPSHOT.jar reg 5555
 */
public class Main {

    public static void main(String[] args) {
        String server = "Unknown Server";

        switch (args.length) {
            case 2:
                System.setProperty("server.port", args[1]);

            case 1:
                server = args[0].toLowerCase();
                break;

            default:
                error();
                break;
        }

        if (server.equals("reg") || server.equals("registration")) Registration.main(args);
        else if (server.equals("atomizer")) Atomizer.main(args);
        else error();
    }

    protected static void error() {
        System.out.println("Usage: java -jar <jar file> <server-name> [server-port]");
        System.out.println("server-name: {'reg' or 'registration', 'accounts', 'web'} server-port > 1024");
    }

}
