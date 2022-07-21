package ch14;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;
public class ImgTest2 extends Frame {
	Image img;
	public ImgTest2() {	
		String str = "https://pds.joongang.co.kr/news/component/htmlphoto_mmdata/202207/19/4a1aa9ca-fae4-41b1-a01a-2e7200396b8a.jpg";
		try {
			URL url = new URL(str);
			img = Toolkit.getDefaultToolkit().getImage(url);
		} catch (MalformedURLException e) {	}
		setSize(700, 400); setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawImage(img,0,0,this);
	}
	public static void main(String[] args) {
		new ImgTest2();
	}
}