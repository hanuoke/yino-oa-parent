package com.yino.common.config.exception;


import com.yino.common.result.ResultCodeEnum;
import lombok.Data;

@Data
public class YinoException extends RuntimeException {

    private Integer code;//状态码
    private String msg;//描述信息

    /**
     * 通过状态码和错误消息创建异常对象
     * @param code
     * @param msg
     */
    public YinoException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    /**
     * 接收枚举类型对象
     * @param resultCodeEnum
     */
    public YinoException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
        this.msg = resultCodeEnum.getMessage();
    }

    @Override
    public String toString() {
        return "GuliException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
