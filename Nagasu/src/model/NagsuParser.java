package model;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class NagsuParser {
	public Nagasu getNagasu(String urlString) {
		Nagasu nagasu=null;
		HttpURLConnection con=null;
		JsonReader reader=null;

		try {
			URL url=new URL(urlString);
			con=(HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			InputStream is=con.getInputStream();
			InputStreamReader isr=new InputStreamReader(is,"utf-8");
			reader=new JsonReader(isr);
			nagasu=new Gson().fromJson(reader,Nagasu.class);
		} catch (MalformedURLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return nagasu;
	}
}
