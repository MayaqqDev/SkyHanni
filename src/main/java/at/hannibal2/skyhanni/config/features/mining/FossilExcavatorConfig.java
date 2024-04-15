package at.hannibal2.skyhanni.config.features.mining;

import at.hannibal2.skyhanni.config.FeatureToggle;
import com.google.gson.annotations.Expose;
import io.github.notenoughupdates.moulconfig.annotations.Accordion;
import io.github.notenoughupdates.moulconfig.annotations.ConfigEditorBoolean;
import io.github.notenoughupdates.moulconfig.annotations.ConfigOption;

public class FossilExcavatorConfig {

    @Expose
    @ConfigOption(name = "Fossil Excavator Solver", desc = "")
    @Accordion
    public FossilExcavatorSolverConfig solver = new FossilExcavatorSolverConfig();

    @Expose
    @ConfigOption(name = "Excavator Profit Tracker", desc = "")
    @Accordion
    public ExcavatorProfitTrackerConfig profitTracker = new ExcavatorProfitTrackerConfig();

    @Expose
    @ConfigOption(
        name = "Profit Per",
        desc = "Show profit/loss in chat after each excavation. Also include breakdown information on hover."
    )
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean profitPerExcavation = false;

}