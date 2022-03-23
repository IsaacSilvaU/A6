package org.adaschool.tdd.exception.WeatherReportError;

import org.springframework.http.HttpStatus;

public class ErrorResponseDto {
    String message;

    ErrorCodeEnum errorCode;

    int httpStatus;

    public ErrorResponseDto( String message, ErrorCodeEnum errorCode, HttpStatus httpStatus )
    {
        this.message = message;
        this.errorCode = errorCode;
        this.httpStatus = httpStatus.value();
    }

    public String getMessage()
    {
        return message;
    }

    public ErrorCodeEnum getErrorCode()
    {
        return errorCode;
    }

    public int getHttpStatus()
    {
        return httpStatus;
    }
}
