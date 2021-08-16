package factoryDevices;

import io.cucumber.java.en_scouse.An;

public class FactoryDevice {
    public enum DeviceType{
        ANDROID,
        IOS
    }
    public static IDevice make(DeviceType type){
        IDevice device;
        switch (type){
            case ANDROID:
                device = new Android();
                break;
            case IOS:
                device = new Ios();
                break;
            default:
                device = new Android();
                break;
        }
        return device;
    }
}
