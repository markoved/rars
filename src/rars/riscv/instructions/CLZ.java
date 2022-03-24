package rars.riscv.instructions;

public class CLZ extends ImmediateEncodedInstruction{

    public CLZ() {
        super("clz t1,t2", "Count leading zero bits : counts leading zero bits of t2 and stores the value in t1",
                "011000000000", "001");
    }

    @Override
    protected long compute(long value, long immediate) {
        String valueString = Long.toBinaryString(value);
        int digitCount = valueString.length();
        if (value == 0) return 32;
        return 32 - digitCount;
    }

    public static void main(String[] args) {
        CLZ clz = new CLZ();
        System.out.println(clz.compute(9, 234));
    }
}
