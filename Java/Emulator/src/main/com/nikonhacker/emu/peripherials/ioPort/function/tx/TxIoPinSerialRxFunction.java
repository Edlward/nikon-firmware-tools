package com.nikonhacker.emu.peripherials.ioPort.function.tx;

import com.nikonhacker.Constants;
import com.nikonhacker.emu.memory.listener.tx.TxIoListener;
import com.nikonhacker.emu.peripherials.ioPort.function.AbstractInputPinFunction;

public class TxIoPinSerialRxFunction extends AbstractInputPinFunction {
    private int serialInterfaceNumber;

    public TxIoPinSerialRxFunction(int serialInterfaceNumber) {
        super(Constants.CHIP_LABEL[Constants.CHIP_TX]);
        this.serialInterfaceNumber = serialInterfaceNumber;
    }

    @Override
    public String getFullName() {
        if (serialInterfaceNumber >= TxIoListener.NUM_SERIAL_IF) {
            return componentName + " HSerial Rx " + (serialInterfaceNumber - TxIoListener.NUM_SERIAL_IF);
        }
        else {
            return componentName + " Serial Rx " + serialInterfaceNumber;
        }
    }

    @Override
    public String getShortName() {
        if (serialInterfaceNumber >= TxIoListener.NUM_SERIAL_IF) {
            return "HRXD" + (serialInterfaceNumber - TxIoListener.NUM_SERIAL_IF);
        }
        else {
            return "RXD" + serialInterfaceNumber;
        }
    }

    @Override
    public void setValue(int value) {
        if (logPinMessages) System.out.println("TxIoPinSerialRxFunction.setValue not implemented for pin " + getShortName());
    }

}
