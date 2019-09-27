
package jkvtr18library;

import classes.App;



public class JKVTR18Library {
    
    public static void main(String[] args) {
        String flag ="base";
        if(args !=null ){
            flag = args[0];
        }
        App app = new App(flag);
        app.run();
    }
    
}
