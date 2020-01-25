package com.example.coursenligne;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {

    private SharedPreferences prefs;
    private  SharedPreferences.Editor editor;
    private  final  static String PREFS_Name ="app_prefs";
    private final  static  int PRIVATE_MODE = 0;
    private  final static String  IS_LOGGED ="islogged";
    private  static  final String EMAIL ="email";
    private  static  final  String ID = "id";
    private Context context;

    public  SessionManager(Context context){
        this.context = context;
        prefs = context.getSharedPreferences(PREFS_Name, PRIVATE_MODE);
        editor = prefs.edit();
    }


    public boolean isLogged(){
        return prefs.getBoolean(IS_LOGGED, false);

    }
    public  String getemail(){
        return  prefs.getString(EMAIL, null);
    }


    public  String getID(){
        return  prefs.getString(ID, null);
    }


    public  void  insertUser(String id, String email){
        editor.putBoolean(IS_LOGGED, true);
        editor.putString(ID, id);
        editor.putString(EMAIL, email);
        editor.commit();
    }


    public  void logout(){

        editor.clear().commit();
    }
}
