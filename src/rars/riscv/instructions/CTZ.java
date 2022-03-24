package rars.riscv.instructions;

public class CTZ extends ImmediateEncodedInstruction{

    public CTZ() {
        super("ctz t1,t2", "Count trailing zero bits: counts trailing zero bits of t2 and stores the value in t1",
                "011000000001", "001");

    }

    @Override
    protected long compute(long value, long immediate) {
        String valueString = Long.toBinaryString(value);
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (valueString.charAt(i) == '1') break;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CTZ ctz = new CTZ();
        System.out.println(ctz.compute(9, 234));
    }
}
