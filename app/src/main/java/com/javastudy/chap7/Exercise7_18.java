package com.javastudy.chap7;

// DanceRobot의경우 dance()를 호출하고 SingRobot의 경우 Sing()을 호출..
// 매개변수 Robot r - Robot 인스턴스 혹은 Robot의 자식 인스턴스
class Exercise7_18 {

	public static void action (Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot) r;
			dr.dance();
		}
		else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot) r;
			sr.sing();
		}
		else if(r instanceof DrawRobot) {
			DrawRobot wr = (DrawRobot) r;
			wr.draw();
		}
	}


	public static void main (String[] args) {
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		for (int i = 0; i < arr.length; i++)
		     action(arr[i]);
	}
}

class Robot {
}

class DanceRobot extends Robot {
	void dance () {
		System.out.println("춤을   춥니다.");
	}
}

class SingRobot extends Robot {
	void sing () {
		System.out.println("노래를   합니다.");
	}
}

class DrawRobot extends Robot {
	void draw () {
		System.out.println("그림을   그립니다.");
	}
}
