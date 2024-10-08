package com.gugulethugillz.zip_metrics_tool.common;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
public class ApiResponse<T> implements Serializable {

    private int status;
    private String message;
    private T body;

    public ApiResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public ApiResponse(int status, String message, T body) {
        this.status = status;
        this.message = message;
        this.body = body;
    }

    public ApiResponse(int status, T body) {
        this.status = status;
        this.body = body;
    }

}
