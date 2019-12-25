package com.huawei.redis_demo;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Demo {

    static Socket socket = new Socket();
    public static void start(){
        try{
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw= new OutputStreamWriter(out,"UTF-8");
            PrintWriter pw = new PrintWriter(osw,true);

            //创建scanner读取用户输入的内容
            Scanner scan = new Scanner(System.in);
            while(true){
                pw.println(scan.nextLine());
            }
//            pw.println("");

        }catch(Exception e){

        }finally{
            if(socket != null){
                try{
                    socket.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args){
        start();
    }
}
