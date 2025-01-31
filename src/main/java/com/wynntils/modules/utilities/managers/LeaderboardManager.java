/*
 *  * Copyright © Wynntils - 2018 - 2022.
 */

package com.wynntils.modules.utilities.managers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.wynntils.webapi.WebManager;
import com.wynntils.webapi.profiles.LeaderboardProfile;

public class LeaderboardManager {

    private static Map<UUID, LeaderboardProfile> leaderboard = new HashMap<>();

    public static synchronized void updateLeaders() {
        WebManager.getLeaderboard(result -> leaderboard = result);
    }

    public static boolean isLeader(UUID uuid) {
        return leaderboard.containsKey(uuid);
    }

    public static LeaderboardProfile getLeader(UUID uuid) {
        return leaderboard.get(uuid);
    }

}
