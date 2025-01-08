package com.example.crud_abiel;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;

import javax.net.ssl.HttpsURLConnection;

public class RequestHandler {
    public String sendRequest(String requestURL,hashMap<String, String> postDataParamas){
        URL url;
        StringBuilder sb = new StringBuilder();
        try{
            url = new URL(requestURL);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

            connection.setReadTimeout(15000);
            connection.setConnectTimeout(15000);
            connection.setRequestMethod("POST");
            connection.setDoInput(true);
            connection.setDoOutput(true);

            OutputStream os = connection.getOutputStream();

            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(os, "UTF-8")
            );
            writer.write(getPostDataString(postDataParamas));
            writer.flush();
            writer.close();
            os.close();
            int responcode = connection.getResponseCode();

            if (responcode == HttpsURLConnection.HTTP_OK){
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                sb = new StringBuilder();
                String response;
                while ((response = br.readLine()) !=null){
                    sb.append(response);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String sendGetRequest(String requestURL){
        StringBuilder sb = new StringBuilder();
        try{
            URL url = new URL(requestURL+id);
            httpURLConnection con = (httpURLConnection) url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new inputStreamReader(con.getInputStream()));
            String s;
            while ((s=bufferedReader.readLine()) != null{
            }
        }
        catch (Exception e){
        }
        return sb.toString()
    }

    public String sendGetRequestParam(String requestURL, String id){
        StringBuilder sb = new StringBuilder();
        try{
            URL url = new URL(requestURL+id);
            httpURLConnection con = (HttpsURLConnection) url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

            String s;
            while((s=bufferedReader.readLine()) != null){
                sb.append(s+"\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return sb.toString();
    }

    private String getPostDataString(HashMap<String, String> params) throws UnsupportedEncodingException{
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (map.Entry<String,String> entry : params.entrySet()){
            if (first)
                first = false;
            else
                    result.append("&");
                result.append(URLEncoder.encode(entry.getKey(),"UTF-8"));
                result.append("=");
                result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }
        return result.toString();
    }
}
