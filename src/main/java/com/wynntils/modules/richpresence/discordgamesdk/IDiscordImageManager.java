package com.wynntils.modules.richpresence.discordgamesdk;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.wynntils.modules.richpresence.discordgamesdk.enums.EDiscordResult;
import com.wynntils.modules.richpresence.discordgamesdk.options.DiscordGameSDKOptions;

/**
 * <i>native declaration : line 411</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IDiscordImageManager extends Structure implements DiscordGameSDKOptions {

    /** C type : fetch_callback* */
    public IDiscordImageManager.fetch_callback fetch;
    /** C type : get_dimensions_callback* */
    public IDiscordImageManager.get_dimensions_callback get_dimensions;
    /** C type : get_data_callback* */
    public IDiscordImageManager.get_data_callback get_data;

    /** <i>native declaration : line 412</i> */
    public interface fetch_callback_callback_callback extends Callback, DiscordGameSDKOptions {
        void apply(Pointer callback_data, EDiscordResult result, DiscordImageHandle.ByValue handle_result);
    };

    public interface fetch_callback extends Callback, DiscordGameSDKOptions {
        void apply(IDiscordImageManager manager, DiscordImageHandle.ByValue handle, byte refresh, Pointer callback_data, IDiscordImageManager.fetch_callback_callback_callback callback);
    };

    public interface get_dimensions_callback extends Callback, DiscordGameSDKOptions {
        EDiscordResult apply(IDiscordImageManager manager, DiscordImageHandle.ByValue handle, DiscordImageDimensions dimensions);
    };

    public interface get_data_callback extends Callback, DiscordGameSDKOptions {
        EDiscordResult apply(IDiscordImageManager manager, DiscordImageHandle.ByValue handle, Pointer data, int data_length);
    };

    public IDiscordImageManager() {
        super();
    }

    protected List<String> getFieldOrder() {
        return Arrays.asList("fetch", "get_dimensions", "get_data");
    }

    /**
     * @param fetch          C type : fetch_callback*<br>
     * @param get_dimensions C type : get_dimensions_callback*<br>
     * @param get_data       C type : get_data_callback*
     */
    public IDiscordImageManager(IDiscordImageManager.fetch_callback fetch, IDiscordImageManager.get_dimensions_callback get_dimensions, IDiscordImageManager.get_data_callback get_data) {
        super();
        this.fetch = fetch;
        this.get_dimensions = get_dimensions;
        this.get_data = get_data;
    }

    public IDiscordImageManager(Pointer peer) {
        super(peer);
    }

    public static class ByReference extends IDiscordImageManager implements Structure.ByReference {

    };

    public static class ByValue extends IDiscordImageManager implements Structure.ByValue {

    };
}
