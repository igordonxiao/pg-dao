package io.igordonxiao.pgdao;

/**
 * �쳣��
 */
public class Ggexcption extends RuntimeException{
    public Ggexcption(String message) {
        super(message);
    }

    public Ggexcption(Throwable cause) {
        super(cause);
    }

    public Ggexcption(String message, Throwable cause) {
        super(message, cause);
    }
}
