package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {
    @Autowired
    D d;
    @Autowired
    User u;
    public void doS() {
        System.out.println("C");
        d.doS();
        System.out.println(u.name);
    }
}
