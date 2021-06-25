package learn.ioc.annotation;

import org.springframework.stereotype.Controller;

@Controller
public class ScanTestInterfaceImpl4 implements ScanTestInterface {

    @Override
    public void scanTestSay() {
        System.out.println("this is ScanTestInterfaceImpl3");
    }
}
