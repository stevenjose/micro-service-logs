package com.mercantil.logSystem.log.dto;

import javax.validation.constraints.NotNull;

public class LogSystemDTO {

    @NotNull
    private Integer code;

    @NotNull
    private String application;

    @NotNull
    private String message;

    @NotNull
    private Boolean error;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }
}
