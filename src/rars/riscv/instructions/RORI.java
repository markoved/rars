package rars.riscv.instructions;

import rars.ProgramStatement;
import rars.riscv.BasicInstruction;
import rars.riscv.BasicInstructionFormat;
import rars.riscv.hardware.RegisterFile;

public class RORI extends BasicInstruction {

    public RORI() {
        super("rori t1,t2,10", "Right rotation of t2 by the amount in least-significant 5 bits of shamt. The result saved in t1",
                BasicInstructionFormat.I_FORMAT, "0110000 ttttt sssss 101 fffff 0010011");
        // TODO: write new ShamtInstruction abstract class for this class to inherit
    }

//    @Override
//    public long compute(long value, long immediate) {
//        return Long.rotateRight(value, (int) immediate & 0X1F);
//    }

    public void simulate(ProgramStatement statement) {

    }
}

