package com.trackcell.securetalk;

import android.app.Application;
import android.content.Intent;

public class Initialize extends Application
{
    public static String SecureTalkServer = "http://securetalk-sql.sourceforge.net/";
    public static Intent mMessageWorkerService;
    public static long RefreshTime = 5000;

    @Override
    public void onCreate()
    {
        super.onCreate();

        mMessageWorkerService = new Intent(this, MessageWorker.class);
        startService(mMessageWorkerService);
    }
    
    @DebugOnly
    public static String GenerateRandomWords()
    {
        String[] words = new String[] {"Ok ben d'accord", "Comment ca va ?", "Ok demain", "Si tu veux !", "ptdr", "Allez à plus", "Ben d'accord", "S'il vous plait ?", ":)", "Oui"};
        return words[((int) Math.round(Math.random() * 9))];
    }
}