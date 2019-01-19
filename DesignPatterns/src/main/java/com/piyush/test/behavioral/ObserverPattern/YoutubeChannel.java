package com.piyush.test.behavioral.ObserverPattern;

import java.util.Observable;

public class YoutubeChannel extends Observable {

	private String updateVideo;

	public String getUpdateVideo() {
		return updateVideo;
	}

	public void setUpdateVideo(String updateVideo) {
		this.updateVideo = updateVideo;
		setChanged();
	}
	
}
