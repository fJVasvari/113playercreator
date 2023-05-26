package com.example.register_login;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import com.example.register_login.player.Player;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class PutPlayerToDB {
    protected void putDataToDB(Player player, Context context){
        if(!player.getpName().equals("")&&
                !player.getpClass().equals("")&&
                !player.getpGender().equals("")){
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new Runnable() {
                @Override
                public void run() {
                    String[] field = new String[6];
                    field[0] = "pName";
                    field[1] = "pClass";
                    field[2] = "pGender";
                    field[3] = "pHealth";
                    field[4] = "pDamage";
                    field[5] = "pDefense";
                    //
                    String[] data = new String[6];
                    data[0] = player.getpName();
                    data[1] = player.getpClass();
                    data[2] = player.getpGender();
                    data[3] = Integer.toString(player.getpHealth());
                    data[4] = Integer.toString(player.getpDamage());
                    data[5] = Integer.toString(player.getpDefense());
                    PutData putData = new PutData("http://10.0.2.2/playercreatorv/createPlayer.php","POST",field,data);
                    if(putData.startPut()){
                        if(putData.onComplete()){
                            String result = putData.getResult();
                            Toast.makeText(context,result,Toast.LENGTH_SHORT).show();
                            if(result.equals("Player create Succes")){
                                Toast.makeText(context,result,Toast.LENGTH_SHORT).show();
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
