package rars.riscv.instructions;

public class CPOP extends ImmediateEncodedInstruction{

    public CPOP() {
        super("cpop t1,t2", "Counts number of 1's (i.e., set bits) in t2 and stores the value in t1",
                "011000000000", "001");
    }

    @Override
    protected long compute(long value, long immediate) {
        String valueString = Long.toBinaryString(value);
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (valueString.charAt(i) == '1') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CPOP clz = new CPOP();
        System.out.println(clz.compute(9, 234));
    }
}
