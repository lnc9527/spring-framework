package learn.ioc.annotation;

import org.springframework.stereotype.Component;

/**
 * @author: xuzhilin@kaike.la
 * @date: 2021/5/10 10:58
 * @description:
 */
@Component
public class ScanTestInterfaceImpl implements ScanTestInterface {

    @Override
    public void scanTestSay() {
        System.out.println("this is ScanTestInterfaceImpl");
    }
}
