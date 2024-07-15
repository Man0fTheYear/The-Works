import java.lang.Math;
public class Storm {
    private final double KnotsToMPH = 1.15;
    // global user-defined types:
    private int beginDate;
    private int duration;
    private String name;
    private int category;
    private int wind;
    private int pressure;

    public Storm(int bdate, int dur, String name, int w, int p) {
        beginDate = bdate;
        duration = dur;
        this.name = name;
        wind = w;
        pressure = p;
    }

    public void setDuration(int d) {
        duration = d;
    }

    public void setWind(int w) {
        wind = w;
    }

    public void setPressure(int p) {
        pressure = p;
    }

    public void reCalculateWindKnots() {
        wind = (int)(Math.round(wind * KnotsToMPH));
    }

    public void SaffirSimpson() {
        // Compute storm category, using the Saffir-Simpson scale
        reCalculateWindKnots();
        if (pressure <= 920 && wind >= 156) {
            category = 5;   // Category 5
        }
        if (pressure > 920 && wind < 156) {
            category = 4;   // Category 4
        }
        if (pressure > 945 && wind < 113) {
            category = 3;   // Category 3
        }
        if (pressure > 965 && wind < 96) {
            category = 2;   // Category 2
        }
        if (pressure > 980 && wind < 83) {
            category = 1;   // Category 1
        }
        if (wind < 64) {
            category = -1;  // Tropical Storm
        }
        if (wind < 34) {
            category = -2;  // Tropical Depression
        }
        if (pressure == 0) {
            category = 0;   // Missing pressure
        }
    }

    public String getName() {
        return name;
    }

    public int getCategory() {
        return category;
    }

    public int getDuration() {
        return duration;
    }

    public int getWind() {
        return wind;
    }
    public int getPressure() {
        return pressure;
    }

    public String toStringSimple() {
        return "Storm info: " + " " + beginDate + " " + duration + " " + name + " " + category + " " + wind + " " + pressure;
    }

    public String toString() {
        return String.format("%9d %8d   %10s %4d %9d %4d\n", beginDate, duration,
                name, category, wind, pressure);
    }
}
