package logic.commands;

import farmio.exceptions.FarmioFatalException;
import farmio.Farmio;
import frontend.Frontend;
import gameassets.Level;

public class CommandTaskAddReset extends Command {

    /**
     * Print hint or instructions for current level.
     * @param farmio the game which level is used to determine hint.
     * @throws FarmioFatalException if simulation file is not found.
     */
    @Override
    public void execute(Farmio farmio) throws FarmioFatalException {
        Frontend frontend = farmio.getFrontend();
        Level level = farmio.getLevel();
        frontend.simulate(level.getPath(),level.getNarratives().size() - 1);
        frontend.show("Enter [start] if you are ready to complete the objective or Enter [hint] if you get stuck!");
    }
}