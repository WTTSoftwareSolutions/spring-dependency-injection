package com.wttsoftwaresolutions.springdependencyinjection.config;

import com.wttsoftwaresolutions.springdependencyinjection.examplebeans.FakeDataSource;
import com.wttsoftwaresolutions.springdependencyinjection.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
/*@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})*/
public class PropertyConfig {

    /*@Autowired
    Environment environment;
    */

    @Value("${wttsoftwaresolutions.username}")
    String user;
    @Value("${wttsoftwaresolutions.password}")
    String password;
    @Value("${wttsoftwaresolutions.dburl}")
    String url;
    @Value("${wttsoftwaresolutions.jms.username}")
    String jmsUsername;
    @Value("${wttsoftwaresolutions.jms.password}")
    String jmsPassword;
    @Value("${wttsoftwaresolutions.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        //fakeDataSource.setUser(environment.getProperty("USERNAME"));
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUsername(jmsUsername);
        jmsBroker.setPassword(jmsPassword);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }

    /*@Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
     */
}
