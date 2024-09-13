public class Gravity {
    // d = v0*t + 0.5*a*t2
    public double falling(double time, double velo){
        return velo * time + 0.5 * 9.8 * Math.pow(time, 2);
    }
}