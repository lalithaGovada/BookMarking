package com.bookmarking.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmarking.api.repository.BookmarkRepository;


@Service
public class BookmarServiceImpl implements BookmarkingService {

	@Autowired
	BookmarkRepository repo;
	
	@Override
	public void put(Bookmark bookmark) {
		repo.save(bookmark);
	}

	@Override
	public Collection<Bookmark> get(String userId) {
		Collection<Bookmark> bookmarks = repo.findByUserId(userId);
		List<Bookmark> filtered = new ArrayList<>();
		LocalDate toDay = LocalDate.now();
		
		for (Iterator<Bookmark> iterator = bookmarks.iterator(); iterator.hasNext();) {
			Bookmark bookmark = (Bookmark) iterator.next();
			LocalDateTime dateTime = bookmark.getTimestamp();
			LocalDate dateBefore= dateTime.toLocalDate();
		    long months = ChronoUnit.MONTHS.between(dateBefore, toDay);	
		    if(months<=3)
		    	filtered.add(bookmark);
		}
		
		return filtered;
	}

}

