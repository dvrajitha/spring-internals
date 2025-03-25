package com.example.demo.textreader.conf;

import com.example.demo.textreader.DefaultTextFileReader;
import com.example.demo.textreader.TextFileReader;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(TextFileReader.class)
@EnableConfigurationProperties(TextFileProperties.class)
public class TextFileDataReaderAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public TextFileReader textFileReader(TextFileProperties textFileProperties) {
        return new DefaultTextFileReader(textFileProperties.getFilePath());
    }
}
