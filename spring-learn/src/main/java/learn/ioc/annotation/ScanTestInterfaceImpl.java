package learn.ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class ScanTestInterfaceImpl implements ScanTestInterface {

    @Override
    public void scanTestSay() {
        System.out.println("this is ScanTestInterfaceImpl");
    }
}
