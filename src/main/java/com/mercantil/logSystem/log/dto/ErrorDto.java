package com.mercantil.logSystem.log.dto;

public class ErrorDto
{
    public String code;
    public String message;

    public ErrorDto(String code, String message)
    {
        this.code = code;
        this.message = message;
    }
}
