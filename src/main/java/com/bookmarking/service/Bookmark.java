package com.bookmarking.service;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Bookmark {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
        
    private String userId;
    private String contentId;
    private int streamPosition;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime timestamp;
    
    
    public Bookmark() {
		super();
	}

	public Bookmark(String userId, String contentId, int streamPosition, LocalDateTime timestamp) {
        this.userId = userId;
        this.contentId = contentId;
        this.streamPosition = streamPosition;
        this.timestamp = timestamp;
    }

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public void setStreamPosition(int streamPosition) {
		this.streamPosition = streamPosition;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public String getContentId() {
		return contentId;
	}

	public int getStreamPosition() {
		return streamPosition;
	}

}
