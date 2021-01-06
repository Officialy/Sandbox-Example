package com.sandbox.example;

import org.sandboxpowered.api.SandboxAPI;
import org.sandboxpowered.api.addon.Addon;

public class ExampleAddon implements Addon {

    @Override
    public void init(SandboxAPI api) {
        api.getLog().info("Example mod says ₕₑₗₗₒ!");
    }

}
