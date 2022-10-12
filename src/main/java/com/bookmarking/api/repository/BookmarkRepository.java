package com.bookmarking.api.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bookmarking.service.Bookmark;

public interface BookmarkRepository  extends JpaRepository<Bookmark,Long> {
	//@Query("SELECT * FROM BOOKMARK where USER_ID=?1")
	@Query(value = "SELECT * FROM BOOKMARK WHERE USER_ID = ?1", nativeQuery = true)
	Collection<Bookmark> findByUserId(String userId);
}