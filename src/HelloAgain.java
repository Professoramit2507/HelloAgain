public class HelloAgain {
    public int getRoll;
    public String name;
    public boolean passed;

    public int getGetRoll() {
        return getRoll;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public void setGetRoll(int getRoll) {
        this.getRoll = getRoll;
    }

    public HelloAgain () {
        //Roll=100;
        name="CSE";
        passed=true;
    }

    public String getName() {
        return name;
    }
public void setName (String n) {
       this.name = n;
}
    public static void main (String [] args ) {
        HelloAgain helloAgain = new HelloAgain ();
        helloAgain.setName("ICE");
        System.out.println(helloAgain.getName());
        //System.out.println(helloAgain.getRoll());
        System.out.println(helloAgain.isPassed());
    }
}
