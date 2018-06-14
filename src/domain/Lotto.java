package domain;

/**
 * 로또볼 추첨 1~45 까지 랜덤숫자 볼갯수는 총 6개 중복 불허 출력은 [5,23,2,40,19,22]
 */
public class Lotto {
	int count;
	String result;
	int[] usedNum = new int[46];
	int[] ball = new int[6];

	public void setBall() {
		for (int i = 0; i < 6;) {
			ball[i] = (int) (Math.random() * 45 + 1);
			if (usedNum[ball[i]] != 10) {
				usedNum[ball[i]] = 10;
				i++;
			}
		}
	}

	public void setCount(int money) {
		count = money / 1000;
	}

	public int getBall1() {
		return ball[0];
	}

	public int getBall2() {
		return ball[1];
	}

	public int getBall3() {
		return ball[2];
	}

	public int getBall4() {
		return ball[3];
	}

	public int getBall5() {
		return ball[4];
	}

	public int getBall6() {
		return ball[5];
	}

	public int getCount() {
		return count;
	}

	public String toString() {
		return String.format("[%d ,  %d ,  %d  , %d  , %d  , %d]\n", ball[0], ball[1], ball[2], ball[3], ball[4],
				ball[5]);
	}
}
