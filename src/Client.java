public class Client {
  public static void main(String[] args) {
    WebSiteFactory factory = new WebSiteFactory();
    WebSite webSite1 = factory.getWebSiteCategory("博客");
    WebSite webSite2 = factory.getWebSiteCategory("新闻");
    WebSite webSite3 = factory.getWebSiteCategory("新闻");
    WebSite webSite4 = factory.getWebSiteCategory("新闻");
    webSite1.use(new User("小明"));
    webSite1.use(new User("Tom"));
    webSite1.use(new User("Jack"));
    webSite1.use(new User("小红"));
    System.out.println("网站分类共有:"+factory.getWebSiteCount()+"个");
  }
}
