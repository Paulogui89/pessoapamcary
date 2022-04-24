package com.gpspamcary.pessoapamcary.config;

import com.gpspamcary.pessoapamcary.model.Pessoa;
import com.gpspamcary.pessoapamcary.repository.PessoaRepository;
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
    private PessoaRepository repository;

    @Bean
    public void encherTabelaComAlgunsDados(){
        Pessoa pessoa1 = new Pessoa("Paulo","12345","67890","SP","diadema","Avenida brasil");
        Pessoa pessoa2 = new Pessoa("Simone","123456","678901","SP","diadema","rua Italia");
        Pessoa pessoa3 = new Pessoa("Leandro","23456","78901","SP","diadema","rua Paranapanema 42 o sentido da vida");
        Pessoa pessoa4 = new Pessoa("Simara","234567","789012","SP","diadema","rua Paranapanema");
        Pessoa pessoa5 = new Pessoa("Carlos","34567","89012","SP","diadema","rua sao carlos");

        repository.save(pessoa1);
        repository.save(pessoa2);
        repository.save(pessoa3);
        repository.save(pessoa4);
        repository.save(pessoa5);

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
