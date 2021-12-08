package ch10;

import java.util.Calendar;

public class CalendarEx3 {
    public static void main(String[] args) {
        final int[] TIME_UNIT = {3600, 60, 1}; // 앞에서부터 큰 단위
        final String[] TIME_UNIT_NAME = {"시", "분", "초"};
        StringBuilder sb = new StringBuilder();

        Long difference = 0L;

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        System.out.printf("time1: %d시 %d분 %d초\n",time1.get(Calendar.HOUR_OF_DAY), time1.get(Calendar.MINUTE),time1.get(Calendar.SECOND));
        System.out.printf("time2: %d시 %d분 %d초\n",time2.get(Calendar.HOUR_OF_DAY), time2.get(Calendar.MINUTE),time2.get(Calendar.SECOND));

        difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
        System.out.printf("time1과 time2는 %d초 차이\n", difference);

        for(int i = 0; i < TIME_UNIT.length; i++) {
            sb.append(difference/TIME_UNIT[i] + TIME_UNIT_NAME[i]);
            difference %= TIME_UNIT[i];
        }
        System.out.printf("시간으로 변환하면 %s입니다.\n",sb.toString());

    }
}
