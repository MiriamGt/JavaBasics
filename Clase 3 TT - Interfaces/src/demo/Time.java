package demo;

import java.sql.Timestamp;
import java.time.LocalTime;

public class Time {

    private long start;
    private long end;

    public Time() {
        this.start = 0;
        this.end = 0;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public long start() {
        long milliSeconds = System.currentTimeMillis();
        setStart(milliSeconds);
        return milliSeconds;
    }

    public long stop() {
        long milliSeconds = System.currentTimeMillis();
        setEnd(milliSeconds);
        return milliSeconds;
    }

    public long elapsedTime(long start, long end) {
        return end - start;
    }
}
