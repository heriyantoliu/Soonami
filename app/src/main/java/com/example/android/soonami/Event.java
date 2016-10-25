package com.example.android.soonami;

/**
 * Created by Heriyanto on 10/25/2016.
 */

public class Event {

    public final String title;
    public final long time;
    public final int tsunamiAlert;

    public Event(String eventTitle, long eventTime, int eventTsunamiAlert){
        title = eventTitle;
        time = eventTime;
        tsunamiAlert = eventTsunamiAlert;
    }
}
