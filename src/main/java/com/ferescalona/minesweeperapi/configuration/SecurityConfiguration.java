package com.ferescalona.minesweeperapi.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/").permitAll();

        http.cors().and().csrf().disable();

//        http.authorizeRequests().antMatchers("/health").permitAll().anyRequest().authenticated()
//                .and().httpBasic().and().formLogin();
    }
}
