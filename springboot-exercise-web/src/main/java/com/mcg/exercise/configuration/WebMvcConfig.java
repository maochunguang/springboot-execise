package com.mcg.exercise.configuration;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.mcg.exercise.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.TimeZone;

/**
 * @author mao
 * Date：2020/12/27
 * Description：统一json输出风格，比如下划线命名，或者驼峰
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/static/login");
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//        for (int i = 0; i < converters.size(); i++) {
//            if (converters.get(i) instanceof MappingJackson2HttpMessageConverter) {
//                ObjectMapper objectMapper = new ObjectMapper();
//                // 统一返回数据的输出风格
//                objectMapper.setPropertyNamingStrategy(new PropertyNamingStrategy.SnakeCaseStrategy());
//                objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//                objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//                objectMapper.setTimeZone(TimeZone.getTimeZone("GMT+8"));
//                MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//                converter.setObjectMapper(objectMapper);
//                converters.set(i, converter);
//                break;
//            }
//        }
    }
}
