package builderdemo;

public  class PhoneBuilder {

    String osName, ramSize, processor,screenSize,battery;

    public PhoneBuilder setOsName(String osName) {
        this.osName = osName;
        return this;
    }

    public PhoneBuilder setRamSize(String ramSize) {
        this.ramSize = ramSize;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public Phone getphone(){

        return  new Phone("Android","2000","1,3ghz","full","4000mah");
    }
}
