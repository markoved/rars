package rars.riscv.instructions;

public class ZEXTH extends ImmediateEncodedInstruction{

    public ZEXTH() {
        super("zext.h t1,t2", "Zero-extend the least-significant halfword in t2 and save it in t1",
                "000010000000", "100");
        // TODO: change opcode in Verilog-code (it's R-type in specs for some reason and here it's I-type)
    }

    @Override
    protected long compute(long value, long immediate) {
        // TODO: compute the result
        return value;
    }
}
