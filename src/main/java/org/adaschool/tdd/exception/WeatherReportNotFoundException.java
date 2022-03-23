package org.adaschool.tdd.exception;

import org.adaschool.tdd.exception.WeatherReportError.WeatherReportErrorDto;
import org.springframework.http.HttpStatus;

public class WeatherReportNotFoundException
    extends RuntimeException
{
    private final WeatherReportErrorDto weatherReportErrorDto;

    private final HttpStatus httpStatus;

    public WeatherReportNotFoundException(WeatherReportErrorDto weatherReportErrorDto, HttpStatus httpStatus) {
        this.weatherReportErrorDto = weatherReportErrorDto;
        this.httpStatus = httpStatus;
    }

    public WeatherReportErrorDto getWeatherReportErrorDto()
    {
        return weatherReportErrorDto;
    }
}
