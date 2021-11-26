package com.example.abstractfactorymodel;

/**
 * @author renfurui
 * @create -11-02-10:02
 */
public class Demo {

    private static Application configureApplication(){
        Application app;
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println("osName: "+osName);
        if(osName.equals("mac")){
            factory = new MacOSFactory();
        }else{
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
