package personal.shengyu.memory.config;

import lombok.AllArgsConstructor;
import personal.shengyu.memory.utils.CodeMsg;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class PoetryResult<T> implements Serializable {

    private static final long serialVersionUI = 1L;

    private int code;
    private String message;
    private T data;
    private long currentTimeMillis = System.currentTimeMillis();

    public PoetryResult() {
        this.code = 200;
    }

    public PoetryResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public PoetryResult(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public PoetryResult(T data) {
        this.code = 200;
        this.data = data;
    }

    public PoetryResult(String message) {
        this.code = 500;
        this.message = message;
    }

    public static <T> PoetryResult<T> fail(String message) {
        return new PoetryResult(message);
    }

    public static <T> PoetryResult<T> fail(CodeMsg codeMsg) {
        return new PoetryResult(codeMsg.getCode(), codeMsg.getMsg());
    }

    public static <T> PoetryResult<T> fail(Integer code, String message) {
        return new PoetryResult(code, message);
    }

    public static <T> PoetryResult<T> success(T data) {
//        return new PoetryResult("success", data);
        return new PoetryResult(data);
    }

    public static <T> PoetryResult<T> success() {
        return new PoetryResult();
    }
}
