package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsBroker;
import guru.springframework.sfgdi.examplebeans.FakeServiceDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String dburl;

    @Value("${guru.jms.username}")
    String jmsUser;

    @Value("${guru.jms.password}")
    String jmsPassword;

    @Value("${guru.jms.url}")
    String jmsURL;

    @Value("${guru.service.endpoint}")
    String serviceURL;

    @Value("${guru.service.secret}")
    String serviceSecret;


    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource=new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(dburl);
        fakeDataSource.setJavaHome(environment.getProperty("JAVA_HOME"));
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJMSSource(){
        FakeJmsBroker fakeJmsBroker=new FakeJmsBroker();
        fakeJmsBroker.setUserName(jmsUser);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsURL);
        return fakeJmsBroker;
    }

    @Bean
    public FakeServiceDetails fakeServiceDetails(){
        FakeServiceDetails fakeServiceDetails=new FakeServiceDetails();
        fakeServiceDetails.setEndpoint(serviceURL);
        fakeServiceDetails.setSecret(serviceSecret);
        return fakeServiceDetails;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
