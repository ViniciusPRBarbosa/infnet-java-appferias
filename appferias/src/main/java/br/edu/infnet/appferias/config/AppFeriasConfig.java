package br.edu.infnet.appferias.config;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.edu.infnet.appferias.util.LocalDateFormatter;
import br.edu.infnet.appferias.util.LocalDateTimeFormatter;

@Configuration
public class AppFeriasConfig implements WebMvcConfigurer{
	
	@Override
    public void addFormatters(FormatterRegistry registry) {
		registry.addFormatterForFieldType(LocalDate.class, new LocalDateFormatter());
		registry.addFormatterForFieldType(LocalDateTime.class, new LocalDateTimeFormatter());
    }
}
