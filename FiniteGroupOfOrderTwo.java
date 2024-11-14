package arithmetic;

import core.Group;

public class FiniteGroupOfOrderTwo implements Group<PlusOrMinusOne>{
    protected int number1;
    protected int number2;

    public FiniteGroupOfOrderTwo(){
        number1 = -1;
        number2 = 1;
    }
    @Override
    public PlusOrMinusOne binaryOperation(PlusOrMinusOne one, PlusOrMinusOne other) {
        int thisOne = one.POMO_get() * other.POMO_get();
        if(thisOne == 1){
            return new PlusOrMinusOne(1);
        }
        return new PlusOrMinusOne(-1);
    }
    @Override
    public PlusOrMinusOne identity() {
        PlusOrMinusOne i = new PlusOrMinusOne(1);
        return i;
    }
    @Override
    public PlusOrMinusOne inverseOf(PlusOrMinusOne plusOrMinusOne) {
        return plusOrMinusOne;
    }

    @Override
    public PlusOrMinusOne exponent(PlusOrMinusOne t, int k) {
        if (k < 0)
            throw new IllegalArgumentException("The exponent must be a non-negative integer value.");
        return k == 0 ? identity() : binaryOperation(t, exponent(t, k - 1));
    }
}
