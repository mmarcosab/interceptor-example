package com.example.estudos.interceptor;

import com.example.estudos.annotation.AllowAnnonymous;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Component
public class Interceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        final AllowAnnonymous allowAnnonymous = ((HandlerMethod)handler).getMethod().getAnnotation((AllowAnnonymous.class));

        if(allowAnnonymous != null){
            response.addHeader("Interceptor", "Passou por aqui");
            return true;
        }

        if (request.getHeader("Authorization") == null){
            response.addHeader("Interceptor", "Authorization não enviado");
            log.info("Authorization não enviado.");
            log.info("Validação NOK.");
            return false;
        }
        else if (request.getHeader("Authorization").equals("Teste")) {
            response.addHeader("Interceptor", "Authorization OK");
            log.info("Validação OK.");
            return true;
        } else {
            response.addHeader("Interceptor", "Authorization NOK");
            log.info("Validação NOK.");
            return false;
        }

    }

}












