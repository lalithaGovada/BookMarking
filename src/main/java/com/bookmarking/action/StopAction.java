package com.bookmarking.action;

public class StopAction implements Action {
	private String contentId;
    private int streamPosition;

    public StopAction() {
    	super();
    }
    
    public StopAction(String contentId, int streamPosition) {
        this.contentId = contentId;
        this.streamPosition = streamPosition;
    }

    public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public void setStreamPosition(int streamPosition) {
		this.streamPosition = streamPosition;
	}


	public String getContentId() {
        return contentId;
    }

    public int getStreamPosition() {
        return streamPosition;
    }
}
