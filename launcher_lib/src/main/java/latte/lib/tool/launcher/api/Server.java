package latte.lib.tool.launcher.api;

public interface Server {
    void start() throws Exception;
    void stop() throws Exception;
    String logMatch(String match);
}
