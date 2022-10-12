package com.bookmarking.action;

public class PlayAction implements Action {

    private String contentId;
    private int streamPosition;

    public PlayAction() {
    	super();
    }
    
    public PlayAction(String contentId, int streamPosition) {
        this.contentId = contentId;
        this.streamPosition = streamPosition;
    }

    public String getContentId() {
        return contentId;
    }

    public int getStreamPosition() {
        return streamPosition;
    }

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public void setStreamPosition(int streamPosition) {
		this.streamPosition = streamPosition;
	}
}
