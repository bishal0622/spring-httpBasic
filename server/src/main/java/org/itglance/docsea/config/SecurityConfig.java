package org.itglance.docsea.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import javax.sql.DataSource;

/**
 * Created by bishal on 5/21/17.
 */
@Configuration
@EnableWebSecurity
@ComponentScan(basePackages = "org.itglance.docsea.config")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource1;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("abc").password("abc123").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("cde").password("cde").roles("USER");
        auth.jdbcAuthentication().dataSource(dataSource1)
                .usersByUsernameQuery("select name, password, enabled from users where name=?")
                .authoritiesByUsernameQuery("select name, role from role where name=?");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/api").hasRole("ADMIN")
                .antMatchers("/api").hasRole("ADMIN")
                .antMatchers("/login").hasRole("ADMIN")
                .antMatchers("/testing").hasRole("USER")
                .antMatchers("/signup").permitAll()
                .anyRequest().permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

    }
}
