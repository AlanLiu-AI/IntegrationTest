using System;
using Aquarius.Webclient;
using NUnit.Framework;

namespace AQClient
{
    [TestFixture]
    class AcquisitionServiceClientTests
    {

        [Test]
        [Category("SoapService")]
        public void GetAuthToken_WsHttpBinding_Succeeds()
        {
            using (var aasClient = AQWSFactory.NewAASClient(TestContext.AcquisitionServiceUrl))
            {
                string token = null;
                Assert.DoesNotThrow(() => token = aasClient.GetAuthToken(TestContext.User, TestContext.Pwd));
                Assert.IsFalse(String.IsNullOrEmpty(token));
            }
        }

        [Test]
        [Category("SoapService")]
        public void GetAuthToken_BasicBinding_Succeeds()
        {
            using (var aasBasicClient = AQWSFactory.NewAASBasicClient(TestContext.AcquisitionServiceBasicUrl, TestContext.User, TestContext.Pwd))
            {
                string token = null;
                Assert.DoesNotThrow(() => token = aasBasicClient.GetAuthToken(TestContext.User, TestContext.Pwd));
                Assert.IsFalse(String.IsNullOrEmpty(token));
            }
        }

        [Test]
        [Category("AqListener")]
        public void GetAuthToken_AqListener_WsHttpBinding_Succeeds()
        {
            using (var aasClient = AQWSFactory.NewAASClient(TestContext.AcquisitionServiceAqListenerUrl))
            {
                string token = null;
                Assert.DoesNotThrow(() => token = aasClient.GetAuthToken(TestContext.User, TestContext.Pwd));
                Assert.IsFalse(String.IsNullOrEmpty(token));
            }
        }

        [Test]
        [Category("AqListener")]
        public void GetAuthToken_AqListener_BasicBinding_Succeeds()
        {
            AASClient aasBasicClient = null;
            string token = null;
            Assert.DoesNotThrow(() => aasBasicClient = AQWSFactory.NewAASBasicClient(TestContext.AcquisitionServiceAqListenerBasicUrl, TestContext.User, TestContext.Pwd));
            Assert.DoesNotThrow(() => token = aasBasicClient.GetAuthToken(TestContext.User, TestContext.Pwd));
            Assert.IsFalse(String.IsNullOrEmpty(token));
        }
    }
}
