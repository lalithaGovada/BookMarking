package com.bookmarking.service;

import java.util.Collection;

public interface BookmarkingService {

    /**
     * Add a {@link Bookmark} to the bookmarks store
     * @param bookmark The bookmark to store
     */
    void put(Bookmark bookmark);

    /**
     * Retrieves all {@link Bookmark}s for a given user
     *
     * @param userId a unique identifier which represents a user
     * @return bookmarks
     */
    Collection<Bookmark> get(String userId);

}
