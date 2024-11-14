package arithmetic;

public class PlusOrMinusOne {
    private int num;

    public PlusOrMinusOne(int x){
            this.num = x;
    }

    public int POMO_get(){
        return num;
    }
    @Override
    public String toString(){
        String temp = String.valueOf(this.num);
        return temp;
    }

    public static PlusOrMinusOne[] values(){
        PlusOrMinusOne temp1 = new PlusOrMinusOne(1);
        PlusOrMinusOne temp2 = new PlusOrMinusOne(-1);
        return new PlusOrMinusOne[]{temp1,temp2};
    }

    int negative = -1;
    int positive = 1;


}
