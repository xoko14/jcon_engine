package com.jcon_engine.objects2D;

import java.util.Comparator;

public class Object2DComparator implements Comparator<Object2D>{
    public int compare(Object2D o1, Object2D o2)
    {
        return ((Integer) o1.drawOrder).compareTo((Integer) o2.drawOrder);
    }
}
