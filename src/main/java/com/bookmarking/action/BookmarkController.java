package com.bookmarking.action;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookmarking.service.Bookmark;
import com.bookmarking.service.BookmarkingService;

@RestController
@RequestMapping("/api")
public class BookmarkController {

	@Autowired
	BookmarkingService bookmarkService;
	
	@GetMapping("/stop/{userId}")
	public void stopPaying(@PathVariable("userId") String userId,
			@RequestBody StopAction stopAction) {
		LocalDateTime now = LocalDateTime.now();
		Bookmark bookmark = new Bookmark(userId,stopAction.getContentId(),stopAction.getStreamPosition(),now);
		bookmarkService.put(bookmark);
	}

	@GetMapping("/play/{userId}")
	public void startPaying(@PathVariable("userId") String userId,
			@RequestBody PlayAction playAction) {
		LocalDateTime now = LocalDateTime.now();
		Bookmark bookmark = new Bookmark(userId,playAction.getContentId(),playAction.getStreamPosition(),now);
		bookmarkService.put(bookmark);
	}

	@PostMapping("/addbookmark")
	public void addBookmarkes(@RequestBody Bookmark bookmark) {
		bookmarkService.put(bookmark);                                        
	}

	@GetMapping("/getbookmarks/{userId}")
	public @ResponseBody List<Bookmark> getBookmarkes(@PathVariable("userId") String userId) {
		System.out.println("userId: "+userId);
		return (List<Bookmark>) bookmarkService.get(userId);
	}
}
