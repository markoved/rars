package rars.riscv.instructions;

import rars.ProgramStatement;
import rars.riscv.BasicInstruction;
import rars.riscv.BasicInstructionFormat;

public class ZEXTH extends BasicInstruction {

    public ZEXTH() {
        super("zext.h t1,t2", "Zero-extend the least-significant halfword in t2 and save it in t1",
                BasicInstructionFormat.I_FORMAT, "000010000000 sssss 100 fffff 0110011");
        // TODO: change opcode in Verilog-code (it's R-type in specs for some reason and here it's I-type)
    }

//    @Override
//    protected long compute(long value, long immediate) {
//        // TODO: compute the result
//        return value;
//    }

    public void simulate(ProgramStatement statement) {

    }
}
