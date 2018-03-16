package servicebestpractice.itheima.com.servicebestpractice;

/**
 * Created by Ken on 2018/3/15.
 */

public interface DownloadListener {
    //下载进度
    public void onProgress(int progress);
    //下载成功
    public void onSuccess();
    //下载失败
    public void onFailed();
    //暂停下载
    public void onPaused();
    //取消下载
    public void onCanceled();
}
