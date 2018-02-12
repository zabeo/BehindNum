package model;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.swing.DefaultListModel;

import org.json.JSONObject;

public class Richiesta {
	
	private String traduzione,essenziale;
	private JSONObject o;
	
	public String send(String indirizzo)  {
		String s= null;
		 try {
			URL url = new URL(indirizzo);
			HttpURLConnection c =((HttpURLConnection) url.openConnection());
			
			c.connect();
			
			InputStream in = c.getInputStream();
			Scanner sc = new Scanner(in);
			
			s = sc.nextLine();
			
			sc.close();
			in.close();
			c.disconnect();
			
			
		} catch (MalformedURLException e1) {e1.printStackTrace();} catch (IOException e) {e.printStackTrace();}
		 return s;
	}

	public String send_Tradotto(String indirizzo,String lang)  {
		String m = null;
		 try {
			URL url = new URL(indirizzo);
			HttpURLConnection c =((HttpURLConnection) url.openConnection());
			
			c.connect();
			
			InputStream in = c.getInputStream();
			Scanner sc = new Scanner(in);
			
			m = traduzione(sc.nextLine(),lang);
			sc.close();
			in.close();
			c.disconnect();
			
			
		} catch (MalformedURLException e1) {e1.printStackTrace();} catch (IOException e) {e.printStackTrace();}
		 return m;
	}
	
	public String traduzione(String testo,String lang)  {
		 try {
			testo=URLEncoder.encode(testo, "UTF-8");
			URL url = new URL("https://translate.yandex.net/api/v1.5/tr.json/translate?key=trnsl.1.1.20180212T122028Z.30fc82e7648ce611.61d60babbf7e1a0fa32691406ec6df6900b25793&text="+testo+"&lang="+lang);
			HttpURLConnection c =((HttpURLConnection) url.openConnection());
			
			c.connect();
			
			InputStream in = c.getInputStream();
			Scanner sc = new Scanner(in);
			
			traduzione=sc.nextLine();
			this.o = new JSONObject(traduzione);
			essenziale = o.getJSONArray("text").getString(0);
			
			sc.close();
			in.close();
			c.disconnect();
			
			
		} catch (MalformedURLException e1) {e1.printStackTrace();} catch (IOException e) {e.printStackTrace();}
		return essenziale;
	}
}