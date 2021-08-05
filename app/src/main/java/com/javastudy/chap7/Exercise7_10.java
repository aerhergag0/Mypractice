package com.javastudy.chap7;
// 멤버 변수를 클래스 외부에서 접근 할수 없도록 제어자를 붙이고
// 이 멤버 변수들의 값을 어디서나 읽고 변경할 수 있도록 getter, setter를 추가하라.

// 7-11 이전 채널로 이동하는 매서드를 추가
// gotoPrevChannel 현재 채널을 이전채널로 변경
class MyTv2 {
	private boolean isPowerOn;
	private int     channel;
	private int     volume;
	private int     prev_channel;
	final int MAX_VOLUME  = 100;
	final int MIN_VOLUME  = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		prev_channel = this.channel;
		this.channel = channel;
	}

	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public void gotoPrevChannel() {
		setChannel(prev_channel);
	}
}

class Exercise7_10 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}
