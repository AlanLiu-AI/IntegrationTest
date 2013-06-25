namespace AQClient
{
    class TestContext
    {
        public static string Host = "localhost";
        public static string User = "admin";
        public static string Pwd = "admin";

        public static string AcquisitionServiceUrl = "http://" + Host + "/AQUARIUS/AQAcquisitionService.svc";
        public static string AcquisitionServiceBasicUrl = "http://" + Host + "/AQUARIUS/AQAcquisitionService.svc/Basic";
        public static string AcquisitionServiceAqListenerUrl = "http://localhost:8000/AQUARIUS/Service/AQAcquisitionService.svc";
        public static string AcquisitionServiceAqListenerBasicUrl = "http://localhost:8000/AQUARIUS/Service/AQAcquisitionServiceBasic.svc";

        public static string PublishServiceUrl = "http://" + Host + "/AQUARIUS/Publish/AquariusPublishService.svc";
        public static string PublishServiceAqListenerUrl = "http://localhost:8000/AQUARIUS/Service/AquariusPublishService.svc";
        public static string PublishServiceGetAuthTokenUrl = string.Format(
            "http://{0}/AQUARIUS/Publish/AquariusPublishRestService.svc/GetAuthToken?user={1}&encPwd={2}", 
            Host, User, Pwd);
        public static string PublishServiceGetAuthTokenAqListenerUrl = string.Format(
            "http://localhost:8000/AQUARIUS/Service/AquariusPublishRestService.svc/GetAuthToken?user={0}&encPwd={1}", 
            User, Pwd);

    }
}
