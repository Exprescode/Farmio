package logic.commands;

import farmio.exceptions.FarmioFatalException;
import farmio.Farmio;

public class CommandMenuStart extends Command {

    /**
     * Shows the menu.
     * @param farmio the game which stage is set as MENU_START.
     * @throws FarmioFatalException if simulation file is missing.
     */
    @Override
    public void execute(Farmio farmio) throws FarmioFatalException {
        farmio.getFrontend().showMenu(farmio.getStorage().getSaveExist(), false);
        farmio.setStage(Farmio.Stage.MENU_START);
    }
}
