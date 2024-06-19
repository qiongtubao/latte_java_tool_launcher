package latte.lib.tool.launcher.kv.tikv;

import java.net.Socket;
import latte.lib.tool.launcher.api.Server;

public abstract class AbstractServer implements Server {
    protected int port;

    public boolean checkPortIsUsed(int port) {
        try {
            Socket socket = new Socket("localhost", port);
            socket.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
