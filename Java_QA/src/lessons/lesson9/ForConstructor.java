package lessons.lesson9;

import java.util.Objects;

public class ForConstructor {
    int t,y,u,i;
    String d,g,h;

    public ForConstructor(int t, int y, int u, int i, String d, String g, String h) {
        this.t = t;
        this.y = y;
        this.u = u;
        this.i = i;
        this.d = d;
        this.g = g;
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForConstructor that = (ForConstructor) o;
        return t == that.t && u == that.u && Objects.equals(d, that.d) && Objects.equals(h, that.h);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t, u, d, h);
    }
}
