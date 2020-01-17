package monitor;

import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
        Class<?> anchor = Class.forName("monitor.resources.opened.Anchor");

        URL pack = anchor.getResource("file.txt");
        URL root = anchor.getResource("/file.txt");
        URL meta = anchor.getResource("/META-INF/file.txt");
        URL bytecode = anchor.getResource("Anchor.class");

        System.out.println(pack);
        System.out.println(root);
        System.out.println(meta);
        System.out.println(bytecode);
    }
}
