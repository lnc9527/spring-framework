package learn.ioc.annotation;

import org.springframework.stereotype.Service;

@Service
public class ScanTestInterfaceImpl3 implements ScanTestInterface {

    @Override
    public void scanTestSay() {
        System.out.println("this is ScanTestInterfaceImpl3");
    }
}
