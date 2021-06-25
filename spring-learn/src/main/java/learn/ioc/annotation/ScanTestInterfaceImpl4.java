package learn.ioc.annotation;

import org.springframework.stereotype.Controller;

/**
 * @author: xuzhilin@kaike.la
 * @date: 2021/5/10 10:58
 * @description:
 */
@Controller
public class ScanTestInterfaceImpl4 implements ScanTestInterface {

    @Override
    public void scanTestSay() {
        System.out.println("this is ScanTestInterfaceImpl3");
    }
}
