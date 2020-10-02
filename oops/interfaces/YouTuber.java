package oops.interfaces;

public abstract interface YouTuber extends VedioEditor {
	
	abstract void makeVideo();
	
	default void uploadVedio() {
		System.out.println("upload a vedio");
	}

}
