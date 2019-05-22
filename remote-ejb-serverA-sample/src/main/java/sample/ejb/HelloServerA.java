package sample.ejb;

import java.util.Properties;
import javax.ejb.Stateful;
import javax.naming.Context;
import javax.naming.InitialContext;
import sample.ejb.HelloServerBRemote;

@Stateful
public class HelloServerA implements HelloServerARemote {
    public String helloServerA() {
        System.out.println("executed helloServerA()");
        return "Hello Server A.";
    }
}
