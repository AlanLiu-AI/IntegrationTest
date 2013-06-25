package com.aquarius.test;

public class TestContext {

	public static String Host = "localhost";
    public static String User = "admin";
    public static String Pwd = "admin";

    public static String AcquisitionServiceUrl = "http://" + Host + "/AQUARIUS/AQAcquisitionService.svc";
    public static String AcquisitionServiceBasicUrl = "http://" + Host + "/AQUARIUS/AQAcquisitionService.svc/Basic";
    public static String AcquisitionServiceAqListenerUrl = "http://localhost:8000/AQUARIUS/Service/AQAcquisitionService.svc";
    public static String AcquisitionServiceAqListenerBasicUrl = "http://localhost:8000/AQUARIUS/Service/AQAcquisitionServiceBasic.svc";

    public static String PublishServiceUrl = "http://" + Host + "/AQUARIUS/Publish/AquariusPublishService.svc";
    public static String PublishServiceAqListenerUrl = "http://localhost:8000/AQUARIUS/Service/AquariusPublishService.svc";
    public static String PublishServiceGetAuthTokenUrl = String.format(
        "http://{0}/AQUARIUS/Publish/AquariusPublishRestService.svc/GetAuthToken?user={1}&encPwd={2}", 
        Host, User, Pwd);
    public static String PublishServiceGetAuthTokenAqListenerUrl = String.format(
        "http://localhost:8000/AQUARIUS/Service/AquariusPublishRestService.svc/GetAuthToken?user={0}&encPwd={1}", 
        User, Pwd);
    
}
