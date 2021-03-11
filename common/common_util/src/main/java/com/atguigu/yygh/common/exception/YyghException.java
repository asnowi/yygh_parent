package com.atguigu.yygh.common.exception;

import com.atguigu.yygh.common.result.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 自定义全局异常类
 * @author gaoguanqi
 * @version 1.0
 * @date 2021/3/11 11:50
 */
@Data
@ApiModel(value = "自定义全局异常类")
public class YyghException extends RuntimeException{

    @ApiModelProperty(value = "异常状态码")
    private Integer code;

    /**
     * 通过状态码和错误消息创建异常对象
     * @param code 错误码
     * @param message 错误说明
     */
    public YyghException(Integer code, String message){
        super(message);
        this.code = code;
    }

    /**
     * 接收枚举类型对象
     * @param resultCodeEnum 枚举对象
     */
    public YyghException(ResultCodeEnum resultCodeEnum){
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "YyghException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }

}
