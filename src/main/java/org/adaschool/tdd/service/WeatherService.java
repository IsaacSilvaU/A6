package org.adaschool.tdd.service;

import org.adaschool.tdd.controller.weather.dto.WeatherReportDto;
import org.adaschool.tdd.repository.document.GeoLocation;
import org.adaschool.tdd.repository.document.WeatherReport;

import java.util.List;
import java.util.Optional;

public interface WeatherService
{
    WeatherReport report( WeatherReportDto weatherReportDto );

    Optional<WeatherReport> findById(String id );

    List<WeatherReport> findNearLocation( GeoLocation geoLocation, float distanceRangeInMeters );

    List<WeatherReport> findWeatherReportsByName( String reporter );

}
