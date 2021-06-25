package learn.ioc.run;


import learn.ioc.annotation.config.DemoConfig;
import learn.ioc.annotation.Speck;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: xuzhilin@kaike.la
 * @date: 2021/4/19 17:27
 * @description:
 */
public class TrackSpringStart {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        Speck bean = context.getBean(Speck.class);
        bean.say();
    }
}

