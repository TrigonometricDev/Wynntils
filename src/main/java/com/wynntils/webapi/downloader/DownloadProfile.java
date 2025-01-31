/*
 *  * Copyright © Wynntils - 2018 - 2022.
 */

package com.wynntils.webapi.downloader;

import java.io.File;
import java.util.function.Consumer;

import com.wynntils.webapi.downloader.enums.DownloadAction;

public class DownloadProfile {

    String title, url; File location; DownloadAction action; Consumer<Boolean> onFinish;

    public DownloadProfile(String title, String url, File location, DownloadAction action, Consumer<Boolean> onFinish) {
        this.title = title; this.url = url; this.location = location; this.action = action; this.onFinish = onFinish;
    }

    public String getUrl() {
        return url;
    }

    public File getLocation() {
        return location;
    }

    public String getTitle() {
        return title;
    }

    public DownloadAction getAction() {
        return action;
    }

}
