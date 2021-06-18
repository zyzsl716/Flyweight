import java.util.HashMap;

public class WebSiteFactory {
  private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

  public WebSite getWebSiteCategory(String type) {
    if (!pool.containsKey(type)) {
      pool.put(type,new ConcreteWebSite(type));
    }

    return (WebSite) pool.get(type);
  }

//  获得网站分类个数
  public int getWebSiteCount() {
    return pool.size();
  }
}
