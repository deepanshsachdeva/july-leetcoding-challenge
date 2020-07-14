class Solution {
    public double angleClock(int hour, int minutes) {
        double hour_angle = ((hour%12)*60+minutes)*0.5;
        double minute_angle = minutes*6;
        
        double ans = Math.abs(hour_angle-minute_angle);
        
        return (ans<180) ? ans : 360-ans;
    }
}
