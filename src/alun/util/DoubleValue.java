package alun.util;

/**
 A wrapper around a modifiable double.
*/

public class DoubleValue implements Comparable<DoubleValue>
{
	public double x = 0;

	public DoubleValue()
	{
	}
	
	public DoubleValue(double d)
	{
		x = d;
	}

	public double value()
	{
		return x;
	}

        public final int compareTo(DoubleValue a)
        {
                return ( x<a.x ? -1 : ( x>a.x ? 1 : 0 ) );
        }

        public final boolean equals(Object o)
        {
                return ((DoubleValue)o).x == x;
        }

        public String toString()
        {
                return x+"";
        }
}
