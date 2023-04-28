package com.example.register_login.user.register;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import com.example.register_login.MainActivity;
import com.example.register_login.user.User;
import com.vishnusivadas.advanced_httpurlconnection.PutData;


public class RegisterUser {
    protected void putDataToDB(User user, Context context){
        if(!user.getFullname().equals("")&&
                !user.getUsername().equals("")&&
                !user.getEmail().equals("")&&
                !user.getPassword().equals("")){
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new Runnable() {
                @Override
                public void run() {
                    String[] field = new String[4];
                    field[0] = "fullname";
                    field[1] = "username";
                    field[2] = "email";
                    field[3] = "password";
                    //
                    String[] data = new String[4];
                    data[0] = user.getFullname();
                    data[1] = user.getUsername();
                    data[2] = user.getEmail();
                    data[3] = user.getPassword();
                    PutData putData = new PutData("http://10.0.2.2/playercreatorv/signUp.php","POST",field,data);
                    if(putData.startPut()){
                        if(putData.onComplete()){
                            String result = putData.getResult();
                            Toast.makeText(context,result,Toast.LENGTH_SHORT).show();
                            if(result.equals("Sign Up Success")){
                                //Toast.makeText(context,result,Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(context, MainActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent);
                            }else{

                            }
                            Log.i("PutData",result);
                        }
                    }
                }
            });
        }
    }
}
