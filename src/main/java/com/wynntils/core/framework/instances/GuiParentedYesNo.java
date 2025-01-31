package com.wynntils.core.framework.instances;

import java.io.IOException;

import com.wynntils.core.utils.Utils;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.client.gui.GuiYesNoCallback;

public class GuiParentedYesNo extends GuiYesNo {

    private final ParentScreenSupplier parentScreenSupplier;

    public GuiParentedYesNo(ParentScreenSupplier parentScreenSupplier, GuiYesNoCallback callback, String messageLine1In, String messageLine2In, int parentButtonClickedIdIn) {
        super(callback, messageLine1In, messageLine2In, parentButtonClickedIdIn);
        this.parentScreenSupplier = parentScreenSupplier;
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        boolean result = button.id == 0;

        Utils.displayGuiScreen(parentScreenSupplier.getClicked(result, this.parentButtonClickedId));

        parentScreen.confirmClicked(result, this.parentButtonClickedId);
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException
    {
        if (keyCode == 1) //escape
        {
            Utils.displayGuiScreen(parentScreenSupplier.getClicked(false, this.parentButtonClickedId));

            //parentScreen is minecraft naming scheme
            parentScreen.confirmClicked(false, this.parentButtonClickedId);
        }
    }

    @FunctionalInterface
    public interface ParentScreenSupplier {
        GuiScreen getClicked(boolean result, int id);
    }
}
