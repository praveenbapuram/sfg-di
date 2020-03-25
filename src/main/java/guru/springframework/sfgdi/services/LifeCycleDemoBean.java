package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,ApplicationContextAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("The LifeCycle bean has its bean Factory Set");
    }

    public LifeCycleDemoBean() {
        System.out.println("The LifeCycle Bean Im in Constructor ");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("The LifeCycle Bean Name is "+s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("The LifeCycle Bean Destroy method is called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("The LifeCycle Bean has its properties set ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("The ApplicationContext is set ");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("The LifeCycle Bean Post Construct is called");
    }


    @PreDestroy
    public void preDestroy(){
        System.out.println("The LifeCycle Bean Pre Destroy is called");
    }

    public void beforeInit() {
        System.out.println("The LifeCycle Bean beforeInit is called");
    }

    public void afterInit() {
        System.out.println("The LifeCycle Bean afterInit is called");
    }
}
