package com.wynntils.modules.richpresence.discordgamesdk;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.wynntils.modules.richpresence.discordgamesdk.options.DiscordGameSDKOptions;

/**
 * <i>native declaration : line 260</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class DiscordActivityAssets extends Structure implements DiscordGameSDKOptions {

    /** C type : char[128] */
    public byte[] large_image = new byte[128];
    /** C type : char[128] */
    public byte[] large_text = new byte[128];
    /** C type : char[128] */
    public byte[] small_image = new byte[128];
    /** C type : char[128] */
    public byte[] small_text = new byte[128];

    public DiscordActivityAssets() {
        super();
    }

    protected List<String> getFieldOrder() {
        return Arrays.asList("large_image", "large_text", "small_image", "small_text");
    }

    /**
     * @param large_image C type : char[128]<br>
     * @param large_text  C type : char[128]<br>
     * @param small_image C type : char[128]<br>
     * @param small_text  C type : char[128]
     */
    public DiscordActivityAssets(byte large_image[], byte large_text[], byte small_image[], byte small_text[]) {
        super();
        if ((large_image.length != this.large_image.length))
            throw new IllegalArgumentException("Wrong array size !");
        this.large_image = large_image;
        if ((large_text.length != this.large_text.length))
            throw new IllegalArgumentException("Wrong array size !");
        this.large_text = large_text;
        if ((small_image.length != this.small_image.length))
            throw new IllegalArgumentException("Wrong array size !");
        this.small_image = small_image;
        if ((small_text.length != this.small_text.length))
            throw new IllegalArgumentException("Wrong array size !");
        this.small_text = small_text;
    }

    public DiscordActivityAssets(Pointer peer) {
        super(peer);
    }

    public static class ByReference extends DiscordActivityAssets implements Structure.ByReference {

    };

    public static class ByValue extends DiscordActivityAssets implements Structure.ByValue {

    };
}
