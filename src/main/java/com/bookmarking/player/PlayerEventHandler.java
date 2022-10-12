package com.bookmarking.player;

import com.bookmarking.action.Action;

public interface PlayerEventHandler {

    /**
     * @param eventType      should handle `Started`, `Stopped`
     * @param contentId      a unique identifier which represents a content (TV shows, Movie, Commercials)
     * @param streamPosition is an offset to the beginning of the content in seconds
     * @return next action for the player
     */
    Action handleEvent(EventType eventType, String userId, String contentId, int streamPosition);

}
