package simpl.interpreter;

public class IntValue extends Value {

    public final int n;

    public IntValue(int n) {
        this.n = n;
    }

    public String toString() {
        return "" + n;
    }

    @Override
    public boolean equals(Object other) {
        // TODO
        if (other instanceof IntValue)
        {
            return (this.n == ((IntValue)other).n);
        }
        return false;
    }
    public void mark(Mem M)
    {

    }
}
