package learn.ioc.annotation;

import org.springframework.stereotype.Repository;

@Repository
public class ScanTestInterfaceImpl5 implements ScanTestInterface {

    @Override
    public void scanTestSay() {
        System.out.println("this is ScanTestInterfaceImpl5");
    }
}
