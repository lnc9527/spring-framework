package learn.ioc.annotation;

import org.springframework.stereotype.Repository;

/**
 * @author: xuzhilin@kaike.la
 * @date: 2021/5/10 10:58
 * @description:
 */
@Repository
public class ScanTestInterfaceImpl5 implements ScanTestInterface {

    @Override
    public void scanTestSay() {
        System.out.println("this is ScanTestInterfaceImpl5");
    }
}
