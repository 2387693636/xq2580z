package xq.spider.test;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @author xq2580z 一路向前
 * @github  https://github.com/2387693636
 * e-mail 2387693636@qq.com
 * @date 2019年6月9日
*/
public class HttpPostTest {

	public static void main(String[] args) {
		//创建HttpClient对象
		CloseableHttpClient httpClient= HttpClients.createDefault();
		
		//创建HttpPost对象
		HttpPost httpPost=new HttpPost("https://www.bilibili.com");
		
		CloseableHttpResponse response=null;
		try {
			//使用HttClient发起请求HttpGet请求
			response=httpClient.execute(httpPost);
			
			//解析响应
			if(response.getStatusLine().getStatusCode()==200) {
				String content=EntityUtils.toString(response.getEntity());
				System.out.println(content.length());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				response.close();  //释放response 
			} catch (IOException e) {
				e.printStackTrace();
			} 
			try {
				httpClient.close();//关闭httpClient
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}

}
