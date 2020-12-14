//package com.songtian.restaurant.config.merchant;
//
//import com.songtian.restaurant.mapper.merchant.managerMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import javax.servlet.http.HttpSession;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
//        auth.inMemoryAuthentication().passwordEncoder(encoder)
//                .withUser("cool").password(encoder.encode("123")).roles("商家")
//                .and()
//                .withUser("coolboy").password(encoder.encode("1234")).roles("商家");
//    }
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .antMatchers("/**").permitAll();
////                .antMatchers("/showpping/*").hasRole("商家")
////                .antMatchers("/wareHouse").hasRole("商家")
////                .antMatchers("/index").hasRole("商家")
////                .antMatchers("/merchant/**").permitAll()
////                .anyRequest().authenticated()
////                .and()
////                .formLogin()
////                .defaultSuccessUrl("/checkUser")
////                .failureUrl("/login");
//
//    }
//
//}
