package com.gpspamcary.pessoapamcary.config;

import com.gpspamcary.pessoapamcary.dto.PessoaDTO;
import com.gpspamcary.pessoapamcary.model.Pessoa;
import com.gpspamcary.pessoapamcary.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class PessoaConfiguration {
    @Autowired
    private PessoaService service;

    @Bean
    public void encherTabelaComAlgunsDados(){
        PessoaDTO pessoa1 = new PessoaDTO("Paulo","000012345","00000067890","SP","diadema","Avenida brasil");
        PessoaDTO pessoa2 = new PessoaDTO("Maria","000123456","00000678901","SP","sao caetano","rua Italia");
        PessoaDTO pessoa3 = new PessoaDTO("Nilton","000023456","00000078901","SP","sao bernardo","rua Paranapanema 42 o sentido da vida");
        PessoaDTO pessoa4 = new PessoaDTO("Otavio","000234567","00000789012","SP","santo andre","avenida popular");
        PessoaDTO pessoa5 = new PessoaDTO("Raissa","000034567","00000089012","SP","sao paulo","rua sao carlos");

        service.save(pessoa1);
        service.save(pessoa2);
        service.save(pessoa3);
        service.save(pessoa4);
        service.save(pessoa5);

    }

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
                "Accept", "Authorization", "Origin, Accept", "X-Requested-With",
                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
                "Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }

}
