package org.phw.eop.api.internal.util;

public class Pair<T1, T2> {

    private T1 t1;
    private T2 t2;

    public Pair(T1 t1, T2 t2) {
        this.setFirst(t1);
        this.setSecond(t2);
    }

    public static <T1, T2> Pair<T1, T2> makePair(T1 t1, T2 t2) {
        return new Pair(t1, t2);
    }

    public T1 getFirst() {
        return t1;
    }

    public void setFirst(T1 t1) {
        this.t1 = t1;
    }

    public T2 getSecond() {
        return t2;
    }

    public void setSecond(T2 t2) {
        this.t2 = t2;
    }

}
