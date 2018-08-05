package com.heiwig.dfa.netflixeurekanamingserver;

import com.netflix.ribbon.proxy.annotation.Http;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class AdminSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) {
        try {
            http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER)
                    .and().httpBasic().disable().authorizeRequests()
                    .antMatchers(String.valueOf(Http.HttpMethod.GET), "/").hasRole("ADMIN")
                    .antMatchers("/info", "/health").authenticated().anyRequest().denyAll().and().csrf().disable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
