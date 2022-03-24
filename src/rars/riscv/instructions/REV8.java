package rars.riscv.instructions;

public class REV8 extends ImmediateEncodedInstruction{

    public REV8() {
        super("rev8 t1,t2", "Reverse the order of the bytes in a register",
                "011010011000", "101");
    }

    @Override
    protected long compute(long value, long immediate) {
        return Long.reverseBytes(value);
    }
}
