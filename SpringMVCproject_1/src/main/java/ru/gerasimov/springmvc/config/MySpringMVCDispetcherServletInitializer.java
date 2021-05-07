package ru.gerasimov.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMVCDispetcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //в этих классах мы должны передать какую ту конфигурацию
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};//Теперь он знает где находится spring конфигурация
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};//это эквивалентно в web.xml
        // <servlet-mapping>
        //<servlet-name>dispatcher</servlet-name>
        //<url-pattern>/</url-pattern>
        //</servlet-mapping>
    }
}
