public class AutomaticBike {
    private String Switch;
    private String Accelration;

    //setters and getters
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public String getSwitch() {
        return Switch;
    }
    public void setAccelration(String Accelration) {
        this.Accelration = Accelration;
    }
    public String getAccelration() {
        return Accelration;
    }

    //my logic
    public static String switchOff(String user_input) {
        if (!user_input.equals("Off")) {
            return "You are wrong";
        }
        return "Yes Bike Is Off";
    }

    public static String switchOn(String user_input) {
        if (!user_input.equals("On")) {
            return "You are wrong";
        }
        return "Yes Bike Is On";
    }

    //increase acceleration
    public static double  enterGearOne(int user_input) {
        if(user_input > 0 && user_input < 20){
            int v = 16;
            int u = 15;
            int s = 50;
            return (Math.pow(v,2) - Math.pow(u,2)) / (2 * s);
        }
        return 0;
    }
    public static double  enterGearTwo(int user_input) {
        if(user_input > 21 && user_input < 30){
            int v = 26;
            int u = 24;
            int s = 50;
            return (Math.pow(v,2) - Math.pow(u,2)) / (2 * s);
        }
        return 0;
    }

    public static double  enterGearThree(int user_input) {
        if(user_input > 31 && user_input < 40){
            int v = 38;
            int u = 35;
            int s = 50;
            return (Math.pow(v,2) - Math.pow(u,2)) / (2 * s);
        }
        return 0;
    }

    public static double  enterGearFour(int user_input) {
        if(user_input > 40 && user_input < 100){
            int v = 48;
            int u = 44;
            int s = 50;
            return (Math.pow(v,2) - Math.pow(u,2)) / (2 * s);
        }
        return 0;
    }

    //deceleration
    public static double  decreaseGearOne(int user_input) {
        if (user_input > 0 && user_input < 20) {
            int v = 14;
            int u = 15;
            int s = 50;
            return (Math.pow(v, 2) - Math.pow(u, 2)) / (2 * s);
        }
        return 0;
    }

    public static double  decreaseGearTwo(int user_input) {
        if (user_input > 21 && user_input < 30) {
            int v = 22;
            int u = 24;
            int s = 50;
            return (Math.pow(v, 2) - Math.pow(u, 2)) / (2 * s);
        }
        return 0;
    }

    public static double  decreaseGearThree(int user_input) {
        if (user_input > 31 && user_input < 40) {
            int v = 32;
            int u = 35;
            int s = 50;
            return (Math.pow(v, 2) - Math.pow(u, 2)) / (2 * s);
        }
        return 0;
    }

    public static double  decreaseGearFour(int user_input) {
        if (user_input > 41 && user_input < 100) {
            int v = 40;
            int u = 44;
            int s = 50;
            return (Math.pow(v, 2) - Math.pow(u, 2)) / (2 * s);
        }
        return 0;
    }
}
