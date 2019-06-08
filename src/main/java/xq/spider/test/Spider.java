package xq.spider.test;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @author xq2580z 一路向前
 * @github  https://github.com/2387693636
 * e-mail 2387693636@qq.com
 * @date 2019年6月8日
*/
public class Spider {
	public static void main(String[] args) throws Exception {
		//打开浏览器
		
	   CloseableHttpClient httpClient=HttpClients.createDefault();
		//输入网址
	   HttpGet httpGet=new HttpGet("https://github.com/2387693636");
		
		//回车，发送请求 返回响应 使用httpClient对象发起请求
	   CloseableHttpResponse response=httpClient.execute(httpGet);
		
		//服务器响应，返回数据 ，浏览器接收数据
	   
	   //判断状态码
	   if(response.getStatusLine().getStatusCode()==200) {
		   HttpEntity httpEntity=response.getEntity();
		   String context=EntityUtils.toString(httpEntity);
		   System.out.println(context); //打印得到的浏览器内容
	   }
		

	}

}
