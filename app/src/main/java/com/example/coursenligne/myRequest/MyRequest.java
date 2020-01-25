package com.example.coursenligne.myRequest;

import android.content.Context;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;


public class MyRequest {


    private Context context;
    private RequestQueue queue;
    public MyRequest( Context context, RequestQueue queue){
        this.context=context;
        this.queue=queue;
    }
    public void inscription (final String nom, final String email, final String password, final String password1, final String pseudo, final RegisterCallBack callBack){
        String url = "http://192.168.56.1 /inscription/register.php";
        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("APP", response);
                Map<String,String>errors = new HashMap<>();
                try{
                    JSONObject json = new JSONObject(response);
                    Boolean error = json.getBoolean("error");
                    if(!error){
                        callBack.onSuccess("Vous etes bien inscrit");
                    }else{
                        JSONObject messages = json.getJSONObject("message");
                        if(messages.has("nom")){
                            errors.put("nom", messages.getString("nom"));
                        }
                        if(messages.has("email")) {
                            errors.put("email", messages.getString("email"));
                        }
                        if(messages.has("password")) {
                            errors.put("password", messages.getString("password "));
                        }
                        callBack.inputErrors(errors);
                    }
                }catch (JSONException e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("APP", "ERROR"+ error);
                if(error instanceof NetworkError){
                    callBack.onError("impossible de se connecter");
                }else if (error instanceof VolleyError){
                    callBack.onError("une erreur s'est produite actuellement ");
                }
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<>();
                map.put("nom", nom);
                map.put("email", email);
                map.put("password", password);
                map.put("password1", password1);
                map.put("pseudo", pseudo);
                return map;
            }
        };
        queue.add(request);
    }
    public interface RegisterCallBack{
        void onSuccess(String message);
        void inputErrors(Map<String,String> errors);
        void onError(String message);
    }
    public void connexion (final String email, final String password, final LoginCallBack callBack) {
        String url = "http://192.168.56.1/inscription/login.php";
        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                JSONObject json =null;
                try{
                    json = new JSONObject(response);
                    Boolean error = json.getBoolean("error");
                    if(!error){
                        String id = json.getString("id");
                        String nom= json.getString("email");
                        callBack.onSuccess(id, email);
                    }
                }catch (JSONException e){
                    callBack.onError("une erreur 1 ");
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if(error instanceof NetworkError){
                    callBack.onError("impossible de se connecter");
                }else if (error instanceof VolleyError){
                    callBack.onError("une erreur 2 ");
                }
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<>();
                map.put("nom", email);
                map.put("password", password);
                return map;
            }
        };
        queue.add(request);
    }
    public interface LoginCallBack{
        void onSuccess(String id, String nom);
        void onError(String message);
    }

}
