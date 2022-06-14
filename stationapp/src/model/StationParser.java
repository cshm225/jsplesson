package model;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

public class StationParser {
	//作成したいlistをnew
	public List<Station> getList(String urlString){
			List<Station> list=new ArrayList<>();
			//スコープをあげるためここで宣言
			JsonReader reader=null;
			HttpURLConnection con=null;
			try {
				//urlの文字列からURLインスタンスを作成
				URL url=new URL(urlString);
				//openConnectionで接続
				con=(HttpURLConnection) url.openConnection();
				//GETによるリクエスト
				con.setRequestMethod("GET");
				//データ取得
				InputStream is=con.getInputStream();
				//スプーンからコップで効率化
				InputStreamReader isr=new InputStreamReader(is,"UTF-8");
				//インプットストリームリーダーインスタンスからJsonReadrインスタンスを作成できる。
				reader=new JsonReader(isr);
				//GsonをnewしてfromJsonメソッドを用いてルート要素を取得する(今回ルートはオブジェクト)
				JsonObject root=new Gson().fromJson(reader, JsonObject.class);
				//root要素にあるresultプロパティを取得(配列)
				JsonObject response=root.get("response").getAsJsonObject();
				JsonArray station=response.get("station").getAsJsonArray();
				//配列とforは刺身と醤油。JsonArrayはsize()で要素数取得
				for(int i=0;i<station.size();i++){
					//Starインスタンスをnew
					Station stat=new Station();
					//JsonArrayからはget(index)で要素を取得できる(オブジェクト)
					JsonObject sObj=station.get(i).getAsJsonObject();
					//取り出したオブジェクトの情報をStarインスタンスに詰める
					stat.setName(sObj.get("name").getAsString());
					stat.setPrefecture(sObj.get("prefecture").getAsString());
					//Starインスタンスに全ての情報が入ったのでリストにadd
					list.add(stat);
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				if(reader != null){
					try {
						reader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(con !=null){
					con.disconnect();
				}
			}
			return list;
	}
}
