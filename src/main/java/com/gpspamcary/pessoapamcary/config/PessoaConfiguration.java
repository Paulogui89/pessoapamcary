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
        PessoaDTO pessoa1 = new PessoaDTO("Paulo","12345","67890","SP","diadema","Avenida brasil");
        PessoaDTO pessoa2 = new PessoaDTO("Simone","123456","678901","SP","diadema","rua Italia");
        PessoaDTO pessoa3 = new PessoaDTO("Leandro","23456","78901","SP","diadema","rua Paranapanema 42 o sentido da vida");
        PessoaDTO pessoa4 = new PessoaDTO("Simara","234567","789012","SP","diadema","rua Paranapanema");
        PessoaDTO pessoa5 = new PessoaDTO("Carlos","34567","89012","SP","diadema","rua sao carlos");

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
